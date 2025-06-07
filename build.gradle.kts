plugins {
    alias(libs.plugins.application) apply false
    alias(libs.plugins.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.serialization)
    alias(libs.plugins.detekt) apply false
    alias(libs.plugins.dokka) apply true
    id("io.lb.dokka") apply true
    id("io.lb.jacoco.multi-module")
}
