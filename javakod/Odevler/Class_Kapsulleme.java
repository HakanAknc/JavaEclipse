package Odevler;

class Ogrenci1 {
	private String ad;
	private String soyad;
	private int yas;
	private int no;

	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		if(yas>0) this.yas = yas; 
		else System.out.println("Yaþ sýfýrdan küçük olamaz aslan parçasý.");
	}
	public int getno() {
		return no;
	}
	public void setno(int no) {
		 this.no = no; 
	}
	
}

public class Class_Kapsulleme {

	public static void main(String[] args) {
		Ogrenci1 ogre1 = new Ogrenci1();

		ogre1.setAd("Hakan");
		System.out.println(ogre1.getAd());
		
		ogre1.setSoyad("Akýncý");
		System.out.println(ogre1.getSoyad());
		
		ogre1.setYas(20);
		System.out.println(ogre1.getYas());
		
		ogre1.setno(2141510038);
		System.out.println(ogre1.getno());	
		
	}

}
