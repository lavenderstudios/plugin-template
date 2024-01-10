/*
 * Copyright (C), 2024 Lavender Studios. Some rights reserved.
 * This work is licensed under the terms of the MIT license
 * which can be found in the root directory of this project.
 */

package dev.lavenderstudios.plugintemplate

import org.bukkit.plugin.java.JavaPlugin

class PluginTemplate() : JavaPlugin() {
  override fun onEnable() {
    getLogger().info("[PluginTemplate] Enabling PluginTemplate v0.1.0")
  }

  override fun onDisable() {
    getLogger().info("[PluginTemplate] Disabling PluginTemplate v0.1.0")
  }
}
