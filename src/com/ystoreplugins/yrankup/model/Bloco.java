package com.ystoreplugins.yrankup.model;

public class Bloco {
	
	public String nome, bloco;
	public double chance, quantia;
	
	public Bloco(String nome, String bloco, double chance, double quantia) {
		this.nome = nome;
		this.bloco = bloco;
		this.chance = chance;
		this.quantia = quantia;
	}
}
