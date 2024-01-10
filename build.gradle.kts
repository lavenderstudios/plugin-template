import kr.entree.spigradle.kotlin.*
import kr.entree.spigradle.data.Load

plugins {
  id("java")

  id("kr.entree.spigradle") version "2.4.3"

  id("org.jetbrains.kotlin.jvm") version "1.9.22"
}

repositories {
  spigotmc()
  mavenCentral()
}

group "dev.lavenderstudios"
version "0.1.0"

dependencies {
  compileOnly(spigot("1.20.4"))

  implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

java {
  sourceCompatibility = JavaVersion.VERSION_17
}

spigot {
  description = "Plugin temlate for Lavender Studios."
  authors = listOf("Lavender Studios")
  apiVersion = "1.20.4"
  load = Load.STARTUP
}
