package com.ystoreplugins.yrankup.method.menu;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.ystoreplugins.yrankup.Main;

public class Prestigio {
	
	public String nome;
	public int tamanho, back, confirmarSlot, prestigioSlot, cancelarSlot;
	public ItemStack confirmar, prestigio, cancelar;
	
	public void show(Main main, Player p) {
	}

	public void setup(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há algum erro na tua menus/prestigio.yml");
		}
	}
}
