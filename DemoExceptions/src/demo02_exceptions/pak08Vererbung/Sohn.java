package demo02_exceptions.pak08Vererbung;

import demo02_exceptions.pak07myException.p01myRuntimeException.Konto;

public class Sohn extends Vater{
	
	/*
	 * In der Verbung dürfen keine neuen Checkted Exceptions
	 * in einer überschriebenen Methode hinzugefügt werden
	 */
//	@Override
//	public void except01() throws Exception{
//		System.out.println("Sohn");
//		try {
//			throw new Exception();			
//		}catch(Exception e) {
//			System.out.println("Fehler behandelt");
//		}
//	}
	
	/*
	 * In der Vererbung dürfen neue unchecked Exceptions
	 * in der überschriebenen Methode hinzugefügt werden
	 */
	@Override
	public void except01() throws RuntimeException{
		
	}
	
	/*
	 * In der Vererbung müssen wir die deklarierten Exceptions nicht weiterführen,
	 * wenn die Methode der Oberklasse nich einbezogen wird.
	 * 
	 * Das heisst, die Anzahl der Exceptions darf verringert werden
	 */
	
//	@Override
//	public void except02(){
//		try {
//			throw new Exception("");			
//		}catch(Exception e) {
//			
//		}
//	}
	
	@Override
	public void except02() throws Exception{
		super.except02();
	}
	/*
	 * Wir dürfen die Exception der Oberklasse nicht verallgemeinern
	 */
//	@Override
//	public void except03() throws Exception{
//	}
	
	/*
	 * Die überschriebene Methode darf speziellere oder weniger
	 * Exceptions werfen
	 */
	@Override
	public void except03() throws ClassNotFoundException{
		
	}
	
	/*
	 * Bei Unchecked Exceptions gelten die Regeln bezüglich verallgemeinern 
	 * oder "new" nicht
	 */	
	@Override
	public void except04() throws IndexOutOfBoundsException {
		
	}
	
	public static void main(String[] args) {
		Vater v = new Sohn();
		Sohn s = new Sohn();
		v = s;
				
		v.except01();
		
		try {
			v.except02();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			v.except03();
		} catch (ReflectiveOperationException e) {
			
			e.printStackTrace();
		}
		
	}
}
