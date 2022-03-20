package Odevler;

import java.util.Scanner;

public class Buyuk_olani_bulma {

	public static void main(String[] args) {
		//Kullanýcýdan alýnan 2 sayýdan büyük olaný bulma programý
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ýlk sayýyý giriniz:");
		int a = scan.nextInt();
		
		System.out.println("Ýkinci sayýyý giriniz:");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("Ýlk sayý büyük");
		}else if (b > a) {
			System.out.println("Ýkinci sayý büyük");
		}else {
			System.out.println("iki sayý eþit");
		}
		
		
		

	}

}
