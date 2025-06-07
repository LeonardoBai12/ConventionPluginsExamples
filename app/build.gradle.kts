plugins {
    id("io.lb.android.app")
}

android {
    namespace = "io.lb.app"

    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }
}

dependencies {
    implementation(project(":android-lib"))
    implementation(libs.androidx.navigation.compose)
}
