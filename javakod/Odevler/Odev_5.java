package Odevler;

import java.util.Scanner;

public class Odev_5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("B�y�k Olan Say�y� Bulma;");
		System.out.print("Say� 1: ");
		int sayi1 = scan.nextInt();
		System.out.print("Say� 2: ");
		int sayi2 = scan.nextInt();
		System.out.println(sayi1+" ve "+ sayi2 +" i�erisinden b�y�k olan: "+ Buyuk(sayi1,sayi2));
		System.out.println("B�l�m = " + (sayi1 / sayi2));
	}
	
	

	public static int Buyuk(int a, int b) {
		//Kendisine g�nderilen iki say�dan b�y�k olan� k���k olana b�l�p sonucu return eden methodu yaz�n�z.
		
		if(a>b) {
			return a;
		} else {
			return b;
		}
		

	}

}
