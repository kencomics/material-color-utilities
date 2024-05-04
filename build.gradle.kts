plugins {
    id("java-library")
    id("maven-publish")
}

group = "ru.kencomics"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains:annotations:24.1.0")
}

tasks.test {
    useJUnitPlatform()
}
