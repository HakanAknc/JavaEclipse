package Odevler;

import java.util.ArrayList;
import java.util.Random;

public class Odev_11 {

	public static void main(String[] args) {
		//  Bir liste tan�mlayarak i�ini 0-50 aras�nda rastgele �retilmi� 100 say� ile doldurunuz?
		
		Random r = new Random();   //Rastgele say� �retir
		
		ArrayList<Integer> liste = new ArrayList<>();      //ArrayList tan�mlad�k
		for(int i=0;i<100;i++) {
		liste.add(r.nextInt(50));
		}
		System.out.println(liste);
	}

}
