plugins {
    id("net.fabricmc.fabric-loom-remap")
    // id("me.modmuss50.mod-publish-plugin")  // uncomment to enable publishing
}
if (sc.current.parsed >= "26.1") {
    apply(rootProject.file("build.unobfuscated.gradle.kts"))
} else {
    apply(rootProject.file("build.obfuscated.gradle.kts"))
}