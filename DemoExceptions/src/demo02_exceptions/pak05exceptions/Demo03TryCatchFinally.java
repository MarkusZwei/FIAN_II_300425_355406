package demo02_exceptions.pak05exceptions;

import java.util.Scanner;

public class Demo03TryCatchFinally {
	public static void main(String[] args) {

		try {

		} catch (Exception e) {

		} finally {

		}
		int[] arr = { 1, 2, 3 };
		int summe = 0;
		Scanner sc = new Scanner(System.in);

		try {
			for (int i = 0; i <= arr.length; i++) {
				summe += arr[i];
				System.out.println("try");
			}
		} catch (ArrayIndexOutOfBoundsException aioobe) {
//			aioobe.printStackTrace();
			System.out.println("Catch");
		}finally {
			System.out.println("Finally");
			sc.close();
			System.out.println("Scanner geschlossen");
		}
		System.out.println("Programm beendet");
	}
}
