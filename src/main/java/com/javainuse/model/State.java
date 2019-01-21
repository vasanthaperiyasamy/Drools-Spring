package com.javainuse.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class State implements Serializable{
	
	public static final int NOTRUN=0;
	public static final int FINISHED=1;
	
	private final PropertyChangeSupport propChange=new PropertyChangeSupport(this);
	
	
	private String name;
	public State(String name) {
		super();
		this.name = name;
		this.state=State.NOTRUN;
	}
	private int state;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
	
		int oldState=this.state;
		
		
		this.state = state;
		propChange.firePropertyChange("state", oldState, state);
	}
	
	
	
	
	

}
