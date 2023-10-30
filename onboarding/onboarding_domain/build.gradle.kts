plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

android {
    namespace = "com.alibasoglu.onboarding_domain"
}

dependencies {
    implementation(project(Modules.core))
}
