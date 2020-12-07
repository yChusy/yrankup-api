package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import com.ystoreplugins.yrankup.model.Bloco;

public class BlocoDao {
	
	private final static HashMap<String, Bloco> blocos = new HashMap<>();
	
	public static void add(Bloco object) {
		blocos.put(object.bloco, object);
	}
	
	public static Bloco get(String object) {
		return blocos.get(object);
	}
	
	public static boolean contains(String object) {
		return blocos.containsKey(object);
	}
	
	public static HashMap<String, Bloco> getBlocos() {
		return blocos;
	}
}
