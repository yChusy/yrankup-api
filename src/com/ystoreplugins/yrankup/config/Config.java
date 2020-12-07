package com.ystoreplugins.yrankup.config;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.inventory.ItemStack;

import com.ystoreplugins.yrankup.Main;

public class Config {

	public String permissao, naoEncontrado, naoENumero, jaPrestigio, ultimo, setouPrestigio, alteradoPrestigio,
			prestigioVer, fRank, adicionou, pagarSiMesmo, pagou, pagouPlayer, removerMais, removeu, setou, olhar,
			suficiente, possui, invCheio, comprou, prestigioDesativado, headsDesativado, deuHead, deuFragmento,
			deuPrestigioItem, deuRankupItem, converteuFragmentos, ativouFragmentos, converteuHeads, ativouHeads,
			naoHaPrestigios, naoHaRankups, ativouPrestigio, ativouRankup, fProximoRank, fPrestigio, fProximoPrestigio,
			evoluiuPrestigio, ultimoRank, jaRank, setouRank, alteradoRank, headFormato, pbSimbolo, pbCorSim, pbCorNao;

	public int pbQuantia;
	public boolean resetarRank, usarPrestigio, usarHeads, rankupAtivar;
	public ItemStack voltar, proximo, fragmento, prestigio, rankup;
	public List<String> semAlgo = new ArrayList<>();
	public List<String> rankupMsg = new ArrayList<>();
	public List<String> rankHelp = new ArrayList<>();
	public List<String> fragmentosHelp = new ArrayList<>();

	public Config setup(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na tua config.yml");
		}
		
		return this;
	}
}
