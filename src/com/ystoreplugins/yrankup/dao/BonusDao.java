package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import com.ystoreplugins.yrankup.model.Bonus;

public class BonusDao {
	
	private final static HashMap<String, Bonus> bonus = new HashMap<>();
	
	public static void add(Bonus bonus) {
		BonusDao.bonus.put(bonus.id, bonus);
	}
	
	public static Bonus get(String bonus) {
		return BonusDao.bonus.get(bonus);
	}
	
	public static boolean contains(String bonus) {
		return BonusDao.bonus.containsKey(bonus);
	}
	
	public static HashMap<String, Bonus> getBonus() {
		return bonus;
	}

}
