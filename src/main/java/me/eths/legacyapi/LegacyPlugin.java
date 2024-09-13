package me.eths.legacyapi;

import me.eths.legacyapi.sidebar.ISidebarAdapter;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.List;

public class LegacyPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        LegacyAPI.initialize(this);
    }

}
