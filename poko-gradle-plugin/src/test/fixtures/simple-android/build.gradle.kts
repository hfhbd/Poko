plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.poko)
}

android {
    namespace = "dev.drewhamilton.poko.test"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
    }

    kotlin {
        compilerOptions {
            languageVersion = org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_3
        }
    }
}

dependencies {
    testImplementation(libs.junit)
}
