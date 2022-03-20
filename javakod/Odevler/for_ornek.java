package Odevler;

import java.util.Scanner;

public class for_ornek {

	public static void main(String[] args) {
		//Kulanýcýdan aldýðýmýz sayýya kadar olan sayýlarýn toplamýný bulalým

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý gir GARDAÞ");
		int sayi = scan.nextInt();

		int toplam = 0;

		for(int i=0;i<sayi;i++) {
			toplam += i;
			
			
		}
		
		
		System.out.println("0 dan "+sayi+"'e kadar "
				+ "olan sayýlarýn toplamý =" + toplam);


	}


}
