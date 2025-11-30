plugins {
    id("com.android.library") version "8.0.0" apply false
    kotlin("android") version "1.9.0" apply false
    id("com.github.recloudstream.cloudstream") version "0.1.1" apply false
}

subprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
