package com.ystoreplugins.yrankup.model;

import java.util.HashMap;
import java.util.List;

import org.bukkit.inventory.ItemStack;

public class Rank {

	public String nome, tag, abMsg;
	public int ordem, kills;
	public double money, cash, almas, fragmentos;
	public boolean abAtivar, chatAtivar, headsAtivar;
	public ItemStack skull;
	public List<String> comandos, chatMsg;
	public HashMap<String, Double> heads;

	public Rank(String nome, String tag, String abMsg, int ordem, int kills, double money, double cash, double almas,
			double fragmentos, boolean abAtivar, boolean chatAtivar, boolean headsAtivar, ItemStack skull, List<String> comandos,
			List<String> chatMsg, HashMap<String, Double> heads) {
		this.nome = nome;
		this.tag = tag;
		this.abMsg = abMsg;
		this.ordem = ordem;
		this.kills = kills;
		this.money = money;
		this.cash = cash;
		this.almas = almas;
		this.fragmentos = fragmentos;
		this.abAtivar = abAtivar;
		this.chatAtivar = chatAtivar;
		this.headsAtivar = headsAtivar;
		this.skull = skull;
		this.comandos = comandos;
		this.chatMsg = chatMsg;
		this.heads = heads;
	}
}
