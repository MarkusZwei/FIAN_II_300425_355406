package demo03_annotations;

@interface Anno03{
	int i() default 0;
}

@Anno03 // i = 0
class MyClass03{
	
}

@Anno03(i = 10) //i = 10
class MyClass03_a{
	
}

public class Demo03_Default {

}
