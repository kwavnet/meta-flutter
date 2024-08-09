#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "webview_flutter_example"
DESCRIPTION = "Demonstrates how to use the webview_flutter plugin."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "f7b12561aeb6be92fc973441ae0f26cfaa8df8f4"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "webview_flutter_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-webview-flutter-webview-flutter-webview-flutter-example"
FLUTTER_APPLICATION_PATH = "packages/webview_flutter/webview_flutter/example"
PUBSPEC_IGNORE_LOCKFILE = "1"

inherit flutter-app
