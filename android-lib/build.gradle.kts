plugins {
    id("io.lb.android.library")
}

android {
    namespace = "io.lb.android.lib"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }
}

dependencies {
    implementation(project(":kotlin-lib"))
}