package Odevler;

import java.util.Scanner;

public class Metot_Ornek {
	
	public static int kacadet(String metin, char harf) {
		int uzunluk,sayac,i;
		
		uzunluk = metin.length();
		sayac = 0;
		for(i=0;i<uzunluk;i++) {
			if(metin.charAt(i)==harf) sayac++;
		}
		return sayac;	
	}

	public static void main(String[] args) {
		//string ve char deðiþkenleri kullanýmý
		//Kullanýcýdan bir metin aralýðý string alýp bu aralýkta hangi harf aramak istiyorsak onu alýp metnin içinda kaç kere var bulduralým.
		
		Scanner scan = new Scanner(System.in);
		String metin;
		char harf;
		
		System.out.println("Bir metin giriniz:");
		metin = scan.nextLine();
		System.out.println("Aratmak istediðiniz harf:");
		harf = scan.next().charAt(0);
		
		System.out.println("Aranan karekter sayýsý = " + kacadet(metin,harf));
	}

}
