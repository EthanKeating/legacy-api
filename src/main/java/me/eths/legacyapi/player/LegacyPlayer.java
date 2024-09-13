package me.eths.legacyapi.player;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.PacketEventsAPI;
import com.github.retrooper.packetevents.protocol.player.User;
import lombok.Getter;
import lombok.Setter;
import me.eths.legacyapi.sidebar.ISidebarAdapter;
import me.eths.legacyapi.sidebar.SidebarImpl;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
public class LegacyPlayer {

    public static final Map<UUID, LegacyPlayer> PLAYERS = new HashMap<>();

    private final UUID uuid;
    private final User user;

    @Setter
    private ISidebarAdapter sidebarAdapter;
    protected SidebarImpl sidebarImpl;

    public LegacyPlayer(Player player) {
        uuid = player.getUniqueId();
        user = PacketEvents.getAPI().getPlayerManager().getUser(player);

        sidebarImpl = new SidebarImpl(this);
    }

    protected synchronized void update() {

        if (sidebarAdapter != null) {
            sidebarImpl.setTitle(sidebarAdapter.getTitle(toBukkitPlayer()));
            sidebarImpl.setLines(sidebarAdapter.getLines(toBukkitPlayer()));
        }

    }

    public Player toBukkitPlayer() {
        return Bukkit.getPlayer(uuid);
    }

}
