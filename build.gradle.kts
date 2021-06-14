plugins {
    `java-library`
    `maven-publish`
}

group = "org.glavo"
version = "0.2.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.compileJava {
    options.release.set(8)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
