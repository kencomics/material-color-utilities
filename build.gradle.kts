plugins {
    id("java-library")
}

group = "ru.kencomics"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:24.1.0")
}

tasks.test {
    useJUnitPlatform()
}
