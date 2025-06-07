import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "io.lb.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}
tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.dokka.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("JvmLibraryConventionPlugin") {
            id = "io.lb.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"
        }
        register("AndroidLibraryConventionPlugin") {
            id = "io.lb.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("AndroidAppConventionPlugin") {
            id = "io.lb.android.app"
            implementationClass = "AndroidAppConventionPlugin"
        }
        register("JacocoJvmConventionPlugin") {
            id = "io.lb.jacoco.jvm.module"
            implementationClass = "JacocoJvmConventionPlugin"
        }
        register("JacocoAndroidConventionPlugin") {
            id = "io.lb.jacoco.android.module"
            implementationClass = "JacocoAndroidConventionPlugin"
        }
        register("JacocoMultiModuleConventionPlugin") {
            id = "io.lb.jacoco.multi-module"
            implementationClass = "JacocoMultiModuleConventionPlugin"
        }
        register("DokkaConventionPlugin") {
            id = "io.lb.dokka"
            implementationClass = "DokkaConventionPlugin"
        }
        register("DetektConventionPlugin") {
            id = "io.lb.detekt"
            implementationClass = "DetektConventionPlugin"
        }
    }
}
