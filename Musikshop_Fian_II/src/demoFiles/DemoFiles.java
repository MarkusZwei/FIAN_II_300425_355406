package demoFiles;

import java.io.File;

import javax.swing.ImageIcon;

public class DemoFiles {
	public static void main(String[] args) {
		File f = new File("C:/Unterricht/Workspaces_Unterricht/FIAN_II_300425_355406/Musikshop_Fian_II/resources/wk.png");
		System.out.println(f.exists());
		
		File f1 = new File("./resources/test.txt");
		System.out.println(f1.exists());
		
		ImageIcon img = new ImageIcon(DemoFiles.class.getResource("/wk.png"));
		
		System.out.println(img.getIconHeight());
	}
}
