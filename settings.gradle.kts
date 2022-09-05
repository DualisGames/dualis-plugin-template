rootProject.name = "faction"

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

sequenceOf("api", "cli", "paper-impl", "ui").forEach {
    include(":$it")
}