package com.myprogram.main;

public class Start {
	
	public static void main( String[] args) {
		
		int length = 50;
		int widht = 30;
		int height = 40;
		
		int length2 = 42;
		int widht2 = 25;
		int height2 = 40;
		
		int volume = result(length, widht, height);
		int volume2 = result(length2, widht2, height2);
		
		System.out.println("Обьем большого аквариума:" + volume);
		System.out.println("Обьем малого аквариума:" + volume2);
		System.out.println("Обьем воды:" + (volume - volume2));
	}
	
	public static int result(int a, int b, int c) {
		return (a * b * c);
	}
}
