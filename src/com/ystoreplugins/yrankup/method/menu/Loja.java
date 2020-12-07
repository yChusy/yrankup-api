package com.ystoreplugins.yrankup.method.menu;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.ystoreplugins.yrankup.Main;

public class Loja {
	
	@SuppressWarnings("unused")
	private Inventory inv;
	
	public String nome;
	
	public void show(Main main, Player p) {
	}
	
	public void setup(Main main) {
		try {
			
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na loja.yml");
		}
	}
}
