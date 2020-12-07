package com.ystoreplugins.yrankup.model;

import java.util.HashMap;

public class PlayerRank {

	public String nome;
	public int rank, prestigio;
	public double fragmentos;
	public boolean beforeRank, beforePrestigio;
	public HashMap<String, Double> heads;

	public PlayerRank(String nome, int rank, int prestigio, double fragmentos, boolean beforeRank,
			boolean beforePrestigio, HashMap<String, Double> heads) {
		this.nome = nome;
		this.rank = rank;
		this.prestigio = prestigio;
		this.fragmentos = fragmentos;
		this.beforeRank = beforeRank;
		this.beforePrestigio = beforePrestigio;
		this.heads = heads;
	}

	public String getName() {
		return nome;
	}
}
