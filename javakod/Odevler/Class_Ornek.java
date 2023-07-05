package Odevler;

class Ogrenci{
	String ad;
	String soyad;
	int yas;
	int no;
	
}

public class Class_Ornek {

	public static void main(String[] args) {
		
		Ogrenci ogr1 = new Ogrenci();
		
		ogr1.ad = "Hakan";
		ogr1.soyad = "Akýncý";
		ogr1.yas = 20;
		ogr1.no = 2141510038;
		
		System.out.println("Ýsim = " +ogr1.ad);
		System.out.println("Soyisim = " +ogr1.soyad);
		System.out.println("Yaþý = " +ogr1.yas);
		System.out.println("Okul Numarasý = " +ogr1.no);
		
		
		
		
	}

}
