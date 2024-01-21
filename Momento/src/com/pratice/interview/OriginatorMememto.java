package com.pratice.interview;

public class OriginatorMememto {
	
	int height;
	int weight;
	
	public OriginatorMememto(int height,int weight) {
	this.height = height;
	this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	// TWO APIS 
	
	public ConfigureMemento createMemento() {
		return new ConfigureMemento(this.height,this.weight); 
		
	}
	
	
	public void restoreMemento(ConfigureMemento configure) {
		this.height = configure.height;
		this.weight = configure.weight;
	}
	

}
