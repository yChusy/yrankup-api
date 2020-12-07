package com.ystoreplugins.yrankup.process;

import com.ystoreplugins.yrankup.Main;

public class DescontoProcess {
	
	public DescontoProcess(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na desconto.yml");
		}
	}
}
