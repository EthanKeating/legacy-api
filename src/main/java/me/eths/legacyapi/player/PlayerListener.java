package me.eths.legacyapi.player;

import me.eths.legacyapi.sidebar.TestAdapter;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;

public class PlayerListener implements Listener {

    @EventHandler
    private void handlePlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        LegacyPlayer.PLAYERS.put(player.getUniqueId(), new LegacyPlayer(player));
    }

    @EventHandler
    private void handlePlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();

        LegacyPlayer.PLAYERS.remove(player.getUniqueId());
    }

}
