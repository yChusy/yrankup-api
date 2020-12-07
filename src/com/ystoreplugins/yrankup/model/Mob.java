package com.ystoreplugins.yrankup.model;

import java.util.HashMap;

import org.bukkit.entity.EntityType;

public class Mob {
	
	public String nome;
	public EntityType entidade;
	public double fChance, fQuantia;
	public boolean apenasUmTipo;
	public HashMap<String, String> heads;
	
	public Mob(String nome, EntityType entidade, double fChance, double fQuantia, boolean apenasUmTipo, HashMap<String, String> heads) {
		this.nome = nome;
		this.entidade = entidade;
		this.fChance = fChance;
		this.fQuantia = fQuantia;
		this.apenasUmTipo = apenasUmTipo;
		this.heads = heads;
	}
}
