package musikshop.view.main;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import musikshop.model.data.Warenkorb;
import musikshop.model.interfaces.Artikel;

public class MainFrame extends JFrame {

	private MainPanel mainPanel;

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;

	}

	public MainFrame() {
		this.initialize();
	}

	private void initialize() {
		this.setTitle("Musikshop");
		this.setResizable(false);
		this.setBounds(300, 300, 1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMainPanel(new MainPanel());
		this.setContentPane(this.getMainPanel());
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}		
		this.setVisible(true);
	}

	public void addActionListenerToBtnWarenkorb(ActionListener al) {
		this.getMainPanel().getTopPanel().getBtnWarenKorb().addActionListener(al);
	}

	public void addActionListenerToBtnSuchen(ActionListener al) {
		this.getMainPanel().getTopPanel().getBtnSuchen().addActionListener(al);
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getMainPanel().addActionListenerToBtnKasse(al);

	}

	public void changeViewToSearch() {
		this.getMainPanel().changeView(true, false, false);
	}

	public void changeViewToWarenkorb() {
		this.getMainPanel().changeView(false, true, false);
	}

	public void changeViewToKasse() {
		this.getMainPanel().changeView(false, false, true);
	}

	public void displaySearchResults(List<Artikel> list) {
		this.getMainPanel().displaySearchResults(list);
	}

	public void addActionListenerToSearchResultItems(ActionListener al) {
		this.getMainPanel().addActionListenerToSearchResultItems(al);
	}

	public void updateWKView(Warenkorb warenkorb) {
		this.getMainPanel().updateWKView(warenkorb);

	}

	public void addActionListenerToBtnAbsenden(ActionListener al) {
		this.getMainPanel().addActionListenerToBtnAbsenden(al);
	}

	public void addChangeListenerToWarenkorbSpinner(ChangeListener al) {
		this.getMainPanel().addChangeListenerToWarenkorbSpinner(al);		
	}
}
