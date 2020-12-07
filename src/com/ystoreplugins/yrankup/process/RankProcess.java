package com.ystoreplugins.yrankup.process;

import com.ystoreplugins.yrankup.Main;

public class RankProcess {
	
	public RankProcess(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na tua ranks.yml");
		}
	}
}
