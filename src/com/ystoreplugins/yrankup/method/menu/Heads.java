package com.ystoreplugins.yrankup.method.menu;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.ystoreplugins.yrankup.Main;

public class Heads {
	
	public String nome;
	public int tamanho, back, voltar, proximo, vazioSlot;
	public ItemStack vazio;
	public List<Integer> slots = new ArrayList<>();
	
	public void show(Main main, Player p) {
	}

	public void setup(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há algum erro na tua menus/heads.yml");
		}
	}
}
