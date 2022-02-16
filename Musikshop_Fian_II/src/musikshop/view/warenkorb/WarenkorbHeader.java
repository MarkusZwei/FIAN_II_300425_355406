package musikshop.view.warenkorb;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarenkorbHeader extends JPanel {

	private JButton btnZurKasse;
	private JLabel lblTotalPrice;

	public JButton getBtnZurKasse() {
		return btnZurKasse;
	}

	public void setBtnZurKasse(JButton btnZurKasse) {
		this.btnZurKasse = btnZurKasse;
	}

	public JLabel getLblTotalPrice() {
		return lblTotalPrice;
	}

	public void setLblTotalPrice(JLabel lblTotalPrice) {
		this.lblTotalPrice = lblTotalPrice;
	}

	public WarenkorbHeader() {
		this.setBounds(0, 0, 1008, 40);
		this.setLayout(null);

		var lbl1 = new JLabel("Warenkorb");
		lbl1.setBounds(0, 0, 691, 40);
		this.add(lbl1);
		
		this.setLblTotalPrice(new JLabel("Preis Total: "));
		this.getLblTotalPrice().setBounds(691, 0, 195, 40);
		this.add(this.getLblTotalPrice());
		
		this.setBtnZurKasse(new JButton("Zur Kasse"));
		this.getBtnZurKasse().setBounds(907, 9, 100, 23);
		this.add(this.getBtnZurKasse());
		
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getBtnZurKasse().addActionListener(al);		
	}
}
