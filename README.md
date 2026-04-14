<h3 align="center">We are <i>rewriting</i> large chunks of the codebase, to bring about <a href="https://newpipe.net/blog/pinned/announcement/newpipe-0.27.6-rewrite-team-states/#the-refactor">a modern and stable NewPipe</a>! You can download nightly builds <a href="https://github.com/TeamNewPipe/NewPipe-refactor-nightly/releases">here</a>.</h3>
<h4 align="center">Please work on the <code>refactor</code> branch if you want to contribute <i>new features</i>. The current codebase is in maintenance mode and will only receive <i>bugfixes</i>.</h4>

<p align="center"><a href="https://newpipe.net"><img src="assets/new_pipe_icon_5.png" width="150"></a></p>
<h2 align="center"><b>NewPipe</b></h2>
<p align="center">A libre, lightweight streaming front-end for Android.</p>

<p align="center"><a href="https://f-droid.org/packages/org.schabi.newpipe/"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on-en.svg" alt="Get it on F-Droid" width="206"/></a></p>

<p align="center">
<a href="https://github.com/TeamNewPipe/NewPipe/releases" alt="GitHub NewPipe releases"><img src="https://img.shields.io/github/release/TeamNewPipe/NewPipe.svg" /></a>
<a href="https://github.com/TeamNewPipe/NewPipe-nightly/releases" alt="GitHub NewPipe nightly releases"><img src="https://img.shields.io/github/release/TeamNewPipe/NewPipe-nightly.svg?labelColor=purple&label=dev%20nightly" /></a>
<a href="https://github.com/TeamNewPipe/NewPipe-refactor-nightly/releases" alt="GitHub NewPipe refactor nightly releases"><img src="https://img.shields.io/github/release/TeamNewPipe/NewPipe-refactor-nightly.svg?labelColor=purple&label=refactor%20nightly" /></a>
<a href="https://www.gnu.org/licenses/gpl-3.0" alt="License: GPLv3"><img src="https://img.shields.io/badge/License-GPL%20v3-blue.svg" /></a>
<a href="https://github.com/TeamNewPipe/NewPipe/actions" alt="Build Status"><img src="https://github.com/TeamNewPipe/NewPipe/actions/workflows/ci.yml/badge.svg?branch=dev&event=push" /></a>
<a href="https://hosted.weblate.org/engage/newpipe/" alt="Translation Status"><img src="https://hosted.weblate.org/widgets/newpipe/-/svg-badge.svg" /></a>
</p>

<p align="center">
<a href="https://web.libera.chat/#newpipe" alt="IRC channel: #newpipe"><img src="https://img.shields.io/badge/IRC%20chat-%23newpipe-brightgreen.svg" /></a>
<a href="https://matrix.to/#/#newpipe:matrix.newpipe-ev.de" alt="Matrix channel: #newpipe"><img src="https://img.shields.io/badge/Matrix%20chat-%23newpipe-blue" /></a>
</p>

<hr>

## Overview

NewPipe is a free and open source Android app that provides a privacy-friendly front-end to popular streaming services. It works without requiring a user account, and it avoids proprietary dependencies such as Google Play Services.

This branch is focused on the refactor effort, so please use the <code>refactor</code> branch when contributing new functionality. The stable codebase is in maintenance mode and receives only bug fixes.

## Quick links

- [Website](https://newpipe.net)
- [Blog](https://newpipe.net/blog/)
- [FAQ](https://newpipe.net/FAQ/)
- [Documentation](https://teamnewpipe.github.io/documentation/)
- [Contribution guide](.github/CONTRIBUTING.md)

## Screenshots

[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/00.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/00.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/01.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/01.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/02.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/02.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/03.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/03.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/04.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/04.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/05.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/05.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/06.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/06.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/07.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/07.png)
[<img src="fastlane/metadata/android/en-US/images/phoneScreenshots/08.png" width="160" />](fastlane/metadata/android/en-US/images/phoneScreenshots/08.png)
<br/><br/>
[<img src="fastlane/metadata/android/en-US/images/tenInchScreenshots/09.png" width="405" />](fastlane/metadata/android/en-US/images/tenInchScreenshots/09.png)
[<img src="fastlane/metadata/android/en-US/images/tenInchScreenshots/10.png" width="405" />](fastlane/metadata/android/en-US/images/tenInchScreenshots/10.png)

## Supported services

NewPipe currently supports these platforms:

- YouTube and YouTube Music
- PeerTube and all its instances
- Bandcamp
- SoundCloud
- media.ccc.de

If you want to add a new service, please get in touch before starting work. Our [documentation](https://teamnewpipe.github.io/documentation/) explains how to extend the app and the [NewPipe Extractor](https://github.com/TeamNewPipe/NewPipeExtractor).

## Features

- Watch videos in resolutions up to 4K
- Play audio in the background using only the audio stream
- Popup mode / Picture-in-Picture on supported devices
- Watch live streams
- Toggle subtitles and closed captions
- Search videos, audio, channels, playlists, and albums
- Browse content inside channels
- Subscribe to channels without logging in
- Receive notifications for new uploads from subscribed channels
- Organize channels into groups for easier browsing
- View and search watch history
- Create and manage local playlists
- Download videos, audio, and subtitles
- Open content directly in Kodi
- Watch or block age-restricted material

## Installation and updates

Recommended installation methods:

1. Add the NewPipe repo to F-Droid and install from there.
2. Download the APK from [GitHub Releases](https://github.com/TeamNewPipe/NewPipe/releases) and verify the signing key.
3. Install from F-Droid updates (slower because F-Droid rebuilds and signs packages).
4. Build a debug APK locally (fastest for development, but more complex).
5. Use a PR-specific APK when testing a feature or bugfix from this repository.

Methods 1 and 2 use the same signing key and are compatible with each other. F-Droid package updates are signed by F-Droid and are not compatible with APKs installed from methods 1 or 2. Debug APKs are signed with a separate key and cannot be updated by release-signed builds.

Switching sources safely:

1. Back up your data in Settings > Backup and Restore > Export Database.
2. Uninstall NewPipe.
3. Install the APK from the new source.
4. Restore your data using Settings > Backup and Restore > Import Database.

> **Note:** Only restore databases exported from the same app build type. Importing data from a different APK may corrupt your installation.

### APK signing key

Use this fingerprint to verify official NewPipe APKs signed by the project:

```
CB:84:06:9B:D6:81:16:BA:FA:E5:EE:4E:E5:B0:8A:56:7A:A6:D8:98:40:4E:7C:B1:2F:9E:75:6D:F5:CF:5C:AB
```

## Contribution

Contributions are welcome at every level: bug reports, code, translations, UI improvements, documentation, and more. See our [contribution guide](.github/CONTRIBUTING.md) for details.

<a href="https://hosted.weblate.org/engage/newpipe/">
<img src="https://hosted.weblate.org/widgets/newpipe/-/287x66-grey.png" alt="Translation status" />
</a>

## Donate

If you enjoy NewPipe, consider donating via Liberapay. Donations help keep the project independent and sustainable.

<table>
  <tr>
    <td><a href="https://liberapay.com/TeamNewPipe/"><img src="https://upload.wikimedia.org/wikipedia/commons/2/27/Liberapay_logo_v2_white-on-yellow.svg" alt="Liberapay" width="80px" /></a></td>
    <td><a href="https://liberapay.com/TeamNewPipe/"><img src="assets/liberapay_qr_code.png" alt="Visit NewPipe at liberapay.com" width="100px" /></a></td>
    <td><a href="https://liberapay.com/TeamNewPipe/donate"><img src="assets/liberapay_donate_button.svg" alt="Donate via Liberapay" height="35px" /></a></td>
  </tr>
</table>

## Privacy policy

NewPipe strives to protect your privacy and does not collect data without your consent. Details about crash reports and other optional data transmission are available in the project privacy policy: [https://newpipe.net/legal/privacy/](https://newpipe.net/legal/privacy/).

## License

[![GNU GPLv3 Image](https://www.gnu.org/graphics/gplv3-127x51.png)](https://www.gnu.org/licenses/gpl-3.0.en.html)

NewPipe is Free Software. You may use, study, share, and improve it under the terms of the [GNU General Public License](https://www.gnu.org/licenses/gpl.html), version 3 or later.
