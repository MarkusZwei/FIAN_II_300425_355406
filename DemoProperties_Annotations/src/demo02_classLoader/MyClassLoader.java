package demo02_classLoader;

public class MyClassLoader extends ClassLoader{
	
	protected Class<?> findClass(String name, byte[] byteCode){
		return super.defineClass(name, byteCode, 0, byteCode.length);
	}
}
