plugins {
    java
    eclipse
}

allprojects {
    group = "it.discovery"
}

subprojects {
    apply(plugin = "java")

    java.sourceCompatibility = JavaVersion.VERSION_15
    java.targetCompatibility = JavaVersion.VERSION_15

    repositories {
        jcenter()
    }

    dependencies {
        runtime("jakarta.xml.bind:jakarta.xml.bind-api:2.3.3")
        runtime("jakarta.annotation:jakarta.annotation-api:1.3.5")
        runtime("com.sun.xml.bind:jaxb-impl:2.3.2")
        runtime("com.sun.xml.bind:jaxb-core:2.3.0.1")

        compileOnly("org.projectlombok:lombok:1.18.16")
        annotationProcessor("org.projectlombok:lombok:1.18.16")
    }
}

