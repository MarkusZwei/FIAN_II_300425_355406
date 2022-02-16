package musikshop.view.main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {

	JMenuBar menuBar;
	List<JMenu> menuList;

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	public void setMenuBar(JMenuBar menuBar) {
		this.menuBar = menuBar;
	}

	public List<JMenu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<JMenu> menuList) {
		this.menuList = menuList;
	}

	public MenuPanel() {
		this.setBounds(0, 120, 1008, 30);
		this.setLayout(null);
		this.setBackground(Color.GREEN);
		this.setOpaque(true);

		this.setMenuBar(new JMenuBar());
		this.getMenuBar().setBounds(0, 0, 1008, 30);
		this.add(this.getMenuBar());
		this.initializeMenuList();
	}
	
	private void initializeMenuList() {
		this.setMenuList(new ArrayList<>());
		String[] menues = {"Klassik", "Pop", "Elektro"};
		Arrays.stream(menues).forEach(s-> this.getMenuList().add(new JMenu(s)));	
		this.getMenuList().forEach(item->this.getMenuBar().add(item));			
	}
}
