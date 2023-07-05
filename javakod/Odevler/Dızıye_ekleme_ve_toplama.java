package Odevler;

import java.util.Scanner;

public class Dızıye_ekleme_ve_toplama {

	public static void main(String[] args) {
		// Klavyeden girilen say�lar� ekleme ve toplamlar�n� hesaplama

		int toplam = 0;
		int[] dizi = new int[10];

		System.out.println("10 say� girirniz: ");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = scan.nextInt();
			toplam += dizi[i];
		}	

		String sayilar = "";
		for (int i = 0; i < dizi.length; i++) {
			sayilar += dizi[i] + " ";
		}
		System.out.println("Girdi�iniz Say�lar= " + sayilar);
		System.out.println("Toplamlar�: " + toplam);
		
		
		
	}

}
