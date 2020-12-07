package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import com.ystoreplugins.yrankup.model.Prestigio;

public class PrestigioDao {
	
	private final static HashMap<Integer, Prestigio> prestigios = new HashMap<>();
	
	public static void add(Prestigio prestigio) {
		PrestigioDao.prestigios.put(prestigio.ordem, prestigio);
	}
	
	public static Prestigio get(int prestigio) {
		return PrestigioDao.prestigios.get(prestigio);
	}
	
	public static boolean contains(int prestigio) {
		return PrestigioDao.prestigios.containsKey(prestigio);
	}
	
	public static HashMap<Integer, Prestigio> getPrestigios() {
		return prestigios;
	}

}
