package com.designpattern.observer;

public class ObserverA implements IObserver{
	private String state;
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void update(String state) {
		setState(state);
		System.out.println("ObserverA has received update signal with new state : " + getState());
	}
}
