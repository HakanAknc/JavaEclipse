package Odevler;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		//Kullanýcýdan vize ve final notlarýný alýnýz notun harf karþýlýðýný if-else if 
		//bloklarýný kullanarak yazdýrýnýz.

		Scanner scan = new Scanner(System.in);

		System.out.println("Vize notunuzu giriniz:");
		int vize = scan.nextInt();

		System.out.println("Final notunuzu giriniz:");
		int fýnal = scan.nextInt();

		double not = (vize * 0.4) + (fýnal * 0.6);
		System.out.println("Yýl sonu notunuzu giriniz =" + not);

		if (90 <= not && not <= 100) {
			System.out.println("AA ile geçtiniz");
		}
		else if (85 <= not && not <= 89) {
			System.out.println("BA ile geçtiniz");
		}
		else if (80 <= not && not <= 84) {
			System.out.println("BB ile geçtiniz");
		}
		else if (75 <= not && not <= 79) {
			System.out.println("CB ile geçtiniz");
		}
		else if (65 <= not && not <= 74) {
			System.out.println("CC ile geçtiniz");
		}
		else if (60 <= not && not <= 64) {
			System.out.println("DC ile geçtiniz");
		}
		else if (55 <= not && not <= 59) {
			System.out.println("DD ile geçtiniz");
		}
		else if (50 <= not && not <= 54) {
			System.out.println("Þartlý geçtiniz");
		}
		else {
			System.out.println("Kaldýnýz");
		}

	}
}
