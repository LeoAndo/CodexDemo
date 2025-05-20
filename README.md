# CodexDemo

A simple Android application used as a demonstration project.

## Building the app

Use the provided Gradle wrapper to build the debug APK:

```sh
./gradlew assembleDebug
```

## Running on a device or emulator

Connect a device or start an emulator and run:

```sh
./gradlew installDebug
```

This will install the app onto the connected Android device.

## Project Orientation
The repository is a basic Android project using Gradle and Kotlin.
```
./build.gradle.kts          # top-level Gradle config
./settings.gradle.kts       # project/modules definition
./gradle/                   # wrapper & version catalogs
./app/                      # main Android module
└── src/
    ├── main/
    │   ├── AndroidManifest.xml
    │   ├── java/jp/ac/jec/cm0199/codexdemo/MainActivity.kt
    │   └── res/...          # layout, drawables, strings, etc.
    ├── test/...             # local unit tests
    └── androidTest/...      # instrumentation tests
```
