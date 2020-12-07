package com.ystoreplugins.yrankup.method.hook;

import org.bukkit.OfflinePlayer;

import com.ystoreplugins.yrankup.Main;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;

public class PapiHook extends PlaceholderExpansion {

	@Override
	public boolean canRegister() {
		return true;
	}

	@Override
	public String getAuthor() {
		return "yChusy";
	}

	@Override
	public String getIdentifier() {
		return "yrankup";
	}

	@Override
	public String getVersion() {
		return Main.getPlugin(Main.class).getDescription().getVersion();
	}

	@Override
	public String onRequest(OfflinePlayer player, String identifier) {
		return null;
	}
}
