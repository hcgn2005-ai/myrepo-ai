pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven { url = uri("https://recloudstream.github.io/gradle/") }
    }
}

rootProject.name = "myrepo-ai"
include(":Anikai")
