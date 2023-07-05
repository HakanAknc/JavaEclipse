package Odevler;

import java.util.Scanner;

public class Pozitif_mi_Negatif_mi {

	public static void main(String[] args) {
		// Klavyeden girilen say�n�n pozitif ya da negatifli�ini belirleyen bir program 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� gir �o�uk adam: ");
		int sayi = scan.nextInt();
		
		if (sayi>0) {
			System.out.println("Girmi� oldu�unuz " + sayi + " say�s� pozitifir... :)");
		}else if (sayi<0) {
			System.out.println("Girmi� oldu�unuz " + sayi + " say�s� negatiftir... :(");
		}else {
			System.out.println("0 say�s�n� girdiniz... :/");
		}
		
		
		
		
		
		

	}

}
