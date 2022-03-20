package Odevler;

import java.util.Scanner;

public class Odev2 {

	public static void main(String[] args) {
		//Kullanýcýdan 0 ile 100 arasýnda sayý alýnýz.Sayý 50'den küçükse ekrana elliden küçük
		/*50'den büyükse elliden büyük yazdýrýn
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayý giriniz:");
		int sayi = scan.nextInt();
		
		
		
		if (sayi > 50) {
			System.out.println("50'den büyük");
		}else if (sayi < 50) {
			System.out.println("50'den küçük");
		}else {
			System.out.println("Geçerli bir sayý giriniz");
		}
	}

}
