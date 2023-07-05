package Odevler;

import java.util.Scanner;

public class Buyuk_olani_bulma {

	public static void main(String[] args) {
		//Kullanýcýdan alýnan 2 sayýdan büyük olaný bulma programý
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci sayýyý giriniz:");
		int a = scan.nextInt();
		
		System.out.println("Ýkinci sayýyý giriniz:");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("Birinci sayý büyük");
		}else if (b > a) {
			System.out.println("Ýkinci sayý büyük");
		}else {
			System.out.println("iki sayý eþit");
		}
		
		//4 sayýdan en büyük olanýný bulma programý
		
				int sayi1 = 20;
				int sayi2 = 25;
				int sayi3 = 27;
				int sayi4 = 35;
				int enBuyuk = sayi1;
				
				if (enBuyuk < sayi2) {
					enBuyuk = sayi2;
				}
				if (enBuyuk < sayi3) {
					enBuyuk = sayi3;
				}
				if (enBuyuk<sayi4) {
					enBuyuk = sayi4;
				}
				System.out.println("En büyük: " + enBuyuk);
				
			
	}

}
