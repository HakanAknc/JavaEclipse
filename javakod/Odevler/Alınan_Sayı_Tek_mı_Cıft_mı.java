package Odevler;

import java.util.Scanner;

public class Alınan_Sayı_Tek_mı_Cıft_mı {

	public static void main(String[] args) {
		//Kulan�c�dan say� al�n tek mi �ift mi oldu�unu belirleyen program

		int sayi ;
		System.out.println("Bir say� gir aslan par�as�: ");
		Scanner scan = new Scanner(System.in);
		sayi = scan.nextInt();

		if ((sayi % 2 ) == 0) {
			System.out.println("Girilen say� �ift say�d�r.");
		}else if ((sayi % 2) != 0) {
			System.out.println("Girilen say� tek say�d�r..");
		}else {
			System.out.println("Ge�erli bir say� giriniz");
		}
	}

}
