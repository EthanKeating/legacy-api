package me.eths.legacyapi;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public class LegacyAPI {

    @Getter
    private static JavaPlugin plugin;

    public LegacyAPI(JavaPlugin plugin) {
        LegacyAPI.plugin = plugin;
    }

}
