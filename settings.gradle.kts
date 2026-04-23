/*
 * SPDX-FileCopyrightText: 2025 NewPipe e.V. <https://newpipe-ev.de>
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
        maven(url = "https://repo.clojars.org")
    }
}
include (":app")

// Usa una copia  local de NewPipe Extractor descomentando las líneas de abajo.
// Se asume que NewPipe y NewPipe Extractor tienen el mismo directorio padre.
// Si no es así, cambia la ruta en includeBuild().

//includeBuild("../NewPipeExtractor") {
//    dependencySubstitution {
//        substitute(module("com.github.TeamNewPipe:NewPipeExtractor"))
//            .using(project(":extractor"))
//    }
//}
