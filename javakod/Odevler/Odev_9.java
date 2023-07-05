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
		/* Oluþturulan sýnýf yapýlarýný nesne olarak tanýmlarsak proje dosyasýný alt yapýsýýný hazýrlar
		 * ve geriye methot döndürmeyen özel bir method yapýsýdýr
		 * */
		
		Odev_9 o = new Odev_9("Fatih Sultan Mehmet", "Ýstanbul", 100, 200);
		System.out.println(o.adSoyad);
		System.out.println(o.sehir);
		System.out.println(o.yas);
		System.out.println(o.galibiyet);
	}

}
