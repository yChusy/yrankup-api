package com.ystoreplugins.yrankup.method.hook.chat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.ystoreplugins.yrankup.Main;

import br.com.devpaulo.legendchat.api.events.ChatMessageEvent;

public class LegendChatEvent implements Listener {
	
	public LegendChatEvent(Main main) {
		main.getServer().getPluginManager().registerEvents(this, main);
	}
	
	@EventHandler
	public void onTalk(ChatMessageEvent e) {
	}
}
