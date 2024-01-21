package com.pratice.interview;

import java.util.*;

public class CaretakerMemento {

	List<ConfigureMemento> history = new ArrayList<>();
	
	public void addMemento(ConfigureMemento memento) {
		history.add(memento);
	}
	
	public ConfigureMemento undo() {
		if (!history.isEmpty()) {
			int lastMementoIndex = history.size()-1;
			ConfigureMemento  lastMemento = history.get(lastMementoIndex);
			history.remove(lastMementoIndex);
			return lastMemento;
		}
		return null;
	}
	
	
}
