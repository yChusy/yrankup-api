package com.ystoreplugins.yrankup.model;

public class Desconto {
	
	public String id, perm;
	public double desconto;
	
	public Desconto(String id, String perm, double desconto) {
		this.id = id;
		this.perm = perm;
		this.desconto = desconto;
	}
}
