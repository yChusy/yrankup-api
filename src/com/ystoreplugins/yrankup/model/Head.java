package com.ystoreplugins.yrankup.model;

import org.bukkit.inventory.ItemStack;

public class Head {
	
	public String nome, configNome;
	public ItemStack head, display;
	
	public Head(String nome, String configNome, ItemStack head, ItemStack display) {
		this.nome = nome;
		this.configNome = configNome;
		this.head = head;
		this.display = display;
	}
}
