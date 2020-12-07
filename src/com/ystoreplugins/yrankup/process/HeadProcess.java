package com.ystoreplugins.yrankup.process;

import com.ystoreplugins.yrankup.Main;

public class HeadProcess {
	
	public HeadProcess(Main main) {
		try {
			
		}catch (NullPointerException e) {
			main.getLogger().severe("Há um erro na heads.yml");
		}
	}
}
