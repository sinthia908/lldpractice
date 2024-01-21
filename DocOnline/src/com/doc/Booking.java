package com.doc;

import java.util.Date;

public class Booking {
	private Long Id;
	private String DoctorName;
	private String PatientName;
	private Date date;
	private Slots slots;
	
	Booking(Long id, String DoctorName,String PatientName,
			Date date,Slots slots){
		this.Id = Id;
		this.DoctorName = DoctorName;
		this.PatientName = PatientName;
		this.date = date;
		this.slots = slots;
		
	}
	
	


	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getPatientName() {
		return PatientName;
	}
	public void setPatientName(String patientName) {
		PatientName = patientName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Slots getSlots() {
		return slots;
	}
	public void setSlots(Slots slots) {
		this.slots = slots;
	}
	
}
