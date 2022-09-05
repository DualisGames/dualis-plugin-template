rootProject.name = "faction"

sequenceOf("api").forEach {
    include(":$it")
}