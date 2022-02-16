package musikshop.view.main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class HeaderPanel extends JPanel {

	JLabel logoLabel;
	JTextField suchFeld;
	JButton btnSuchen;
	JButton btnWarenKorb;

	public JLabel getLogoLabel() {
		return logoLabel;
	}

	public void setLogoLabel(JLabel logoLabel) {
		this.logoLabel = logoLabel;
	}

	public JTextField getSuchFeld() {
		return suchFeld;
	}

	public void setSuchFeld(JTextField suchFeld) {
		this.suchFeld = suchFeld;
	}

	public JButton getBtnSuchen() {
		return btnSuchen;
	}

	public void setBtnSuchen(JButton btnSuchen) {
		this.btnSuchen = btnSuchen;
	}

	public JButton getBtnWarenKorb() {
		return btnWarenKorb;
	}

	public void setBtnWarenKorb(JButton btnWarenKorb) {
		this.btnWarenKorb = btnWarenKorb;
	}

	public HeaderPanel() {
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
		this.setBounds(0, 0, 1008, 120);
		this.setBackground(Color.GRAY);
		
		this.setLogoLabel(new JLabel("Logo", SwingConstants.CENTER));
		this.getLogoLabel().setPreferredSize(new Dimension(80,80));
		this.getLogoLabel().setBackground(Color.ORANGE);
		this.getLogoLabel().setOpaque(true);
		this.add(this.getLogoLabel());
		
		this.setSuchFeld(new JTextField(50));
		this.getSuchFeld().setFont(new Font("Arial", Font.PLAIN, 16));
		this.add(this.getSuchFeld());
		
		this.setBtnSuchen(new JButton("Suchen"));
		this.getBtnSuchen().setPreferredSize(new Dimension(90,90));
		this.add(this.getBtnSuchen());
		
		this.setBtnWarenKorb(new JButton("Warenkorb"));
		this.getBtnWarenKorb().setPreferredSize(new Dimension(90,90));
		this.add(this.getBtnWarenKorb());
//		ImageIcon icon = new ImageIcon(this.getClass().getResource("/wk.png"));
//		Image img = icon.getImage();
//		Image resizedImg = img.getScaledInstance(50, 50, 0);		
//		this.getBtnWarenKorb().setIcon(new ImageIcon(resizedImg));
		this.getBtnWarenKorb().setIcon(new ImageIcon(new ImageIcon(this.getClass().getResource("/wk.png")).getImage().getScaledInstance(50, 50, 0)));
		

	}
}



