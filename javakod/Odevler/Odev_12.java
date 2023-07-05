package Odevler;

import java.util.ArrayList;
import java.util.Random;

public class Odev_12 {

	static ArrayList<Integer> uret(int ilk,int son,int adet){          //Method tanımladık
		ArrayList<Integer> liste = new ArrayList<>();                 //ArrayList tanımladık
		Random r = new Random();                                     //Random Rastgele sayı üretmek
		for(int i=0;i<adet;i++) liste.add(r.nextInt(son-ilk)+ilk);
		return liste;
	}

	public static void main(String[] args) {
		// Bir liste tanımlayarak içini 0-50 arasında rastgele üretilmiş 100 sayı ile doldurunuz?
		// İlk soruda yapılan işlemi bir method ile gerçekleştirin?

		ArrayList<Integer> liste = uret (0,50,100);
		System.out.println(liste);
		
	}

}
