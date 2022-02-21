package musikshop.view.main;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.event.ChangeListener;

import musikshop.model.data.Warenkorb;
import musikshop.model.interfaces.Artikel;
import musikshop.view.kasse.KassePanel;
import musikshop.view.suche.SearchResultPanel;
import musikshop.view.warenkorb.WarenkorbPanel;

public class MainPanel extends JPanel {
	private HeaderPanel topPanel;
	private MenuPanel menuPanel;
	private SearchResultPanel searchResultPanel;
	private WarenkorbPanel wkPanel;
	private KassePanel kassePanel;

	public HeaderPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(HeaderPanel topPanel) {
		this.topPanel = topPanel;
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}

	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}

	public SearchResultPanel getSearchResultPanel() {
		return searchResultPanel;
	}

	public void setSearchResultPanel(SearchResultPanel searchResultPanel) {
		this.searchResultPanel = searchResultPanel;
	}

	public WarenkorbPanel getWkPanel() {
		return wkPanel;
	}

	public void setWkPanel(WarenkorbPanel wkPanel) {
		this.wkPanel = wkPanel;
	}

	public KassePanel getKassePanel() {
		return kassePanel;
	}

	public void setKassePanel(KassePanel kassePanel) {
		this.kassePanel = kassePanel;
	}

	public MainPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1008, 730);
//		this.setBackground(Color.BLUE);

		this.setTopPanel(new HeaderPanel());
		this.add(this.getTopPanel());

		this.setMenuPanel(new MenuPanel());
		this.add(this.getMenuPanel());

		this.setSearchResultPanel(new SearchResultPanel());
		this.add(this.getSearchResultPanel());

		this.setWkPanel(new WarenkorbPanel());
		this.add(this.getWkPanel());
		
		this.setKassePanel(new KassePanel());
		this.add(this.getKassePanel());
	}

	public void changeView(boolean search, boolean warenkorb, boolean kasse) {
		this.getSearchResultPanel().setVisible(search);
		this.getWkPanel().setVisible(warenkorb);
		this.getKassePanel().setVisible(kasse);
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getWkPanel().addActionListenerToBtnKasse(al);
		
	}

	public void displaySearchResults(List<Artikel> list) {
		this.getSearchResultPanel().displaySearchResults(list);
		
	}

	public void addActionListenerToSearchResultItems(ActionListener al) {
		this.getSearchResultPanel().addActionListenerToSearchResultItems(al);
	}

	public void updateWKView(Warenkorb warenkorb) {
		this.getWkPanel().updateWKView(warenkorb);		
	}

	public void addActionListenerToBtnAbsenden(ActionListener al) {
		this.getKassePanel().addActionListenerToBtnAbsenden(al);		
	}

	public void addChangeListenerToWarenkorbSpinner(ChangeListener al) {
		this.getWkPanel().addChangeListenerToWarenkorbSpinner(al);
		
	}
}
