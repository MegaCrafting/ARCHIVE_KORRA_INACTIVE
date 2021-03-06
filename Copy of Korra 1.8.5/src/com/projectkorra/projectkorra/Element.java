package com.projectkorra.projectkorra;

import java.util.Arrays;

import org.bukkit.ChatColor;

import com.projectkorra.projectkorra.airbending.AirMethods;
import com.projectkorra.projectkorra.chiblocking.ChiMethods;
import com.projectkorra.projectkorra.earthbending.EarthMethods;
import com.projectkorra.projectkorra.firebending.FireMethods;
import com.projectkorra.projectkorra.waterbending.WaterMethods;

public enum Element {
	
	Air (AirMethods.getAirColor(), AirMethods.getAirSubColor()), 
	Water (WaterMethods.getWaterColor(), WaterMethods.getWaterSubColor()), 
	Earth (EarthMethods.getEarthColor(), EarthMethods.getEarthSubColor()), 
	Fire (FireMethods.getFireColor(), FireMethods.getFireSubColor()), 
	Chi (ChiMethods.getChiColor(), ChiMethods.getChiColor()),
	Snowman (ChatColor.DARK_AQUA, ChatColor.DARK_AQUA), 
	Scarecrow (ChatColor.DARK_GRAY, ChatColor.DARK_GRAY);
	
	private ChatColor color, subcolor;

	Element(ChatColor mainColor, ChatColor subColor) {
		this.color = mainColor;
		this.subcolor = subColor;
	}
	
	/**
	 * Returns the chatcolor to be used associated with this element
	 * @return The Element ChatColor
	 * */
	public ChatColor getChatColor() {
		return color;
	}
	
	/**
	 * Returns the chatcolor that's associated the sub-elements of this element
	 * @return The SubElement ChatColor
	 * */
	public ChatColor getSubColor() {
		return subcolor;
	}
	
	/**
	 * Returns all the subelements that should be associated with this element
	 * @return The Element's SubElements
	 * */
	public SubElement[] getSubElements() {
		if (this == Air) {
			return new SubElement[] {SubElement.Flight, SubElement.SpiritualProjection};
		}
		if (this == Water) {
			return new SubElement[] {SubElement.Bloodbending, SubElement.Icebending, SubElement.Plantbending, SubElement.Healing};
		}
		if (this == Fire) {
			return new SubElement[] {SubElement.Combustion, SubElement.Lightning};
		}
		if (this == Earth) {
			return new SubElement[] {SubElement.Sandbending, SubElement.Metalbending, SubElement.Lavabending};
		}
		return new SubElement[] {};
	}
	
	public static Element getType(String string) {
		for (Element element : Element.values()) {
			if (element.toString().equalsIgnoreCase(string)) {
				return element;
			}
		}
		return null;
	}

	public static Element getType(int index) {
		if (index == -1)
			return null;
		return Arrays.asList(values()).get(index);
	}
	
	/**
	 * Returns an element based on ChatColor.
	 * @param color
	 * @return
	 */
	public static Element getFromChatColor(ChatColor color) {
		for (Element element : Element.values())  {
			if (element.getChatColor().equals(color) || element.getSubColor().equals(color)) {
				return element;
			}
		}
		return null;
	}
}
