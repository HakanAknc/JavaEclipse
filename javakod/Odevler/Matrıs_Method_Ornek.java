package Odevler;

import java.util.Scanner;

public class Matrıs_Method_Ornek {

	public static void main(String [] args) {
		//matrisUret(), matrisYaz() ve matrisTranspozu() methodlar�n� tan�mlayarak, kullan�c�dan sat�r ve s�tun b�y�kl�klerini ald�n���z 
		//bir matrisi �retip, transpozesini yazd�r�n�z.

		Scanner klavye = new Scanner(System.in);
		System.out.println("Sat�r say�s�n� giriniz.");
		int satir=klavye.nextInt();

		System.out.println("S�tun say�s�n� giriniz");
		int sutun = klavye.nextInt();

		int[][] matris1 = new int[satir][sutun];
		int[][] matris2 = new int[satir][sutun];

		for (int i=0; i < satir; i++)
		{
			for (int j=0; j < sutun; j++)
			{
				matris1[i][j]=(int)(Math.random()*10)+1;
				matris2[i][j]=(int)(Math.random()*10)+1;
			}
		}

		System.out.println("matris2:");
		matrisYazdir(matris2);

		System.out.println("matris2:");
		matrisYazdir(matris2);

	}

	public static void matrisYazdir(int[][] matris)
	{
		for (int i = 0; i < matris.length; i++) //matris.length = satir sayisi
		{
			for (int j = 0; j < matris[0].length; j++) { //matris[0].length=sutun sayisi
				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}
	}

}


