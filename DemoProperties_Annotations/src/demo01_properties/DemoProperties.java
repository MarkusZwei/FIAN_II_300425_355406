package demo01_properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class DemoProperties {
	public static void main(String[] args) {
//		writeProperties();
//		readProperties();
		demoSystemProperties();
		
		
	}

	private static void demoSystemProperties() {
		System.out.println("-------------- System -----------------------");
		System.out.println(System.getProperties());
		
		Properties props = System.getProperties();
		Set<Object> alleKeys = props.keySet();
		
		for(Object key : alleKeys) {
			System.out.print(key + " = ");
			System.out.println(props.getProperty(key.toString()));
		}
		System.setProperty("java.version", "1.0");
		System.out.println(props.get("java.version"));
		
		
		File file = new File(System.getProperty("user.home"));
		System.out.println("Freie GB: " + Math.round(file.getFreeSpace() / (1024 *1024 * 1024)));
		System.out.println("Komplette GB: " + Math.round(file.getTotalSpace() / (1024 *1024 * 1024)));
		
		String path = "c:" + System.getProperty("file.separator");
		for(String s: new File(path).list()) {
			File f = new File(path + s);
			System.out.println("Datei: " + f);
		}
		
		
		
	}

	private static void readProperties() {
		File f = new File("MyProperties.properties");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			Properties prop = new Properties();
			prop.load(br);
			Set<Object> alleKeys = prop.keySet();
			System.out.println("-----------------");
			alleKeys.forEach(k->System.out.println("Key: " + k + " = " + prop.get(k)));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	private static void writeProperties() {
		File f = new File("MyProperties.properties");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			Properties prop = new Properties();
			
			prop.setProperty("db.url", "localhost");
			prop.setProperty("db.user", "username");
			prop.setProperty("db.password", "passwort");
			
			prop.store(bw, "ein Kommentar");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
