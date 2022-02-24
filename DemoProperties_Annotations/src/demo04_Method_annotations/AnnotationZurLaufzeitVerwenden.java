package demo04_Method_annotations;

import java.lang.reflect.Method;

public class AnnotationZurLaufzeitVerwenden {
	public static void main(String[] args) {
		Method[] methods = KlasseMitAnnotation.class.getMethods();
		
		for(Method m : methods) {
			if(m.isAnnotationPresent(MyAnno.class)) {
				MyAnno ma = m.getAnnotation(MyAnno.class);
				System.out.println("Methode: " + m.getName());
				System.out.println("IntParam: " + ma.i());
				System.out.println("StringParam: " + ma.s());
				System.out.println("defParam: " + ma.defParam());
				for(String s:ma.defArrParam()) {
					System.out.println(s);
				}				
			}
		}
		
	}
}
