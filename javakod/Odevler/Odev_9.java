package Odevler;

public class Odev_9 {

	public String adSoyad;
	public String sehir;
	public int yas;
	public int galibiyet;

	public Odev_9(String adSoyad, String sehir, int yas, int galibiyet) {
		this.adSoyad=adSoyad;
		this.sehir=sehir;
		this.yas=yas;		 
		this.galibiyet=galibiyet;
	}
	public static void main(String[] args) {
		/* Olu�turulan s�n�f yap�lar�n� nesne olarak tan�mlarsak proje dosyas�n� alt yap�s��n� haz�rlar
		 * ve geriye methot d�nd�rmeyen �zel bir method yap�s�d�r
		 * */
		
		Odev_9 o = new Odev_9("Fatih Sultan Mehmet", "�stanbul", 100, 200);
		System.out.println(o.adSoyad);
		System.out.println(o.sehir);
		System.out.println(o.yas);
		System.out.println(o.galibiyet);
	}

}
