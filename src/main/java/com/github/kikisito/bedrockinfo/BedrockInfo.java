package com.github.kikisito.bedrockinfo;

import org.bukkit.plugin.java.JavaPlugin;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;

public final class BedrockInfo extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginCommand("bedrockinfo").setExecutor(new BICommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
