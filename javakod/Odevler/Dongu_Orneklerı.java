package Odevler;

public class Dongu_Orneklerı {

	public static void main(String[] args) {
		//While D�ng�s� �rnek

		int i = 1;
		while(i<10) {
			System.out.println(i);
			i+=3;  // i++ ve i+=1 ayn� �eydir
		}
		System.out.println("While d�ng�s� bitti.");


		//for d�ng�s� �rnek

		for(int a = 1;a<=10;a++) {      //i++ ve i+=1 ayn� �eydir.
			System.out.println(a);
		}
		System.out.println("For D�ng�s� bitti.");

		//Do-while d�ng�s� �rnek
		//Do-while d�ng�s� �art sa�land��nda While d�ng�s� ile ayn� �al���r tek fark� ko�ul sa�lanm�yorsa bile kodu bir kere �al��t�r�r.

		int b = 100;  
		do {
			System.out.println(b);
			b++;
		} while (b<10);

		System.out.println("Do-while d�ng�s� bitti.");	//Kodu en az birkere �al��t�r�r
		
	}

}
