package Odevler;

import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
		// Kullan�c�dan 10 say� alarak bir dizi i�ine kaydediniz
		
		int[] dizi = new int[10];
		
		System.out.println("L�tfen 10 tane say� giriniz:");
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = scan.nextInt();
		}
		String sayilar = "";
		for (int i = 0; i < dizi.length; i++) {
			sayilar += dizi[i] + " ";
		}
		System.out.println("Girdi�iniz Say�lar = " + sayilar);
	
	}

}
