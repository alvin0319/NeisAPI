import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("java")
    id("maven-publish")
}

val groupName = "me.alvin0319.neisapi"
val projectVersion = "1.0-SNAPSHOT"
val projectName = "NeisAPI"

group = "me.alvin0319.neisapi"
version = "1.0-SNAPSHOT"

repositories {
    jcenter()
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
}
dependencies {
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("commons-codec:commons-codec:1.15")
    implementation("org.apache.commons:commons-text:1.9")
    implementation("org.apache.httpcomponents:httpclient:4.5.13")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.4")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
}
tasks.named<ShadowJar>("shadowJar") {
    archiveBaseName.set(projectName)
    mergeServiceFiles()
}
