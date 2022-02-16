package musikshop.view.warenkorb;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class WarenkorbPanel extends JPanel {

	private WarenkorbHeader wkHeader;
	private List<WarenkorbItem> cartItems;
	
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
		
		var cartPanel = new JPanel();
		scrollPane.setViewportView(cartPanel);
		cartPanel.setLayout(new GridLayout(this.getCartItems().size(),0));
		
		this.getCartItems().stream().forEach(item->cartPanel.add(item));
		
		
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWkHeader().addActionListenerToBtnKasse(al);
		
	}
}
