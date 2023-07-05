package Odevler;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		//Kullan�c�dan vize ve final notlar�n� al�n�z notun harf kar��l���n� if-else if 
		//bloklar�n� kullanarak yazd�r�n�z.

		Scanner scan = new Scanner(System.in);

		System.out.println("Vize notunuzu giriniz:");
		int vize = scan.nextInt();

		System.out.println("Final notunuzu giriniz:");
		int fınal = scan.nextInt();

		double not = (vize * 0.4) + (fınal * 0.6);
		System.out.println("Y�l sonu notunuz=" + not);

		if (90 <= not && not >= 100) {
			System.out.println("AA ile ge�tiniz");
		}
		else if (85 <= not && not >= 89) {
			System.out.println("BA ile ge�tiniz");
		}
		else if (80 <= not && not >= 84) {
			System.out.println("BB ile ge�tiniz");
		}
		else if (75 <= not && not >= 79) {
			System.out.println("CB ile ge�tiniz");
		}
		else if (65 <= not && not >= 74) {
			System.out.println("CC ile ge�tiniz");
		}
		else if (60 <= not && not >= 64) {
			System.out.println("DC ile ge�tiniz");
		}
		else if (55 <= not && not >= 59) {
			System.out.println("DD ile ge�tiniz");
		}
		else if (50 <= not && not >= 54) {
			System.out.println("�artl� ge�tiniz");
		}
		else {
			System.out.println("Kald�n�z");
		}

	}
}
