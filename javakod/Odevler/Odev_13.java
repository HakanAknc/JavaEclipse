package Odevler;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Odev_13 {
	
	static ArrayList<Integer> uret(int ilk,int son,int adet){
		ArrayList<Integer> liste = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<adet;i++) liste.add(r.nextInt(son-ilk)+ilk);
		return liste;
	}

	public static void main(String[] args) {
		// Bir liste tan�mlayarak i�ini 0-50 aras�nda rastgele �retilmi� 100 say� ile doldurunuz?
		// �lk soruda yap�lan i�lemi bir method ile ger�ekle�tirin?
		
		int ilk,son,adet;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�lk say�y� giriniz: ");
		ilk = scan.nextInt();
		
		System.out.println("Son say�y� giriniz: ");
		son = scan.nextInt();
		
		System.out.println("Adet giriniz: ");
		adet = scan.nextInt();

		ArrayList<Integer> liste = uret (ilk,son,adet);
		System.out.println(liste);
		
	}

}
