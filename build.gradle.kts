import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    var kotlinVersion: String by extra

    kotlinVersion = "1.2.31"

    repositories {
        mavenCentral()
        mavenLocal()
    }
    dependencies {
        classpath(kotlinModule("gradle-plugin", kotlinVersion))
    }
}

group = "labs"
version = "1.0-SNAPSHOT"

plugins {
    java
    maven
    idea
}

apply {
    plugin("maven")
    plugin("kotlin")
}




repositories {
    mavenCentral()
    mavenLocal()
}



tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
dependencies {
    compile("org.jetbrains.kotlin", "kotlin-stdlib-jdk8", extra.get("kotlinVersion") as String)
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}