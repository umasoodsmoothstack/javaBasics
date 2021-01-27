package com.ss.basics.dayfour;

public class DoubleCheckLocking {
	private static volatile DoubleCheckLocking instance = null;
	
	public static synchronized DoubleCheckLocking getinstance() {
		if (instance == null) {	
			synchronized (DoubleCheckLocking .class) {
				if (instance == null) {
					instance = new DoubleCheckLocking();
				}
			}
			
			System.out.println("Output Created");
		}	
		return instance;

	}

	public static void main(String[] args) {
		instance.getinstance();
	}

}
