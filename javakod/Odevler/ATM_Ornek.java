package Odevler;

import java.util.Scanner;

public class ATM_Ornek {

	public static void main(String[] args) {
		//Atm �rne�i

		Scanner scan = new Scanner(System.in);

		int bakiye = 1000000000;
		int islem;

		System.out.println("Bakiyeyi g�r�nt�lemek i�in 1'e bas�n�z: ");
		System.out.println("Para yat�rmak i�in 2'ye bas�n�z: ");
		System.out.println("Para �ekmek i�in 3'e bas�n�z: ");
		System.out.println("Sistemden ��kmak i�in 4'e bas�n�z: ");

		islem = scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakiye + " TL dir...");
			break;
		case 2:
			System.out.println("Ne kadar yat�racaks�n�z...");
			int miktar = scan.nextInt();
			bakiye += miktar;
			System.out.println("Bakiyeniz: " + bakiye + " TL dir...");
			break;
		case 3:
			System.out.println("Ne kadar �ekeceksiniz...");
			miktar = scan.nextInt();
			bakiye -= miktar;
			System.out.println("Bakiyeniz: " + bakiye + " TL dir...");
		case 4:
			System.out.println("Sistem ��k�l�yor...");
			break;
		default:
			System.out.println("Ge�ersiz i�lem....");
			break;
		}

	}

}
