package Odevler;

import java.util.Scanner;

public class Odev_5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Büyük Olan Sayıyı Bulma;");
		System.out.print("Sayı 1: ");
		int sayi1 = scan.nextInt();
		System.out.print("Sayı 2: ");
		int sayi2 = scan.nextInt();
		System.out.println(sayi1+" ve "+ sayi2 +" içerisinden büyük olan: "+ Buyuk(sayi1,sayi2));
		System.out.println("Bölüm = " + (sayi1 / sayi2));
	}
	
	

	public static int Buyuk(int a, int b) {
		//Kendisine gönderilen iki sayıdan büyük olanı küçük olana bölüp sonucu return eden methodu yazınız.
		
		if(a>b) {
			return a;
		} else {
			return b;
		}
		

	}

}
