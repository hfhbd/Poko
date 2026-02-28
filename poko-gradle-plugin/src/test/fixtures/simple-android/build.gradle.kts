plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.poko)
}

buildscript {
    dependencies {
        val kotlinVersion = providers.gradleProperty("kotlinVersion").get()
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

android {
    namespace = "dev.drewhamilton.poko.test"
    compileSdk = 36

    defaultConfig {
        minSdk = 21
    }
}

dependencies {
    testImplementation(libs.junit)
}
