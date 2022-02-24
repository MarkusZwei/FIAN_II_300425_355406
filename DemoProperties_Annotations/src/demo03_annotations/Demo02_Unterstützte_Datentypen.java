package demo03_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

enum MyEnum {
	A, B, C
}

@Retention(RetentionPolicy.RUNTIME)
@interface Anno02 {
	// alle primitiven Dt
	int i();

	double d();

	// Nur wenige Referenzdatentypen
	String s();

	Class<?> c();

	MyEnum e();

	PluginVersion a();

	// Arrays von den aufgelisteten Datentypen
	String[] arr();

//	Object o();
}

@Anno02(i = 2, d = 2.0, s = "Hallo Welt", c = Integer.class, e = MyEnum.A, a = @PluginVersion(major = 3, minor = 0), arr = {
		"a", "b", "c" })
class MyClass02 {

}

public class Demo02_Unterstützte_Datentypen {

	public static void main(String[] args) {
		Anno02 anno02 = MyClass02.class.getAnnotation(Anno02.class);
		System.out.println(anno02.i());
		System.out.println(anno02.d());
		
		
		for(String s : anno02.arr()) {
			System.out.println(s);
		}
		
	}
	
}
