package Odevler;

public class Dızı_Ornek1 {

	public static void main(String[] args) {
		// Dizi �rnek

		int [] Liste = {12,14,15,18,21};
		int total=0;
		int buyuk = Liste[0];

		for(int rakam:Liste) {
			if(buyuk<rakam) {
				buyuk = rakam;
			}
			total = total + rakam;
			System.out.println(rakam);
		}
		System.out.println("Toplam: " + total);
		System.out.println("En B�y�k: " +buyuk);

	}

}
