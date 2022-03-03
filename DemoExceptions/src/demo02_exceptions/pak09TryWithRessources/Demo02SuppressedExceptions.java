package demo02_exceptions.pak09TryWithRessources;

public class Demo02SuppressedExceptions {
	
	static class MyAutoCloseable implements AutoCloseable{
		@Override
		public void close() throws Exception {
			System.out.println("closed");	
			throw new RuntimeException("Beim Schliessen");
		}		
	}
	
	public static void main(String[] args) {
		try(var ma = new MyAutoCloseable()){
			throw new Exception("Fehler aufgetreten");
		}catch(Exception e) {
			System.out.println("Hauptexception : " + e.getMessage());
			for(Throwable t : e.getSuppressed()) {
				System.out.println("Suppressed: " + t.getMessage());
			}			
		}finally {
			System.out.println("Finally");
		}
	}
	
	
}
