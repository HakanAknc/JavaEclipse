package Odevler;

public class Tek_Sayýlarýn_toplamý {

	public static void main(String[] args) {
		
		int sayi = 100;
        int toplam = 0;
 
        for(int i = 1; i <= sayi ; ++i) {
        if (i%2!=0){
			System.out.println(i+" ");
		toplam = toplam+i;}
           
        }
 
        System.out.println("1'den 100'e kadar olan tek sayýlarýn toplamý="+toplam);
		
		}

}
