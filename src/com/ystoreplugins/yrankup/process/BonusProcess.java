package com.ystoreplugins.yrankup.process;

import com.ystoreplugins.yrankup.Main;

public class BonusProcess {
	
	public BonusProcess(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na bonus.yml");
		}
	}
}
