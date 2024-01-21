package com.pratice.interview;

public class Client {

	public static void main(String[] args) {
	
	CaretakerMemento caretakerMemento = new CaretakerMemento();
	OriginatorMememto originatorMemento = new OriginatorMememto(4,5);

	// save it 
	
	ConfigureMemento snapshot = originatorMemento.createMemento();
	
	
	System.out.print(snapshot.height + " " + snapshot.weight);
	
	caretakerMemento .addMemento(snapshot);
	
	
	originatorMemento.setHeight(9);
	
	originatorMemento.setWeight(12);
	
	ConfigureMemento snapshot2 = originatorMemento.createMemento();
	
	caretakerMemento .addMemento(snapshot2);
	
	originatorMemento.setHeight(30);
	
	originatorMemento.setWeight(32);
	
	// UNDO 
       
	
	ConfigureMemento configurememeto = caretakerMemento.undo();
	originatorMemento.restoreMemento(configurememeto);
	
	
	
	
	
	}
	
	

}
