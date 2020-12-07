package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import com.ystoreplugins.yrankup.model.Desconto;

public class DescontoDao {
	
	private final static HashMap<String, Desconto> descontos = new HashMap<>();
	
	public static void add(Desconto desconto) {
		DescontoDao.descontos.put(desconto.id, desconto);
	}
	
	public static Desconto get(String desconto) {
		return DescontoDao.descontos.get(desconto);
	}
	
	public static boolean contains(String desconto) {
		return DescontoDao.descontos.containsKey(desconto);
	}
	
	public static HashMap<String, Desconto> getDescontos() {
		return descontos;
	}

}
