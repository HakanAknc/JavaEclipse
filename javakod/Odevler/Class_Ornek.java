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
		ogr1.soyad = "Ak�nc�";
		ogr1.yas = 20;
		ogr1.no = 2141510038;
		
		System.out.println("�sim = " +ogr1.ad);
		System.out.println("Soyisim = " +ogr1.soyad);
		System.out.println("Ya�� = " +ogr1.yas);
		System.out.println("Okul Numaras� = " +ogr1.no);
		
		
		
		
	}

}
