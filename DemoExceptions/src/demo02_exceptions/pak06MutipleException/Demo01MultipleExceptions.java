package demo02_exceptions.pak06MutipleException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01MultipleExceptions {
	public static void main(String[] args) {
		try {
			multi01(1);			
		}catch(IOException ioe) {
			System.out.println("Catched: " + ioe.getClass().getSimpleName());
		}
		
		try {
			multi01(1);			
		}catch(FileNotFoundException fnfe) {
			
		}catch(IOException ioe) {
			System.out.println("Catched: " + ioe.getClass().getSimpleName());
		}
		
		try {
			multi01_2(0);			
		}catch(Exception e) {
			
		}
		
		try {
			multi01_2(0);
		}catch(FileNotFoundException fnfe) {
			
		}catch(ClassNotFoundException cnfe) {
			
		}
		
		try {
			multi01_2(0);			
		}catch(FileNotFoundException | ClassNotFoundException e) {
			
		}
		
		try {
			multi02(1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			multi02(1);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(RuntimeException re) {
			
		}
	}
	
	/*
	 * 2 checked Exceptions
	 * gleicher Hierarchiebaum
	 */
	public static void multi01(int i) throws FileNotFoundException, IOException{
		if(i<=0) {
			System.out.println("Fehler im I/O");
			throw new IOException("Fehler im I/O");
		}else {
			System.out.println("Fehler in Datei");
			throw new FileNotFoundException("Fehler in Datei");
		}
	}
	/*
	 * 2 checked
	 * ungleicher Hierarchiebaum
	 */
	public static void multi01_2(int i)throws ClassNotFoundException, FileNotFoundException{
		if(i<=0) {
			System.out.println("Klasse nicht gefunden");
			throw new ClassNotFoundException("Klasse nicht gefunden");
		}else {
			System.out.println("Fehler in Datei");
			throw new FileNotFoundException("Fehler in Datei");
		}
	}
	
	/*
	 * 1 checked 1 unchecked
	 */
	public static void multi02(int i)throws RuntimeException, FileNotFoundException{
		if(i<=0) {
			System.out.println("Laufzeitfehler");
			throw new RuntimeException("Laufzeitfehler");
		}else {
			System.out.println("Fehler in Datei");
			throw new FileNotFoundException("Fehler in Datei");
		}
	}
	
	
}
