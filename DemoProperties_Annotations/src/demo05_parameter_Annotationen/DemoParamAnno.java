package demo05_parameter_Annotationen;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.PARAMETER)
@interface ParamAnno{
	int i() default 0;
}

public class DemoParamAnno {
	void methodWithParameterAnno(@ParamAnno Integer zahl) {
	
	}
	
	public static void main(String[] args) {
		Method[] methods = DemoParamAnno.class.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
		
		try {
			ParamAnno pa = (ParamAnno) DemoParamAnno.class.getDeclaredMethod("methodWithParameterAnno", Integer.class).getParameterAnnotations()[0][0];
			System.out.println(pa.i());
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
