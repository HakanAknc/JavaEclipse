package Odevler;

import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		greet();
	} 	
	public static void greet() {
		System.out.println("Ýsminiz");
		Scanner scanner = new Scanner(System.in);
		String userName = scanner.nextLine();
		System.out.println("Hoþgeldin " + userName);
		
	}

}
