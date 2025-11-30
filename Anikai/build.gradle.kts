plugins {
    id("com.android.library")
    kotlin("android")
    id("com.github.recloudstream.cloudstream")
}

cloudstream {
    language          = "en"
    description       = "AnimeKai / anikai.to anime provider"
    authors           = listOf("hcgn2005-ai")
    status            = 1
    tvTypes           = listOf("Anime")
    iconUrl           = "https://anikai.to/favicon.ico"
    requiresResources = false
}

android {
    namespace = "com.anikai"
    compileSdk = 34
    defaultConfig {
        minSdk = 21
    }
    sourceSets["main"].java.srcDirs("src/main/kotlin")
}
