package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import com.ystoreplugins.yrankup.model.Rank;

public class RankDao {
	
	private final static HashMap<Integer, Rank> ranks = new HashMap<>();
	
	public static void add(Rank rank) {
		RankDao.ranks.put(rank.ordem, rank);
	}
	
	public static Rank get(int rank) {
		return RankDao.ranks.get(rank);
	}
	
	public static boolean contains(int rank) {
		return RankDao.ranks.containsKey(rank);
	}
	
	public static HashMap<Integer, Rank> getRanks() {
		return ranks;
	}

}
