package me.eths.legacyapi.player;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.PacketEventsAPI;
import com.github.retrooper.packetevents.protocol.player.User;
import lombok.Getter;
import me.eths.legacyapi.sidebar.ISidebarAdapter;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.UUID;

public class LegacyPlayer {

    @Getter private final UUID uuid;
    @Getter private final User user;

    private ISidebarAdapter sidebarAdapter;

    public LegacyPlayer(Player player) {
        uuid = player.getUniqueId();
        user = PacketEvents.getAPI().getPlayerManager().getUser(player);
    }

    public synchronized void update() {

        if (sidebarAdapter != null) {

        }

    }

    public Player getPlayer() {
        return Bukkit.getPlayer(uuid);
    }

}
