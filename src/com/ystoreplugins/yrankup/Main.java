package com.ystoreplugins.yrankup;

import org.black_ixx.playerpoints.PlayerPoints;
import org.bukkit.plugin.java.JavaPlugin;

import com.ystoreplugins.yrankup.config.Config;
import com.ystoreplugins.yrankup.method.menu.Heads;
import com.ystoreplugins.yrankup.method.menu.Loja;
import com.ystoreplugins.yrankup.method.menu.Prestigio;
import com.ystoreplugins.yrankup.method.menu.Principal;
import com.ystoreplugins.yrankup.method.menu.Ranks;
import com.ystoreplugins.yrankup.method.menu.Rankup;
import com.ystoreplugins.yrankup.method.menu.top.TopPrincipal;

import net.milkbowl.vault.economy.Economy;

public class Main extends JavaPlugin {
	
	public Config config = new Config();
	public Ranks menuRanks = new Ranks();
	public Principal menuPrincipal = new Principal();
	public TopPrincipal menuTopPrincipal = new TopPrincipal();
	public Rankup menuRankup = new Rankup();
	public Prestigio menuPrestigio = new Prestigio();
	public Loja menuLoja = new Loja();
	public Heads menuHeads = new Heads();
	public static String points;
	public PlayerPoints playerPoints;
	public Economy econ;
	
	public static boolean almas = false, kills = false, disabled = false;
	
	@Override
	public void onEnable() {
	}

	@Override
	public void onDisable() {
	}
	
	public void register() {
	}
	
	@SuppressWarnings("unused")
	private void hooks() {
	}
	
	@SuppressWarnings("unused")
	private void loadConfigs() {
	}
	
	@SuppressWarnings("unused")
	private void createFolder(Main main) {
	}
}