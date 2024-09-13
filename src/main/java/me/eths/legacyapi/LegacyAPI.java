package me.eths.legacyapi;

import lombok.Getter;
import me.eths.legacyapi.player.LegacyPlayer;
import me.eths.legacyapi.player.PlayerListener;
import me.eths.legacyapi.thread.LegacyThread;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.logging.Level;

public class LegacyAPI {

    @Getter protected static JavaPlugin plugin;

    public static void initialize(JavaPlugin plugin) {
        if (LegacyAPI.plugin != null) {
            plugin.getLogger().log(Level.SEVERE, "Error initializing LegacyAPI, as it has already been initialized by.");
            return;
        }

        LegacyAPI.plugin = plugin;

        plugin.getServer().getPluginManager().registerEvents(new PlayerListener(), plugin);
        new LegacyThread().start();
    }

    public static LegacyPlayer getLegacyPlayer(Player player) {
        return getLegacyPlayer(player.getUniqueId());
    }

    public static LegacyPlayer getLegacyPlayer(UUID uuid) {
        return LegacyPlayer.PLAYERS.get(uuid);
    }



}
