package com.ystoreplugins.yrankup.api;

import org.bukkit.entity.Player;

import com.ystoreplugins.yrankup.dao.PlayerRankDao;
import com.ystoreplugins.yrankup.dao.PrestigioDao;
import com.ystoreplugins.yrankup.dao.RankDao;
import com.ystoreplugins.yrankup.model.PlayerRank;
import com.ystoreplugins.yrankup.model.Prestigio;
import com.ystoreplugins.yrankup.model.Rank;

public class yRankupAPI {
	
	public static yRankupAPI api;
	
	public PlayerRank getPlayer(Player p) {
		return PlayerRankDao.get(p.getName());
	}
	
	public PlayerRank getPlayer(String p) {
		return PlayerRankDao.get(p);
	}
	
	public double getFragmentos(Player p) {
		return getPlayer(p).fragmentos;
	}
	
	public void setFragmentos(Player p, double value) {
		getPlayer(p).fragmentos = value;
	}
	
	public void removeFragmentos(Player p, double value) {
		if (getPlayer(p).fragmentos < value) getPlayer(p).fragmentos = 0;
		else getPlayer(p).fragmentos -= value;
	}
	
	public void addFragmentos(Player p, double value) {
		getPlayer(p).fragmentos += value;
	}
	
	public boolean hasRank(Player p) {
		return RankDao.contains(getPlayer(p).rank) ? true : false;
	}
	
	public Rank getRank(Player p) {
		return RankDao.contains(getPlayer(p).rank) ? RankDao.get(getPlayer(p).rank) : null;
	}
	
	public boolean hasPrestigio(Player p) {
		return PrestigioDao.contains(getPlayer(p).rank) ? true : false;
	}
	
	public Prestigio getPrestigio(Player p) {
		return PrestigioDao.contains(getPlayer(p).prestigio) ? PrestigioDao.get(getPlayer(p).prestigio) : null;
	}
	
	public boolean hasNextRank(Player p) {
		return RankDao.contains(getPlayer(p).rank + 1) ? true : false;
	}
	
	public boolean hasNextPrestigio(Player p) {
		return PrestigioDao.contains(getPlayer(p).prestigio + 1) ? true : false;
	}
	
	public Rank getNextRank(Player p) {
		return RankDao.contains(getPlayer(p).rank + 1) ? RankDao.get(getPlayer(p).rank + 1) : null;
	}
	
	public Prestigio getNextPrestigio(Player p) {
		return PrestigioDao.contains(getPlayer(p).prestigio + 1) ? PrestigioDao.get(getPlayer(p).prestigio + 1) : null;
	}
}
