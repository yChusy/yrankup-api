package com.ystoreplugins.yrankup.method.menu.top;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import com.ystoreplugins.yrankup.Main;

public class TopPrincipal {
	
	public String nome, visualizando, selecionar;
	public int tamanho, back, seletorSlot;
	public ItemStack itemPrestigio, itemFragmentos, seletor;
	public List<Integer> slots = new ArrayList<>();
	
	public void setup(Main main) {
		try {
			
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na tua menus/top.yml");
		}
	}
}
