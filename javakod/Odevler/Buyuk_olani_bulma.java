package Odevler;

import java.util.Scanner;

public class Buyuk_olani_bulma {

	public static void main(String[] args) {
		//Kullan�c�dan al�nan 2 say�dan b�y�k olan� bulma program�
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�lk say�y� giriniz:");
		int a = scan.nextInt();
		
		System.out.println("�kinci say�y� giriniz:");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("�lk say� b�y�k");
		}else if (b > a) {
			System.out.println("�kinci say� b�y�k");
		}else {
			System.out.println("iki say� e�it");
		}
		
		
		

	}

}
