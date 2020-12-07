package com.ystoreplugins.yrankup.method;

public class Numeric {
	
	public static boolean isNumeric(String str) {
		try {
			return true;
		} catch (NumberFormatException e) {
		}
		return false;
	}
}
