pluginManagement {
    repositories {
        maven { url = uri("https://repo.recloudstream.org/releases") }
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

rootProject.name = "myrepo-ai"
include(":Anikai")
