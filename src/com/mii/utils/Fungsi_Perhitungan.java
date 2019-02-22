package com.mii.utils;

import java.util.ArrayList;
import java.util.Random;

public class Fungsi_Perhitungan {
	/**
	 * method int getFaktorial, dengan rumus n!
	 * input=5 output=120
	 * @param a
	 * @return angkaaawal
	 */
	public static int getFaktorial(int a) {
		int angkaawal = 1;
		if (a == 0) {
			return 1;
		} else if (a < 0) {
			System.out.println("angka salah");
			return 0;
		} else {
			for (int i = a; i > 0; i--) {
				angkaawal *= i;
			}
			return angkaawal;
		}
	}

	/**
	 * method double getPerkalian dengan rumus angka1 * angka2
	 * @param ke1 angka1
	 * @param ke2 angka2
	 * @return angka1*angka2
	 */
	public static double getPerkalian(double angka1, double angka2) {
		return angka1 * angka2;
	}

	/**
	 * method double getPerpangkatan
	 * untung membantu for, disini menggunakan Math.abs untuk menghindari perulangan < 0
	 * jika parameter pangkat < 0 maka nanti hasilnya 1/hasil
	 * @param angka
	 * @param pangkat
	 * @return hasil
	 */
	public static double getPerpangkatan(double angka, double pangkat) {
		double hasil = angka;
		for (int i = 1; i < Math.abs(pangkat); i++) {
			hasil *= angka;
		}
		if (pangkat < 0) {
			hasil = 1 / hasil;
		}else if (pangkat==0) {
			hasil = 1;
		}
		return hasil;
	}

	 /**
	  * method int getPermutasi, dengan rumus awal n!/(n-p)!
	  * dengan error handling a atau b <0
	  * @param a
	  * @param b
	  * @return getFaktorial(a) / (getFaktorial(a - b))
	  */
	public static int getPermutasi(int a, int b) {
		if (a < 0 || b < 0) {
			System.out.println("angka tidak boleh <=0");
			return 0;
		}
		return getFaktorial(a) / (getFaktorial(a - b));
	}

	/**
	 * method int getKombinasi, dengan rumus awal n!/p!(n-p)!
	 * dengan error handling a atau b <0 atau a<=b
	 * @param a
	 * @param b
	 * @return getPermutasi(a, b) / getFaktorial(b)
	 */
	public static int getKombinasi(int a, int b) {
		if (a <= 0 || b <= 0) {
			System.out.println("angka tidak boleh <= 0");
			return 0;
		} else if (a < b) {
			System.out.println("angka a tidak boleh < b");
			return 0;
		}
		return getPermutasi(a, b) / getFaktorial(b);
	}

	

	
	public static int[] getFibonacci(int a) {
		int arr[] = new int[a];
		for (int i = 0; i < a; i++) {
			if (i < 2) {
				arr[i] = i;
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		return arr;
	}
	/**
	 * method getFibonacci, dengan inputan 10 maka akan keluar angka 
	 * fibonaccinya <10 dan outputnya 0, 1, 1, 2, 3, 5, 8
	 * @param nilai inputan maximal
	 * @return fibo
	 */
	public static ArrayList<Integer> getFibonacci2(int nilaiMax) {
		ArrayList<Integer> fibo= new ArrayList<Integer>();
		int index2=0;
		for (int i = 0; index2< nilaiMax; i++) {
			if (i<2) {
				fibo.add(i);
			} else {
				index2=fibo.get(i-1)+fibo.get(i-2);
				if (index2<nilaiMax) {
					fibo.add(index2);
				}
			}
		}
		return fibo;
	}

//	public static int[] getPrima(int input) {
//		int[] primaa = new int[input];
//		int perulangan = 1, index = 0;
//		for (int a = 2; perulangan <= input; a++) {
//			int d = 0;
//			for (int c = 1; c <= a; c++) {
//				if (a % c == 0) {
//					d++;
//				}
//			}
//			if (d == 2) {
//				primaa[index] = a;
//				perulangan++;
//				index++;
//			}
//		}
//		return primaa;
//	}
	/**
     * Fungsi untuk mencari deret bilangan prima sampai batas nnilai tertentu
     * @param nilaiMax berisi batas nilai
     * @return array integer
     */
	public static ArrayList<Integer> getPrima(int nilaiMax) {
		ArrayList<Integer> prima = new ArrayList<Integer>();
		int n = 2;
		while (n < nilaiMax) {
			int d = 2;
			if (n == 2) {
				prima.add(n);
			} else {
				for (int a = 0; a < prima.size(); a++) {
					if (n % prima.get(a) == 0) {
						d += 1;
						break;
					}
				}
				if (d == 2) {
					prima.add(n);
				}
			}
			n++;
		}
		return prima;
	}

	public static int[] getRandomValue(int index) {
		int[] x = new int[index];
		Random rand = new Random();
		if (index<=0) {
			System.out.println("index tidak boleh <= 0");
		} else {
			for (int i = 0; i < index; i++) {
				x[i] = rand.nextInt(10);
			}
		}
		return x;
	}

    /**
     * Fungsi untuk menampilkan deret nilai random unik dimana sebuah angka tidak bisa muncul berulang
     * @param index berisi panjang deret
     * @return array integer
     */
	public static ArrayList<Integer> getRandomValueUniqe(int index) {
		Random rand = new Random();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		if (index<=0) {
			System.out.println("index tidak boleh <= 0");
		}
		while (arrayList.size() < index) {
			int a = rand.nextInt(10);
			if (!arrayList.contains(a)) {
				arrayList.add(a);
			}
		}
		return arrayList;
	}
	
    /**
     * Fungsi untuk menampilkan pecahan uang rupiah dari jumlah tertentu
     * @param index berisi jumlah uang yang akan dicari pecahannya
     * @return arr
     */
	public static int[][] getPecahanUang(int a) {
		int arr[][] = new int[10][2];
		for (int j = 0; j < 10; j++) {
			int[] pecahan = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };
			int jumlah = a / pecahan[j];
			a -= (pecahan[j] * jumlah);
			arr[j][0] = pecahan[j];
			arr[j][1] = jumlah;
		}
		return arr;
	}

}
