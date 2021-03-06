package musikshop.view.warenkorb;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ChangeListener;

import musikshop.model.data.Warenkorb;

public class WarenkorbPanel extends JPanel {

	private WarenkorbHeader wkHeader;
	private List<WarenkorbPanelItem> cartItems;
	private JPanel cartPanel;
	private JScrollPane scrollPane;

	public WarenkorbHeader getWkHeader() {
		return wkHeader;
	}

	public void setWkHeader(WarenkorbHeader wkHeader) {
		this.wkHeader = wkHeader;
	}

	public List<WarenkorbPanelItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<WarenkorbPanelItem> cartItems) {
		this.cartItems = cartItems;
	}

	public JPanel getCartPanel() {
		return cartPanel;
	}

	public void setCartPanel(JPanel cartPanel) {
		this.cartPanel = cartPanel;
	}

	public JScrollPane getScrollPane() {
		return scrollPane;
	}

	public void setScrollPane(JScrollPane scrollPane) {
		this.scrollPane = scrollPane;
	}

	public WarenkorbPanel() {
		this.setCartItems(new ArrayList<>());
		for (int i = 0; i < 10; i++) {
			this.getCartItems().add(new WarenkorbPanelItem("Icon " + i, "ItemName" + i, "Item Beschreibung " + i, i));
		}

		this.setBounds(0, 150, 1008, 579);
		this.setLayout(null);

		this.setWkHeader(new WarenkorbHeader());
		this.add(this.getWkHeader());

		this.setScrollPane(new JScrollPane());
		this.getScrollPane().setBounds(0, 40, 1008, 540);
		this.add(this.getScrollPane());

		this.setCartPanel(new JPanel());
		this.getScrollPane().setViewportView(this.getCartPanel());
		this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(), 0));

		this.getCartItems().stream().forEach(item -> this.getCartPanel().add(item));

	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWkHeader().addActionListenerToBtnKasse(al);

	}

	public void updateWKView(Warenkorb warenkorb) {
		this.getCartItems().clear();
		warenkorb.getWarenkorbItems().forEach(item -> this.getCartItems().add(new WarenkorbPanelItem(item)));
		this.getCartPanel().removeAll();
		if(this.getCartItems().size()>0) {
			this.getCartPanel().setLayout(new GridLayout(this.getCartItems().size(), 0));			
		}else {
			this.getCartPanel().setLayout(new GridLayout(1, 0));
		}
		this.getCartItems().forEach(item -> this.getCartPanel().add(item));
		this.getScrollPane().revalidate();
		this.getScrollPane().repaint();
	}

	public void addChangeListenerToWarenkorbSpinner(ChangeListener e) {
		this.getCartItems().forEach(item -> item.getSpinner().addChangeListener(e));
	}
}
