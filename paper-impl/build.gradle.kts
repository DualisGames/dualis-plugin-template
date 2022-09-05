plugins {
    alias(libs.plugins.yml.bukkit)
}

dependencies {
    api(rootProject.projects.api)
}

bukkit {
    apiVersion = libs.versions.minecraft.get()
    name = rootProject.name

}