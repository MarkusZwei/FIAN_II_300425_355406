package demo04_Method_annotations;

public class KlasseMitAnnotation {
	
	@MyAnno(i =10, s = "Hallo")	
	public void doStuff() {
		try {
			System.out.println(KlasseMitAnnotation.class.getMethod("doStuff").getAnnotation(MyAnno.class).s());
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new KlasseMitAnnotation().doStuff();
	}
}
