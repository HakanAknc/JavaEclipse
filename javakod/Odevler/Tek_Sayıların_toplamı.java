package Odevler;

public class Tek_Sayıların_toplamı {

	public static void main(String[] args) {
		
		int sayi = 100;
        int toplam = 0;
 
        for(int i = 1; i <= sayi ; i++) {
        if (i % 2 != 0){
			System.out.println(i+" ");
		toplam = toplam+i;}
           
        }
        System.out.println("1'den 100'e kadar olan tek say�lar�n toplam�=" + toplam);
		System.out.println("-----------------------------------------------------");
        
		// faktoriyel hesaplama program�
		int faktoriyel = 1;
		int carpan = 1;
		while (carpan<=30) {
			faktoriyel *= carpan;
			System.out.println(carpan+" != "+faktoriyel);
			carpan++;
			
		}
        
        
		}

}
