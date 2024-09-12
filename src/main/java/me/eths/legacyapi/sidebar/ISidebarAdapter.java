package me.eths.legacyapi.sidebar;

import org.bukkit.entity.Player;

import java.util.List;

public interface ISidebarAdapter {

    public String getTitle(Player player);
    public List<String> getLines(Player player);

}
