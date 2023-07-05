package Odevler;

public class Metotlarda_Overloding {
	
	static void topla(int a, int b) {
		System.out.println(a+b);
	}
	
	static void topla(int a, int b, int c) {
		System.out.println(a+b+c);		
	}
	
	static float topla(float a,float b) {
		return a+b;
	}

	public static void main(String[] args) {
		//Overloding == Ayný isimden birden fazla bulunanbilen metotlara denir
		
		Metotlarda_Overloding d = new Metotlarda_Overloding();   //Dosyayý kaydettiðin þekilde ismini yaz.
		
		d.topla(11, 13);
		d.topla(11, 13, 17);
		d.topla((float) 47f,(float) 7f);
	}

}
