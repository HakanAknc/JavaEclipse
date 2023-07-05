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
		//string ve char de�i�kenleri kullan�m�
		//Kullan�c�dan bir metin aral��� string al�p bu aral�kta hangi harf aramak istiyorsak onu al�p metnin i�inda ka� kere var buldural�m.
		
		Scanner scan = new Scanner(System.in);
		String metin;
		char harf;
		
		System.out.println("Bir metin giriniz:");
		metin = scan.nextLine();
		System.out.println("Aratmak istedi�iniz harf:");
		harf = scan.next().charAt(0);
		
		System.out.println("Aranan karekter say�s� = " + kacadet(metin,harf));
	}

}
