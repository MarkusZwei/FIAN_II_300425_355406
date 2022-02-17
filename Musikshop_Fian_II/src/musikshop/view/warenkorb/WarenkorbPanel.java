package musikshop.view.warenkorb;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import musikshop.model.data.Warenkorb;

public class WarenkorbPanel extends JPanel {

	private WarenkorbHeader wkHeader;
	private List<WarenkorbItem> cartItems;
	private JPanel cartPanel;

	public WarenkorbHeader getWkHeader() {
		return wkHeader;
	}

	public void setWkHeader(WarenkorbHeader wkHeader) {
		this.wkHeader = wkHeader;
	}

	public List<WarenkorbItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<WarenkorbItem> cartItems) {
		this.cartItems = cartItems;
	}

	public JPanel getCartPanel() {
		return cartPanel;
	}

	public void setCartPanel(JPanel cartPanel) {
		this.cartPanel = cartPanel;
	}

	public WarenkorbPanel() {
		this.setCartItems(new ArrayList<>());
		for (int i = 0; i < 10; i++) {
			this.getCartItems().add(new WarenkorbItem("Icon " + i, "ItemName" + i, "Item Beschreibung " + i, i));
		}

		this.setBounds(0, 150, 1008, 579);
		this.setLayout(null);

		this.setWkHeader(new WarenkorbHeader());
		this.add(this.getWkHeader());

		var scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 40, 1008, 540);
		this.add(scrollPane);

		this.setCartPanel(new JPanel());
		scrollPane.setViewportView(this.getCartPanel());
		this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(), 0));

		this.getCartItems().stream().forEach(item -> this.getCartPanel().add(item));

	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWkHeader().addActionListenerToBtnKasse(al);

	}

	public void updateWKView(Warenkorb warenkorb) {
		System.out.println("Aktualisiere WK Panel");
		this.getCartItems().clear();
		warenkorb.getWarenkorbItems()
				.forEach(item -> this.getCartItems()
						.add(new WarenkorbItem("" + item.getArtikel().getArtikelId(), item.getArtikel().getArtName(),
								item.getArtikel().getArtBezeichnung(), item.getArtikel().getPreis())));
		this.getCartPanel().removeAll();
		this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(), 0));
		this.getCartItems().forEach(item->this.getCartPanel().add(item));
	}
}
