package me.eths.legacyapi.thread;

import lombok.SneakyThrows;
import me.eths.legacyapi.player.LegacyPlayer;

import java.util.ArrayList;

public class LegacyThread extends Thread {

    public LegacyThread() {
        setName("legacy-thread");
    }

    @SneakyThrows @Override
    public void run() {
        while (true) {
            long startTime = System.currentTimeMillis();
            new ArrayList<>(LegacyPlayer.PLAYERS.values()).forEach(legacyPlayer -> {
                if (legacyPlayer.toBukkitPlayer() != null) {
                    legacyPlayer.getSidebarImpl().tick(legacyPlayer.getSidebarAdapter());
                }
            });

            Thread.sleep(Math.max(0, 50 - (System.currentTimeMillis() - startTime)));
        }
    }
}
