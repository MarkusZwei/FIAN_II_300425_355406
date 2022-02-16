package mcvObserver;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

public class Controller implements ActionListener, Observer{
	private Model model;
	private MainView view;

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public MainView getView() {
		return view;
	}

	public void setView(MainView view) {
		this.view = view;
	}
	
	public Controller() {
		this.setModel(new Model());
		this.setView(new MainView());
		this.getView().getBtnCountUp().addActionListener(this);
		this.getView().getBtnCountDown().addActionListener(this);
		this.getModel().addObserver(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()) {
		case MainView.COUNTUP:
			this.getModel().countUp();
			break;
		case MainView.COUNTDOWN:
			this.getModel().countDown();
			break;
		}		
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Das Model hat seinen Zustand verändert");
		this.getView().updateLabel(this.getModel().getWert());		
	}
}
