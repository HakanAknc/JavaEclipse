package Odevler;

public class Fıbonacı_Sayıları {

	public static void main(String[] args) {
		// Fibonacci say�alr�n�n ilk on tanesini hem for d�ng�s� ile hemde while ile bulal�m.
		//for ile ��z�m�

		int a,b,c,i,sayac;
		a = 0; b = 1; c = 0; sayac = 0;
		for(i=0;i<10;i++) {
			c = a + b;
			System.out.println(c);
			a=b;
			b=c;
		}

		//while ile ��z�m�
		System.out.println("----------");
		
		a=c=0; b=1;
		while (sayac<10) {
			c = a + b;
			System.out.println(c);
			a=b;
			b=c;
			sayac++;
		}

	}

}
