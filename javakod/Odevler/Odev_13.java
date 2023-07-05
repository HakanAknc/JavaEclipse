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
		// Bir liste tanımlayarak içini 0-50 arasında rastgele üretilmiş 100 sayı ile doldurunuz?
		// İlk soruda yapılan işlemi bir method ile gerçekleştirin?
		
		int ilk,son,adet;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz: ");
		ilk = scan.nextInt();
		
		System.out.println("Son sayıyı giriniz: ");
		son = scan.nextInt();
		
		System.out.println("Adet giriniz: ");
		adet = scan.nextInt();

		ArrayList<Integer> liste = uret (ilk,son,adet);
		System.out.println(liste);
		
	}

}
