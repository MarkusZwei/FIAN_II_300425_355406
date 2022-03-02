package demo02_exceptions.pak05exceptions;

public class Demo01_TryCatch {
	public static void main(String[] args) {
		/*
		 * Ein Try tritt niemals eigenständig auf
		 * 
		 * Als Block immer mit Catch und/oder finally
		 * 
		 */
		
		//Minimum
		try {
			
		}catch(Exception e) {
			
		}
		
		String text = "Hallo Welt";
//		for (int i = 0; i <= text.length(); i++) {
//			try {
//				System.out.println(text.charAt(i));				
//			}catch(StringIndexOutOfBoundsException sioobe) {
//				sioobe.printStackTrace();
//			}
//		}
//		
		int[] arr = {1,2,3};
		int summe = 0;
//		
//		for (int i = 0; i <= arr.length; i++) {
//			try {
//				summe += arr[i];				
//			}catch(ArrayIndexOutOfBoundsException aioobe) {
//				aioobe.printStackTrace();
//			}			
//		}
		/*
		 * Wenn mehrere Exceptions abgefangen werden:
		 * Die speziellere Exception muss über den 
		 * allgemeineren stehen, wenn sich die Exceptions 
		 * im selben Hierarchiezweig befinden
		 * 
		 */
		for (int i = 0; i < 15; i++) {
			try {
				text.charAt(i);
				summe += arr[i];
			}
			catch(NullPointerException npe) {
				
			}
			catch(StringIndexOutOfBoundsException sioobe) {
				System.out.println("String nicht lang genug");
			}
			catch(ArrayIndexOutOfBoundsException aioobe) {
				System.out.println("Array nicht lang genug");
			}
			catch(Exception e) {
				System.out.println("Unbekannter Fehler");
			}
		}
		
		System.out.println("Programm beendet");
	}
}
