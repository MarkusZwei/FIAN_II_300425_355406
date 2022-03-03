package demo02_exceptions.pak09TryWithRessources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Demo01TryWithRessources {
	public static void main(String[] args) {
//		demoWithoutRessources();
//		demoTryWithRessources();
//		demoWithOwnRessource01();
		demoWithOwnRessource02();
	}

	
	
	
	private static void demoWithOwnRessource02() {
		try(var al = new MyAutoCloseableArrayList<String>()){
			al.add("Hallo");
			al.add("Welt");
			System.out.println(al);
		}catch(Exception e) {
			System.out.println("Fehler aufgetreten");
		}
		
	}




	private static void demoWithOwnRessource01() {
		class MyAutoClosableClass implements AutoCloseable{
			@Override
			public void close() throws Exception {
				System.out.println("Ressource geschlossen");
			}			
		}
		
		try(MyAutoClosableClass ma = new MyAutoClosableClass()){
			throw new RuntimeException();
		}catch(Exception e) {
			
		}finally {
			System.out.println("Finally");
		}
		
	}




	private static void demoTryWithRessources() {				
		try(BufferedReader br = new BufferedReader(new FileReader(new File("c:/Java/test.txt")))){
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void demoWithoutRessources() {
		File f = new File("c:/Java/test.txt");		
		FileReader fr = null;
		try {
			fr = new FileReader(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
	}
	
	
}

class MyAutoCloseableArrayList<E> extends ArrayList<E> implements AutoCloseable{
	@Override
	public void close() throws Exception {
		this.clear();
		System.out.println("Liste wurde bereinigt");
	}	
}


