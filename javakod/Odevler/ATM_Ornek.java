package Odevler;

import java.util.Scanner;

public class ATM_Ornek {

	public static void main(String[] args) {
		//Atm örneði

		Scanner scan = new Scanner(System.in);

		int bakiye = 1000000000;
		int islem;

		System.out.println("Bakiyeyi görüntülemek için 1'e basýnýz: ");
		System.out.println("Para yatýrmak için 2'ye basýnýz: ");
		System.out.println("Para çekmek için 3'e basýnýz: ");
		System.out.println("Sistemden çýkmak için 4'e basýnýz: ");

		islem = scan.nextInt();

		switch (islem) {
		case 1:
			System.out.println("Bakiyeniz: " + bakiye + " TL dir...");
			break;
		case 2:
			System.out.println("Ne kadar yatýracaksýnýz...");
			int miktar = scan.nextInt();
			bakiye += miktar;
			System.out.println("Bakiyeniz: " + bakiye + " TL dir...");
			break;
		case 3:
			System.out.println("Ne kadar çekeceksiniz...");
			miktar = scan.nextInt();
			bakiye -= miktar;
			System.out.println("Bakiyeniz: " + bakiye + " TL dir...");
		case 4:
			System.out.println("Sistem çýkýlýyor...");
			break;
		default:
			System.out.println("Geçersiz iþlem....");
			break;
		}

	}

}
