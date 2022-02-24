package demo03_annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface PluginVersion{
	int major();
	int minor();
}

@PluginVersion(major = 3, minor = 0)
class MyPlugin{
	
}

public class Demo01_Annotationen_selber_definieren {
	public static void main(String[] args) {
		PluginVersion version = MyPlugin.class.getAnnotation(PluginVersion.class);
		System.out.println(version);
		
		if(version.major() < 2) {
			System.out.println("Plugin Version zu alt");
		}else{
			System.out.println("Das Plugin kann verwendet werden.");
		}		
	}
}
