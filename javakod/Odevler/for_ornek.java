package Odevler;

import java.util.Scanner;

public class for_ornek {

	public static void main(String[] args) {
		//Kulan�c�dan ald���m�z say�ya kadar olan say�lar�n toplam�n� bulal�m

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� gir GARDA�");
		int sayi = scan.nextInt();

		int toplam = 0;

		for(int i=0;i<sayi;i++) {
			toplam += i;
			
			
		}
		
		
		System.out.println("0 dan "+sayi+"'e kadar "
				+ "olan say�lar�n toplam� =" + toplam);


	}


}
