package Odevler;

import java.util.Scanner;

public class MerhabaIsım {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String isim;
		
		System.out.println("�sminizi giriniz:");
		isim = scan.next();
		
		System.out.println("javaya Ho�geldin " + isim);
		
		
		// �ki say�n�n toplam�
		
		int a = 42;
		int b = 36;
		
		int toplam = a + b;
		
		System.out.println("Say�lar�n toplam� = " + toplam);
		

	}

}
