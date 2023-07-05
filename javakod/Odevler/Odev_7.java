package Odevler;

public class Odev_7 {
	
	static int boy = 1000;
	static int alan = 800;
	int yüzey = 5000;
	int kare = 4500;
	
	public static void main(String[] args) {
		/*Static = Sadece bir yerde �al���r ve sadece bir kere �al���r her hangi bir class yap�s�na ba�l� de�il
		 * ve static i�in haf�zada tek  bir yer a��l�r. Yani bellekte tek bir yerde tutulur
		 * Static == dura��n == de�i�mez
		 * */
		
		System.out.println(Odev_7.boy);
		//de�iskeni direk olarak odev_7 ile �a��r�yorum
		
		System.out.println(Odev_7.alan);
		//de�iskeni direk olarak odev_7 ile �a��r�yorum
		
		System.out.println("-----------");
		
		Odev_7 o = new Odev_7(); 
		System.out.println(o.yüzey);
		//odev_7 tipiyle normal �a��r�yorum
		
	}

}
