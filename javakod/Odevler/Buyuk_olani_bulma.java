package Odevler;

import java.util.Scanner;

public class Buyuk_olani_bulma {

	public static void main(String[] args) {
		//Kullan�c�dan al�nan 2 say�dan b�y�k olan� bulma program�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Birinci say�y� giriniz:");
		int a = scan.nextInt();
		
		System.out.println("�kinci say�y� giriniz:");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("Birinci say� b�y�k");
		}else if (b > a) {
			System.out.println("�kinci say� b�y�k");
		}else {
			System.out.println("iki say� e�it");
		}
		
		//4 say�dan en b�y�k olan�n� bulma program�
		
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
				System.out.println("En b�y�k: " + enBuyuk);
				
			
	}

}
