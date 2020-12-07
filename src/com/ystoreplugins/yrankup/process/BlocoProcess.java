package com.ystoreplugins.yrankup.process;

import com.ystoreplugins.yrankup.Main;

public class BlocoProcess {
	
	public BlocoProcess(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na tua blocos.yml");
		}
	}
}
