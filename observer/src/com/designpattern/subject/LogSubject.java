package com.designpattern.subject;

import java.util.ArrayList;
import java.util.List;
import com.designpattern.observer.IObserver;

public class LogSubject {
	private List<IObserver> observerListe = new ArrayList<IObserver>();
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void attach(IObserver observer) {
		observerListe.add(observer);
	}
	
	public void detach(IObserver observer) {
		observerListe.remove(observer);
	}
	
	public void setState(String state) {
		this.state = state;
		stateChanged();
	}
	
	public void stateChanged() {
		notifyObservers();
	}
	
	public void notifyObservers() {
		for (IObserver item : observerListe) {
			item.update(getState());
		}
	}
}
