package Odevler;

import java.util.ArrayList;
import java.util.Collections;

public class Lısteler_Sayısal_loto_örnek {

	public static void main(String[] args) {
		// 1-49 aras�nda tekrar etmeyen 6 say� se�elim 
		//Listeler Kullan�lacak
		
		ArrayList<Integer> liste = new ArrayList<>();
		
		for(int i=1;i<50;i++) liste.add(i);
		System.out.println(liste);
		
		Collections.shuffle(liste);
		System.out.println(liste);
		
		ArrayList<Integer> altili = new ArrayList<>(6);
		for(int i=0;i<6;i++) liste.add(liste.get(i));
		
		Collections.shuffle(liste);
		System.out.println(liste);
		
	}

}
