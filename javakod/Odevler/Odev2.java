package Odevler;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		//Kullan�c�dan 0 ile 100 aras�nda say� al�n�z.Say� 50'den k���kse ekrana elliden k���k
		/*50'den b�y�kse elliden b�y�k yazd�r�n
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir say� giriniz:");
		int sayi = scan.nextInt();
		
		
		
		if (sayi > 50) {
			System.out.println("50'den b�y�k");
		}else if (sayi < 50) {
			System.out.println("50'den k���k");
		}else {
			System.out.println("Ge�erli bir say� giriniz");
		}
	}

}
