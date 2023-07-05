package Odevler;

import java.util.ArrayList;
import java.util.Random;

public class Odev_12 {

	static ArrayList<Integer> uret(int ilk,int son,int adet){          //Method tan�mlad�k
		ArrayList<Integer> liste = new ArrayList<>();                 //ArrayList tan�mlad�k
		Random r = new Random();                                     //Random Rastgele say� �retmek
		for(int i=0;i<adet;i++) liste.add(r.nextInt(son-ilk)+ilk);
		return liste;
	}

	public static void main(String[] args) {
		// Bir liste tan�mlayarak i�ini 0-50 aras�nda rastgele �retilmi� 100 say� ile doldurunuz?
		// �lk soruda yap�lan i�lemi bir method ile ger�ekle�tirin?

		ArrayList<Integer> liste = uret (0,50,100);
		System.out.println(liste);
		
	}

}
