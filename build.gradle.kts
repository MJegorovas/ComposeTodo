plugins {
    val kotlinVersion = "1.4.21"
    kotlin("multiplatform") version kotlinVersion apply false
    kotlin("plugin.serialization") version kotlinVersion apply false
    id("com.android.library") version "7.0.0-alpha03" apply false
}

repositories {
    jcenter()
    google()
}

allprojects {
    repositories {
        jcenter()
        google()
        maven("https://dl.bintray.com/cy6ergn0m/uuid")
        maven(url = "https://kotlin.bintray.com/kotlinx/") // kotlinx.datetime
    }
}
