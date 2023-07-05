package Odevler;

import java.util.Scanner;

public class Not_Hesaplama {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Vize notunuzu giriniz:");
		int vize = scan.nextInt();
		System.out.print("Final notunuzu giriniz:");
		int fınal = scan.nextInt();

		double not = (vize * 0.4) + (fınal * 0.6);

		if (vize > 100 || fınal > 100 || vize < 0 || fınal < 0) {
			System.out.println("Fazla u�tun ASLAN PAR�ASI...");
		}else {
			System.out.println("Y�l sonu not ortalamn�z= " + not);
		}
		if((not >= 95) && (not <= 100)) {
			System.out.println("AA ile dersi ge�tiniz.");
		}
		else if((not >= 90) && (not <= 94)) {
			System.out.println("BA+ ile dersi ge�tiniz.");
		}
		else if((not >= 85) && (not <= 89)) {
			System.out.println("BA ile dersi ge�tiniz.");
		}
		else if((not >= 80) && (not <= 84)) {
			System.out.println("BB+ ile dersi ge�tiniz.");
		}
		else if((not >= 75) && (not <= 79)) {
			System.out.println("BB ile dersi ge�tiniz.");
		}
		else if((not >= 70) && (not <= 74)) {
			System.out.println("CB+ ile dersi ge�tiniz.");
		}
		else if((not >= 65) && (not <= 69)) {
			System.out.println("CB ile dersi ge�tiniz.");
		}
		else if((not >= 60) && (not <= 64)) {
			System.out.println("CC+ ile dersi ge�tiniz.");
		}
		else if((not >= 55) && (not <= 59)) {
			System.out.println("CC ile ko�ulu ge�tiniz.");
		}
		else if((not >= 50) && (not <= 54)) {
			System.out.println("DC ile ko�ulu ge�tiniz.");
		}
		else if((not >= 45) && (not <= 49)) {
			System.out.println("DD ile kald�n�z.");
		}
		else if((not >= 40) && (not <= 44)) {
			System.out.println("FD ile kald�n�z.");
		}
		else if((not < 40)) {
			System.out.println("FF ile kald�n�z.");
		}
	
	}	

}		
