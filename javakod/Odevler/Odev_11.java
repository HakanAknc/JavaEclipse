package Odevler;

import java.util.ArrayList;
import java.util.Random;

public class Odev_11 {

	public static void main(String[] args) {
		//  Bir liste tanýmlayarak içini 0-50 arasýnda rastgele üretilmiþ 100 sayý ile doldurunuz?
		
		Random r = new Random();   //Rastgele sayý üretir
		
		ArrayList<Integer> liste = new ArrayList<>();      //ArrayList tanýmladýk
		for(int i=0;i<100;i++) {
		liste.add(r.nextInt(50));
		}
		System.out.println(liste);
	}

}
