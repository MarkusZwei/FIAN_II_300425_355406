package demo03_annotations;


@interface Pfad{
	String value();
	int i() default 0;
}

@Pfad("abc")
class MyClass04{
	
}
public class Demo04_Value {

}
