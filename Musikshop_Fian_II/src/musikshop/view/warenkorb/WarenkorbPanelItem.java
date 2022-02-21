package musikshop.view.warenkorb;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import musikshop.model.data.WarenkorbItem;

public class WarenkorbPanelItem extends JPanel {
	private JLabel lblProductPicture;
	private JButton btnEntfernen;
	private JLabel lblProductName;
	private JLabel lblProductText;
	private JSpinner spinner;
	private JLabel lblEinzelpreis;
	private JLabel lblGesamtPreis;

	public JLabel getLblProductPicture() {
		return lblProductPicture;
	}

	public void setLblProductPicture(JLabel lblProductPicture) {
		this.lblProductPicture = lblProductPicture;
	}

	public JButton getBtnEntfernen() {
		return btnEntfernen;
	}

	public void setBtnEntfernen(JButton btnEntfernen) {
		this.btnEntfernen = btnEntfernen;
	}

	public JLabel getLblProductName() {
		return lblProductName;
	}

	public void setLblProductName(JLabel lblProductName) {
		this.lblProductName = lblProductName;
	}

	public JLabel getLblProductText() {
		return lblProductText;
	}

	public void setLblProductText(JLabel lblProductText) {
		this.lblProductText = lblProductText;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public void setSpinner(JSpinner spinner) {
		this.spinner = spinner;
	}

	public JLabel getLblEinzelpreis() {
		return lblEinzelpreis;
	}

	public void setLblEinzelpreis(JLabel lblEinzelpreis) {
		this.lblEinzelpreis = lblEinzelpreis;
	}

	public JLabel getLblGesamtPreis() {
		return lblGesamtPreis;
	}

	public void setLblGesamtPreis(JLabel lblGesamtPreis) {
		this.lblGesamtPreis = lblGesamtPreis;
	}

	public WarenkorbPanelItem() {
		setPreferredSize(new Dimension(980, 165));
		setLayout(null);

		this.setLblProductPicture(new JLabel());
		this.getLblProductPicture().setBackground(Color.ORANGE);
		this.getLblProductPicture().setOpaque(true);
		this.getLblProductPicture().setBounds(10, 11, 151, 103);
		this.add(this.getLblProductPicture());

		this.setBtnEntfernen(new JButton("Entfernen"));
		this.getBtnEntfernen().setBounds(31, 118, 109, 23);
		add(this.getBtnEntfernen());

		this.setLblProductName(new JLabel("New label"));
		this.getLblProductName().setBackground(new Color(152, 251, 152));
		this.getLblProductName().setOpaque(true);
		this.getLblProductName().setBounds(171, 11, 211, 23);
		add(this.getLblProductName());

		this.setLblProductText(new JLabel("New label"));
		this.getLblProductText().setOpaque(true);
		this.getLblProductText().setBackground(new Color(100, 149, 237));
		this.getLblProductText().setBounds(171, 45, 622, 96);
		add(this.getLblProductText());

		SpinnerNumberModel model = new SpinnerNumberModel(0, 0, 100, 1);
		this.setSpinner(new JSpinner(model));
		this.getSpinner().setBounds(843, 45, 50, 23);
		add(this.getSpinner());

		this.setLblEinzelpreis(new JLabel("Einzelpreis"));
		this.getLblEinzelpreis().setOpaque(true);
		this.getLblEinzelpreis().setBackground(new Color(135, 206, 250));
		this.getLblEinzelpreis().setBounds(803, 86, 143, 23);
		add(this.getLblEinzelpreis());

		this.setLblGesamtPreis(new JLabel("Gesamtpreis"));
		this.getLblGesamtPreis().setBackground(new Color(255, 99, 71));
		this.getLblGesamtPreis().setOpaque(true);
		this.getLblGesamtPreis().setBounds(803, 118, 143, 23);
		add(this.getLblGesamtPreis());
	}

	public WarenkorbPanelItem(String pictureText, String productName, String productText, double einzelpreis) {
		this();
		this.getLblProductPicture().setText(pictureText);
		this.getLblProductName().setText(productName);
		this.getLblProductText().setText(productText);
		this.getLblEinzelpreis().setText("" + einzelpreis);
	}

	public WarenkorbPanelItem(Icon icon, String productName, String productText, double einzelpreis) {
		this();
		this.getLblProductPicture().setIcon(icon);
		this.getLblProductName().setText(productName);
		this.getLblProductText().setText(productText);
		this.getLblEinzelpreis().setText("" + einzelpreis);
	}

	public WarenkorbPanelItem(WarenkorbItem item) {
		this();
		this.getLblProductPicture().setIcon(item.getArtikel().getIcon());
		this.getLblProductName().setText(item.getArtikel().getArtName());
		this.getLblProductText().setText(item.getArtikel().getArtBeschreibung());
		this.getLblEinzelpreis().setText("" + item.getArtikel().getPreis());
		this.getLblGesamtPreis().setText("" + item.getAnzahl() * item.getArtikel().getPreis());
		this.getSpinner().setValue(item.getAnzahl());
	}

}
