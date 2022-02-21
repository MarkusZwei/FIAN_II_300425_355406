package musikshop.view.suche;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.SystemColor;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JSpinner;

public class SearchResult extends JPanel {
	private JLabel lblProductPicture;
	private JLabel lblProductText;
	private JButton btnWarenkorb;
	private JLabel lblProductName;
	private JLabel lblPreis;
	private JSpinner spinner;

	public JLabel getLblProductPicture() {
		return lblProductPicture;
	}

	public void setLblProductPicture(JLabel lblProductPicture) {
		this.lblProductPicture = lblProductPicture;
		
	}

	public JLabel getLblProductText() {
		return lblProductText;
	}

	public void setLblProductText(JLabel lblProductText) {
		this.lblProductText = lblProductText;
		
	}

	public JButton getBtnWarenkorb() {
		return btnWarenkorb;
	}

	public void setBtnWarenkorb(JButton btnWarenkorb) {
		this.btnWarenkorb = btnWarenkorb;
		
	}

	public JLabel getLblProductName() {
		return lblProductName;
	}

	public void setLblProductName(JLabel lblProductName) {
		this.lblProductName = lblProductName;
	}

	public JLabel getLblPreis() {
		return lblPreis;
	}

	public void setLblPreis(JLabel lblPreis) {
		this.lblPreis = lblPreis;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public void setSpinner(JSpinner spinner) {
		this.spinner = spinner;
	}

	/**
	 * Create the panel.
	 */
	public SearchResult() {
		setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(112, 128, 144), null));
		setPreferredSize(new Dimension(980, 110));
		setLayout(null);

		this.setLblProductPicture(new JLabel("New label"));
		this.getLblProductPicture().setBackground(Color.ORANGE);
		this.getLblProductPicture().setBounds(2, 2, 115, 106);
		this.getLblProductPicture().setOpaque(true);
		add(this.getLblProductPicture());

		this.setLblProductText(new JLabel("New label"));
		getLblProductText().setBounds(122, 27, 606, 81);
		getLblProductText().setOpaque(true);
		getLblProductText().setBackground(SystemColor.activeCaption);
		add(getLblProductText());

		this.setBtnWarenkorb(new JButton("Warenkorb"));
		this.getBtnWarenkorb().setBounds(868, 76, 110, 23);
		add(this.getBtnWarenkorb());

		this.setLblProductName(new JLabel("New label"));
		this.getLblProductName().setBounds(122, 2, 73, 23);
		add(this.getLblProductName());

		JLabel lblPreisTitel = new JLabel("Einzelpreis");
		lblPreisTitel.setBounds(738, 48, 64, 14);
		add(lblPreisTitel);

		this.setLblPreis(new JLabel("0,0"));
		this.getLblPreis().setBounds(812, 48, 46, 14);
		add(this.getLblPreis());

		this.setSpinner(new JSpinner());
		this.getSpinner().setBounds(907, 27, 30, 20);
		add(this.getSpinner());
		
	}

	public SearchResult(String pictureText, String productText) {
		this();
		this.getLblProductPicture().setText(pictureText);
		this.getLblProductText().setText(productText);
	}

	public SearchResult(Icon icon, String productText) {
		this();
		this.getLblProductPicture().setIcon(icon);
		this.getLblProductText().setText(productText);
	}

	public SearchResult(String pictureText, String productText, String productName, double preis) {
		this();
		this.getLblProductPicture().setText(pictureText);
		this.getLblProductText().setText(productText);
		this.getLblProductName().setText(productName);
		this.getLblPreis().setText("" + preis);
	}
	
	public SearchResult(Icon icon, String productText, String productName, double preis) {
		this();
		this.getLblProductPicture().setIcon(icon);
		this.getLblProductText().setText(productText);
		this.getLblProductName().setText(productName);
		this.getLblPreis().setText("" + preis);
	}
}
