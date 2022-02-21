package musikshop.controller;

import java.awt.event.ActionEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import musikshop.model.MainModel;
import musikshop.model.interfaces.Artikel;
import musikshop.view.kasse.KassePanel;
import musikshop.view.main.MainFrame;
import musikshop.view.suche.SearchResult;

public class MainController {
	private MainFrame view;
	private MainModel mainModel;

	public MainFrame getView() {
		return view;
	}

	public void setView(MainFrame view) {
		this.view = view;
	}

	public MainModel getMainModel() {
		return mainModel;
	}

	public void setMainModel(MainModel mainModel) {
		this.mainModel = mainModel;
	}

	public MainController() {
		this.setView(new MainFrame());
		this.setMainModel(new MainModel());

		this.getView().addActionListenerToBtnSuchen(this::changeViewToSearch);
		this.getView().addActionListenerToBtnWarenkorb(this::changeViewToWarenkorb);
		this.getView().addActionListenerToBtnKasse(this::changeViewToKasse);
		this.getView().addActionListenerToBtnAbsenden(this::bestellungErstellen);
	}
	
	private void addActionListenerToSearchResultItems() {
		this.getView().addActionListenerToSearchResultItems(this::addArtikelToWarenkorb);
	}
	
	private void changeViewToSearch(ActionEvent e) {
		this.getAllArticles(e);
		this.getView().changeViewToSearch();
	}

	private void changeViewToWarenkorb(ActionEvent e) {
		this.getView().changeViewToWarenkorb();
	}

	private void changeViewToKasse(ActionEvent e) {
		this.getView().changeViewToKasse();
	}
	
	private void getAllArticles(ActionEvent e) {
		List<Artikel> list = this.getMainModel().getSortimentAsList();
		this.getView().displaySearchResults(list);
		this.addActionListenerToSearchResultItems();
		
		//-------------- Nur zum Testen ----------------
//		ImageIcon icon = this.getMainModel().getPicture();
//		this.getView().getMainPanel().getSearchResultPanel().getResults().get(0).getLblProductPicture().setIcon(icon);
		
	}
		
	private void addArtikelToWarenkorb(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		SearchResult res = (SearchResult)btn.getParent();
		String artikelName = res.getLblProductName().getText();
		Integer anzahl = (Integer)res.getSpinner().getValue();
		this.getMainModel().addItemToCart(artikelName, anzahl);	
		this.getView().updateWKView(this.getMainModel().getWarenkorb());
	}
	
	private void bestellungErstellen(ActionEvent e) {
		var btn = (JButton)e.getSource();
		var kassepanel = (KassePanel)btn.getParent();
		Map<String,String> data = new HashMap<>();
		data.put("vorname", kassepanel.getTxtVorname().getText());
		data.put("nachname", kassepanel.getTxtNachname().getText());
		data.put("strasse", kassepanel.getTxtStrasse().getText());
		data.put("hausnummer", kassepanel.getTxtNr().getText());
		data.put("plz", kassepanel.getTxtPlz().getText());
		data.put("ort", kassepanel.getTxtOrt().getText());		
		this.getMainModel().bestellungAbschicken(data);
	}
	
	

}
