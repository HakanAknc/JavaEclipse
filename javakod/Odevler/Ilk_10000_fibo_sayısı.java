package Odevler;

public class Ilk_10000_fibo_sayısı {

	public static void main(String[] args) {
		//0'dan 10000'e kadar olan fibonaci say�s�n� buldural�m

		int a,b,c;
		a=0; b=1; c=0;
		int sayac=0;

		while (c<10000) {
			c=a+b;
			a=b;
			b=c;
			if(c>10000) break;
			System.out.print(c+ " - ");
			sayac++;
		}

	}

}
