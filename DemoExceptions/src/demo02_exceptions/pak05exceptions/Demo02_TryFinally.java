package demo02_exceptions.pak05exceptions;

import java.util.Scanner;

public class Demo02_TryFinally {
	public static void main(String[] args) {
		
		int[] arr = new int[0];
		
		Scanner sc = new Scanner(System.in);
		/*
		 * "Try" tritt niemals eigenständig auf
		 * Als Block immer mit Catch und/oder Finally
		 * 
		 * Finally wird immer ausgeführt.
		 * Egal ob ein Fehler auftritt oder nicht
		 */
		//minimum
		try {
			System.out.println(arr[1]);
			
		}finally {
			//finally wird zum Aufraeumen verwendet
			sc.close();
			System.out.println("Scanner geschlossen");
		}
		
		System.out.println("Programmende");
	}
}
