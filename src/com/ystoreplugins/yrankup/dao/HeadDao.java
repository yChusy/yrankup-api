package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import com.ystoreplugins.yrankup.model.Head;

public class HeadDao {
	
	private final static HashMap<String, Head> heads = new HashMap<>();
	
	public static void add(Head head) {
		HeadDao.heads.put(head.nome, head);
	}
	
	public static Head get(String head) {
		return HeadDao.heads.get(head);
	}
	
	public static boolean contains(String head) {
		return HeadDao.heads.containsKey(head);
	}
	
	public static HashMap<String, Head> getHeads() {
		return heads;
	}

}
