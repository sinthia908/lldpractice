package com.doc;

public class Slots {
	private String status;
	private String timeSlot;
	private String docName;
	private String patientName;
	
	public Slots(String status,String timeSlot,String docName,String patientName) {
		this.status = status;
		this.timeSlot = timeSlot;
		this.docName = docName;
		this.patientName = patientName;
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	
}
