package Odevler;

import java.util.Random;

public class Odev_6 {
		//matrisUret(), matrisYaz() ve matrisTranspozu() methodlarını tanımlayarak, kullanıcıdan satır ve sütun büyüklüklerini aldınığız 
		//bir matrisi üretip, transpozesini yazdırınız.

	static int[][] matrisUret(int satir,int sutun){
		int[][] m = new int[satir][sutun];
		Random r = new Random();
		int i,j;
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				m[i][j] = r.nextInt(5);
			}
		}
		return m;		
	}

	static void matrisYaz(int[][] m,int satir,int sutun) {
		int i,j;
		System.out.println("---------");
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				System.out.print(m[i][j]+"  ");
			}
			System.out.println();
		}
	}

	static int[][] matrisTranspozu(int[][] m1,int[][] m2,int satir, int sutun){
		int[][] mt = new int[satir][sutun];
		int i,j;
		for(i=0;i<satir;i++) {
			for(j=0;j<sutun;j++) {
				mt[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return mt;	
	}

	public static void main(String[] args) {

		int[][] m1 = matrisUret(3,4);
		int[][] m2 = matrisUret(3,4);
		int[][] mt = matrisTranspozu(m1,m2,3,4);
		matrisYaz(m1,3,4);
		matrisYaz(m2,3,4);
		matrisYaz(mt,3,4);


	}

}
