plugins {
    kotlin("jvm") version "1.4.17"
}

dependencies {
    compile(kotlin("stdlib"))
    testCompile("com.natpryce:hamkrest:1.4.2.2")
    testCompile("junit:junit:4.12")
}

repositories {
    jcenter()
}
