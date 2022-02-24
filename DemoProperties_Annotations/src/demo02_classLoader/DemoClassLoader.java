package demo02_classLoader;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class DemoClassLoader {
	public static void main(String[] args) {
		/*
		 * Bootstrap Class Loader: It loads standard JDK class files from rt.jar and
		 * other core classes. It is a parent of all class loaders. It doesn't have any
		 * parent. When we call String.class.getClassLoader() it returns null, and any
		 * code based on it throws NullPointerException. It is also called Primordial
		 * ClassLoader. It loads class files from jre/lib/rt.jar. For example, java.lang
		 * package class.
		 * 
		 * Extensions Class Loader: It delegates class loading request to its parent. If
		 * the loading of a class is unsuccessful, it loads classes from jre/lib/ext
		 * directory or any other directory as java.ext.dirs. It is implemented by
		 * sun.misc.Launcher$ExtClassLoader in JVM.
		 * 
		 * System Class Loader: It loads application specific classes from the CLASSPATH
		 * environment variable. It can be set while invoking program using -cp or
		 * classpath command line options. It is a child of Extension ClassLoader. It is
		 * implemented by sun.misc.Launcher$AppClassLoader class. All Java ClassLoader
		 * implements java.lang.ClassLoader.
		 */
		
		System.out.println("ClassLoader von ArrayList: " + ArrayList.class.getClassLoader());
		
		System.out.println("ClassLoader von Katze: " + Katze.class.getClassLoader());
		
		Katze k = new Katze();
		
		try {
			//Bytecode der Katze holen
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream("bin/demo02_classLoader/Katze.class"));
			ByteArrayOutputStream baos = new ByteArrayOutputStream();			
			int i;
			while ((i = bis.read()) != -1) {
				baos.write(i);
			}			
			byte[] byteCode = baos.toByteArray();
			
			MyClassLoader myClassLoader = new MyClassLoader();
			
			Class<?> katzeClass = myClassLoader.findClass("demo02_classLoader.Katze", byteCode);
			
			System.out.println(katzeClass.getClassLoader());
			
			Object k1 = katzeClass.newInstance();
			
			System.out.println(k1.getClass());
			System.out.println(k.getClass());
			
			System.out.println(k1.getClass() == k.getClass());
			
			//java.lang.ClassCastException: Beide Objekte wurden von unterschiedlichen Klassenobjekten erstellt.
			k = (Katze)k1;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
