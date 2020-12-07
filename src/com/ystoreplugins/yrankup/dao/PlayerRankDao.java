package com.ystoreplugins.yrankup.dao;

import java.util.Map;
import java.util.TreeMap;

import com.ystoreplugins.yrankup.model.PlayerRank;

public class PlayerRankDao {
	
	private final static Map<String, PlayerRank> players = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
	
	public static void add(PlayerRank player) {
		PlayerRankDao.players.put(player.nome, player);
	}
	
	public static PlayerRank get(String player) {
		return PlayerRankDao.players.get(player);
	}
	
	public static boolean contains(String player) {
		return PlayerRankDao.players.containsKey(player);
	}
	
	public static Map<String, PlayerRank> getPlayers() {
		return players;
	}

}
