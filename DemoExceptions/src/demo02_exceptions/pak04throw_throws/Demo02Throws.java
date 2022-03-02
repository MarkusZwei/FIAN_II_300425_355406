package demo02_exceptions.pak04throw_throws;

public class Demo02Throws {
	public static void main(String[] args){
		dividierenTryCatch(1, 0);
		
		try {
			dividierenOhneTryCatch(1, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			weiterLeiter(1, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		doStuffRuntimeException();
		
	}	
	
	public static void doStuffRuntimeException() throws RuntimeException{
		throw new RuntimeException();
	}
	
	
	public static double weiterLeiter(double zahl1, double zahl2)throws Exception {
		return dividierenOhneTryCatch(zahl1, zahl2);
	}
	
	public static double dividierenOhneTryCatch(double zahl1, double zahl2)throws Exception {
		double result = 0;
		if(zahl2 == 0) {
			throw new Exception("Teiler war 0");
		}	
		result = zahl1/zahl2;
		return result;
	}
	
	public static double dividierenTryCatch(double zahl1, double zahl2) {
		double result = 0;
		
		if(zahl2 == 0) {
			try {
				throw new Exception("Teiler war 0");				
			}catch(Exception e) {
				System.out.println("Teiler wurde auf 1 gesetzt");
				zahl2 = 1;
			}
		}		
		result = zahl1/zahl2;
		return result;
	}
	

}
