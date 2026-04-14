/*
 * SPDX-FileCopyrightText: 2024 NewPipe contributors <https://newpipe.net>
 * SPDX-FileCopyrightText: 2025 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

import org.gradle.api.DefaultTask
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.tasks.InputFile
import org.gradle.api.tasks.TaskAction

abstract class CheckDependenciesOrder : DefaultTask() {

    @get:InputFile
    abstract val tomlFile: RegularFileProperty

    init {
        group = "verification"
        description = "Checks that each section in libs.versions.toml is sorted alphabetically"
    }

    @TaskAction
    fun run() {
        val file = tomlFile.get().asFile
        require(file.exists()) { "TOML file not found: ${file.path}" }

        val lines = file.readLines()
        val unsortedBlocks = mutableListOf<List<String>>()
        val currentBlock = mutableListOf<String>()
        var previousLine: String? = null
        var previousLineNumber = 0

        fun flushCurrentBlock() {
            if (currentBlock.isNotEmpty()) {
                unsortedBlocks += currentBlock.toList()
                currentBlock.clear()
            }
        }

        fun addViolation(previous: Pair<Int, String>, current: Pair<Int, String>) {
            if (currentBlock.lastOrNull() == "${previous.first}: ${previous.second}") {
                currentBlock += "${current.first}: ${current.second}"
            } else {
                flushCurrentBlock()
                currentBlock += "${previous.first}: ${previous.second}"
                currentBlock += "${current.first}: ${current.second}"
            }
        }

        lines.forEachIndexed { index, line ->
            val trimmedLine = line.trim()
            if (trimmedLine.isEmpty() || trimmedLine.startsWith("#")) return@forEachIndexed
            if (trimmedLine.startsWith("[")) {
                previousLine = null
                previousLineNumber = 0
                flushCurrentBlock()
                return@forEachIndexed
            }

            val currentLineNumber = index + 1
            previousLine?.let { previous ->
                if (previous > line) {
                    addViolation(previousLineNumber to previous, currentLineNumber to line)
                }
            }

            previousLine = line
            previousLineNumber = currentLineNumber
        }

        flushCurrentBlock()

        if (unsortedBlocks.isNotEmpty()) {
            error(
                "The following lines were not sorted:\n" +
                        unsortedBlocks.joinToString("\n\n") { it.joinToString("\n") }
            )
        }
    }
}
