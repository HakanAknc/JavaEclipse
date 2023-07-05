package Odevler;

public class Swıtch_Ornek {

	public static void main(String[] args) {
		// Not kar��l���

		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("M�kemmel Ge�tiniz");
			break;
		case 'B':
			System.out.println("�ok iyi ge�tiniz");
			break;
		case 'C':	
			System.out.println("�yi ge�tiniz");
			break;
		case 'D':	
			System.out.println("Zar zor ge�tiniz");
			break;
		case 'F':
			System.out.println("Malesef kald�n�z");
			break;
		default:
			System.out.println("Ge�ersiz bir say� girdiniz");			
		}
	}
}

