package com.github.kikisito.bedrockinfo;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.geysermc.floodgate.api.FloodgateApi;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.jetbrains.annotations.NotNull;

public class BICommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        FloodgateApi api = FloodgateApi.getInstance();
        for(FloodgatePlayer floodgatePlayer : api.getPlayers()){
            sender.sendMessage(ChatColor.GOLD + floodgatePlayer.getUsername() + ChatColor.WHITE + " -> " + ChatColor.YELLOW + floodgatePlayer.getDeviceOs().toString());
        }
        return true;
    }
}
