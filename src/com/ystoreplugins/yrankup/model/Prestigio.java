package com.ystoreplugins.yrankup.model;

import java.util.List;

public class Prestigio {
	
	public String nome, tag;
	public int ordem;
	public double acrescimo;
	public List<String> comandos;

	public Prestigio(String nome, String tag, int ordem, double acrescimo, List<String> comandos) {
		this.nome = nome;
		this.tag = tag;
		this.ordem = ordem;
		this.acrescimo = acrescimo;
		this.comandos = comandos;
	}
}
