package com.projectkorra.projectkorra.snowman;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.ability.AbilityModuleManager;

public class SnowMethods {

	static ProjectKorra plugin;
	private static FileConfiguration config = ProjectKorra.plugin.getConfig();

	public static ChatColor getSnowColor() {
		return ChatColor.DARK_AQUA;
	}

	public static boolean isSnowAbility(String ability) {
		return AbilityModuleManager.SnowmanAbilities.contains(ability);
	}

	public static boolean isSnowmanAbility(String abil) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void stopBending() {

	}

	public SnowMethods(ProjectKorra plugin) {
		SnowMethods.plugin = plugin;
	}
}
