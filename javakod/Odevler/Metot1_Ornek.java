package Odevler;

public class Metot1_Ornek {
	
	public static void toplama(int sayi1,int sayi2) {
		int sonuc = sayi1 + sayi2;
		System.out.println(sayi1 + " + " + sayi2 + " = " + sonuc);
	}
	public static void cikarma(int sayi1,int sayi2) {
		if (sayi1>sayi2) {
			int sonuc = sayi1 - sayi2;
			System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
		}else {
			int sonuc = sayi2 - sayi1;
			System.out.println(sayi1 + " - " + sayi2 + " = " + sonuc);
		}
	}
	public static void carpma(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		System.out.println(sayi1 + " * " + sayi2 + " = " + sonuc);
	}
	public static void bolme(int sayi1, int sayi2) {
		int sonuc = sayi1 / sayi2;
		System.out.println(sayi1 + " / " + sayi2 + " = " + sonuc);
	}
	
	public static void main(String[] args) {
		System.out.println("Toplama");
		toplama(20,50);
		System.out.println("��karma");
		cikarma(50,30);
		System.out.println("�arpma");
		carpma(10,9);
		System.out.println("B�lme");
		bolme(40,5);
		
	}

}
