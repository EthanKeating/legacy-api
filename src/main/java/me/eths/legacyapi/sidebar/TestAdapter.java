package me.eths.legacyapi.sidebar;

import org.bukkit.entity.Player;

import java.util.Arrays;
import java.util.List;

public class TestAdapter implements ISidebarAdapter {


    @Override
    public String getTitle(Player player) {
        return "&6Testing";
    }

    @Override
    public List<String> getLines(Player player) {
        return Arrays.asList(
                "&7&m-----------------",
                "&aYou: &fObama",
                "&aRank: &4Owner",
                "&7&m-----------------");
    }
}
