package com.projectkorra.projectkorra.scarecrow;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;

import com.projectkorra.projectkorra.ProjectKorra;
import com.projectkorra.projectkorra.ability.AbilityModuleManager;

public class ScareMethods {

	static ProjectKorra plugin;
	private static FileConfiguration config = ProjectKorra.plugin.getConfig();

	public static ChatColor getScareColor() {
		return ChatColor.DARK_GRAY;
	}

	public static boolean isScareAbility(String ability) {
		return AbilityModuleManager.ScarecrowAbilities.contains(ability);
	}

	public static boolean isSnowmanAbility(String abil) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void stopBending() {

	}

	public ScareMethods(ProjectKorra plugin) {
		ScareMethods.plugin = plugin;
	}
}
