package com.galaxy.paper.template;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class PluginTemplate extends JavaPlugin {

    private Logger logger;

    @Override
    public void onEnable() {
        super.onEnable();
        logger = getLogger();

        logger.info("Plugin enabled");
    }
}
