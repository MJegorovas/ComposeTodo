plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
    id("app.cash.licensee")
}

dependencies {
    implementation(projects.composeClients)

    val ktor = "2.1.1"
    implementation("io.ktor:ktor-client-cio:$ktor")
    implementation("app.cash.sqldelight:sqlite-driver:2.0.0-alpha03")
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-swing:1.6.4")

    testImplementation(kotlin("test"))
}

compose.desktop {
    application {
        mainClass = "app.softwork.composetodo.MainKt"
    }
}

licensee {
    allow("Apache-2.0")
    allow("MIT")
}
