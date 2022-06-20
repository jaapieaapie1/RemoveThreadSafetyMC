pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

rootProject.name = "removethreadsafetymc"

include("removethreadsafetymc-API", "removethreadsafetymc-Server")