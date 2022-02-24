package demo06_reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class DemoReflection {
	public static void main(String[] args) throws Exception {
		Class<Person> personClass = Person.class;
		Field[] fields = personClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(i + " : " + fields[i].getName());
		}
		Person p = new Person("Max", "Mustermann", 30);
		fields[2].setInt(p, 100);
		System.out.println("Max neues Alter: " + p.age);
		fields[0].set(p, "Klaus");
		System.out.println(p.firstName);

		fields[1].setAccessible(true);
		fields[1].set(p, "Klausmann");
		System.out.println(p.getLastName());

		Method[] methods = personClass.getDeclaredMethods();
		for (Method m : methods) {
			for (Parameter param : m.getParameters()) {
				System.out.println(param.getType().getSimpleName());
			}
			if (m.getName().equals("meinePrivateMethode")) {
				m.setAccessible(true);
				m.invoke(p, "Hallo");
			}
		}

	}
}
