package Odevler;

import java.util.Scanner;

public class Metotlara_gırıs {
	
	static void yaz() {
		System.out.println("Hakan Ak�nc�");
		System.out.println("Algoritma");
		System.out.println("Program Java");
	}
	static void deneme() {
		System.out.println("Caner Ak�nc�");
	}
	
	public static int cikar(int a,int b) {      //Parametre al�p de�er d�nd�ren metotlar.
		if(a>=b) return a-b; else return b-a;
		
	}

	public static void main(String[] args) {
		
		yaz();
		System.out.println("---------");
		yaz();
		System.out.println("_________");
		deneme();
		System.out.println("*********");
		
		Scanner scan = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("a say�s�n� giriniz: ");
		a = scan.nextInt();
		System.out.println("b say�s�n� giriniz: ");
		b = scan.nextInt();
		
		System.out.println("Sonu� = " +cikar(a,b));
		
	}

}
