package musikshop.controller;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JButton;

import musikshop.model.MainModel;
import musikshop.model.interfaces.Artikel;
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
	}
		
	private void addArtikelToWarenkorb(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		SearchResult res = (SearchResult)btn.getParent();
		String artikelName = res.getLblProductName().getText();
		Integer anzahl = (Integer)res.getSpinner().getValue();
		this.getMainModel().addItemToCart(artikelName, anzahl);
		
		
	}

}
