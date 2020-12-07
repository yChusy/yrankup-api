package com.ystoreplugins.yrankup.dao;

import java.util.HashMap;

import org.bukkit.entity.EntityType;

import com.ystoreplugins.yrankup.model.Mob;

public class MobDao {
	
	private final static HashMap<EntityType, Mob> mobs = new HashMap<>();
	
	public static void add(Mob mob) {
		MobDao.mobs.put(mob.entidade, mob);
	}
	
	public static Mob get(EntityType mob) {
		return MobDao.mobs.get(mob);
	}
	
	public static boolean contains(EntityType mob) {
		return MobDao.mobs.containsKey(mob);
	}
	
	public static HashMap<EntityType, Mob> getMobs() {
		return mobs;
	}

}
