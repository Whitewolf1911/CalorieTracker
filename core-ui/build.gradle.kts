plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

android {
    namespace = "com.alibasoglu.core_ui"
}
