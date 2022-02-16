package musikshop.view.suche;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import musikshop.model.interfaces.Artikel;

public class SearchResultPanel extends JPanel {

	private List<SearchResult> results;
	private JLabel resultTitle;
	private JPanel resultDisplayPanel;

	public List<SearchResult> getResults() {
		return results;
	}

	public void setResults(List<SearchResult> results) {
		this.results = results;
	}

	public JLabel getResultTitle() {
		return resultTitle;
	}

	public void setResultTitle(JLabel resultTitle) {
		this.resultTitle = resultTitle;
	}

	public JPanel getResultDisplayPanel() {
		return resultDisplayPanel;
	}

	public void setResultDisplayPanel(JPanel resultDisplayPanel) {
		this.resultDisplayPanel = resultDisplayPanel;
	}

	public SearchResultPanel() {
		this.setBounds(0, 150, 1008, 580);
		this.setOpaque(true);
		this.setLayout(null);

		this.setResultTitle(new JLabel("Suchergebnisse für ..."));
		this.getResultTitle().setBounds(0, 0, 1008, 40);
		this.add(this.getResultTitle());

		JScrollPane spane = new JScrollPane();
		spane.setBounds(0, 40, 1008, 540);
		this.add(spane);

		this.setResults(new ArrayList<>());

		this.setResultDisplayPanel(new JPanel());
		spane.setViewportView(this.getResultDisplayPanel());

	}

	public void displaySearchResults(List<Artikel> list) {
		this.getResults().clear();
		list.forEach((Artikel a) -> this.getResults().add(
				new SearchResult("Bild " + a.getArtikelId(), a.getArtBezeichnung(), a.getArtName(), a.getPreis())));
		this.getResultDisplayPanel().removeAll();
		this.getResultDisplayPanel().setLayout(new GridLayout(this.getResults().size(), 0));
		this.getResults().forEach((SearchResult res) -> this.getResultDisplayPanel().add(res));
		this.repaint();
	}
	
	public void addActionListenerToSearchResultItems(ActionListener al) {
		this.getResults().forEach(r->r.getBtnWarenkorb().addActionListener(al));
	}
}
