package com.ystoreplugins.yrankup.process;

import com.ystoreplugins.yrankup.Main;

public class PrestigioProcess {
	
	public PrestigioProcess(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na tua prestigios.yml");
		}
	}
}
