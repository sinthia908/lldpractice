package com.doc;

public class Doctor {
	
	private String name;
    private long id ;
  
  
    Doctor(String name ,long id){
    	this.name = name;
    	this.id = id ;
    }
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getId() {
		return id;
	}

}
