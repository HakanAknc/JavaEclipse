package Odevler;

import java.util.Scanner;

public class Not_Hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Vize notunuzu giriniz:");
		int vize = scan.nextInt();
		System.out.print("Final notunuzu giriniz:");
		int fýnal = scan.nextInt();

		double not = (vize * 0.4) + (fýnal * 0.6);

		System.out.println("Yýl sonu notunuz = " + not);

		if(not > 90) {
			System.out.println("AA ile dersi geçtiniz.");
		}
		else if(not > 85) {
			System.out.println("BA ile dersi geçtiniz.");
		}
		else if(not > 80) {
			System.out.println("BB ile dersi geçtiniz.");
		}
		else if(not > 75) {
			System.out.println("CB ile dersi geçtiniz.");
		}
		else if(not > 50) {
			System.out.println("Kosullu geçtiniz.");
		}
		else {
			System.out.println("Dersi geçemediniz.");
		}

	}

}
