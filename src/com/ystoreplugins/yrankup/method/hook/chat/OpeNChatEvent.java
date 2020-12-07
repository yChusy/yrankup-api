package com.ystoreplugins.yrankup.method.hook.chat;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.nickuc.chat.api.events.PublicMessageEvent;
import com.ystoreplugins.yrankup.Main;

public class OpeNChatEvent implements Listener {

	public OpeNChatEvent(Main main) {
		main.getServer().getPluginManager().registerEvents(this, main);
	}

	@EventHandler
	public void onTalk(PublicMessageEvent e) {
	}
}
