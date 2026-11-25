// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

allprojects {
    val relPath = if (path == ":") "" else path.replace(':', '/')
    layout.buildDirectory.set(file("${System.getProperty("user.home")}/UniVisionBuild/UniVision$relPath"))
}