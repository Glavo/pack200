plugins {
    `java-library`
    `maven-publish`
}

group = "org.glavo"
version = "0.3.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

java {
    withJavadocJar()
    withSourcesJar()
}

tasks.compileJava {
    sourceCompatibility = "8"
    targetCompatibility = "8"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("maven") {
            groupId = project.group.toString()
            version = project.version.toString()
            artifactId = project.name
            from(components["java"])
        }
    }
}
