package com.ystoreplugins.yrankup.method.menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.ystoreplugins.yrankup.Main;

public class Principal {
	
	public String nome;
	public int tamanho, perfilSlot, rankupSlot, ranksSlot, lojaSlot, topSlot, headsSlot;
	public ItemStack perfil, rankup, heads;
	public HashMap<Integer, ItemStack> items = new HashMap<>();
	public List<String> loreNao = new ArrayList<>();
	
	public void show(Main main, Player p) {
	}

	public void setup(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há algum erro na tua menus/principal.yml");
		}
	}
}
