package com.ystoreplugins.yrankup.method.hook.chat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.ystoreplugins.yrankup.Main;

import br.net.fabiozumbi12.UltimateChat.Bukkit.API.SendChannelMessageEvent;

public class UltimateChatEvent implements Listener {

	public UltimateChatEvent(Main main) {
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void onTalk(SendChannelMessageEvent e) {
	}
}
