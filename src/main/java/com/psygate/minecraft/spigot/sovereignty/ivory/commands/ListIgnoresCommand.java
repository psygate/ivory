/*
 *     Copyright (C) 2016 psygate (https://github.com/psygate)
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 */

package com.psygate.minecraft.spigot.sovereignty.ivory.commands;

import com.psygate.minecraft.spigot.sovereignty.ivory.groups.Group;
import com.psygate.minecraft.spigot.sovereignty.ivory.managment.GroupManager;
import com.psygate.minecraft.spigot.sovereignty.nucleus.commands.util.NucleusPlayerCommand;
import com.psygate.minecraft.spigot.sovereignty.nucleus.util.player.PlayerManager;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import java.sql.Timestamp;
import java.util.Optional;

/**
 * Created by psygate (https://github.com/psygate) on 28.01.2016.
 */
public class ListIgnoresCommand extends NucleusPlayerCommand {

    public ListIgnoresCommand() {
        super(0, 0);
    }

    private final static Timestamp now() {
        return new Timestamp(System.currentTimeMillis());
    }

    @Override
    protected void subOnCommand(Player player, Command command, String s, String[] args) throws Exception {
        String groups = GroupManager.getInstance().getGroupMutes(player.getUniqueId())
                .stream()
                .map(v -> GroupManager.getInstance().getGroup(v))
                .filter(o -> o.isPresent())
                .map(Optional::get)
                .map(Group::getName)
                .reduce("", (a, b) -> a + "," + b);

        String players = GroupManager.getInstance().getPlayerMutes(player.getUniqueId())
                .stream()
                .map(v -> PlayerManager.getInstance().toName(v))
                .reduce("", (a, b) -> a + "," + b);

        player.sendMessage(new String[]{
                ChatColor.YELLOW + "Ignored Groups:",
                groups,
                ChatColor.YELLOW + "Ignored Players:",
                players
        });
    }

    @Override
    protected String[] getName() {
        return new String[]{"listignores"};
    }
}
