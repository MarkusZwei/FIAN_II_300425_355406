package musikshop.main;

import java.awt.EventQueue;

import musikshop.controller.MainController;

public class Application {
	public static void main(String[] args) {
		EventQueue.invokeLater(()->new MainController());
	}
}

