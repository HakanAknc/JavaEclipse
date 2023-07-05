package Odevler;

public class Uc_sayıdan_enbuyuk_olanıbuma {

	public static void main(String[] args) {
		//3 say�dan en b�y�k olan�n� bulma program�

		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 27;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En b�y�k: " +enBuyuk);

		//for d�ng�s�

		for(int i = 1;i<=10;i++) {      //i++ ve i+=1 ayn� �eydir.
			System.out.println(i);
		}
		System.out.println("D�ng� bitti.");
		
	
	
	}
}
