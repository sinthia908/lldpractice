package com.doc;

import java.util.*;

public class BookingManager {
	
   List<Doctor> DoctorList;
   List<Patient> PatientsList;
   Slots[] slots;
   List<Booking> bookingList;
   
   
  BookingManager(){
	  DoctorList = new ArrayList<>();
	  PatientsList = new ArrayList<>();
	  bookingList = new ArrayList<>();
	  slots = new Slots[10];
	  InitiliazeSlots(slots);
	  
  }
  
  private void InitiliazeSlots(Slots[] slots2) {
	  
	    
		  for(int i=0 ; i<slots.length ; i++) 
		  { 
		  slots[i] = new Slots("Free","","","");		 
	  }
}

// Code to add doctors to patientsList 
  
  public void addDoctor(Doctor doctor) {
	  if ( doctor != null) {
		  DoctorList.add(doctor);
	  }
  }
 
    // Code to add patients to the patients list 
   public void addPatient(Patient patient) {
	   if ( patient != null) {
		   PatientsList.add(patient);   
	   }
   }
   
   // List the doctors who registered 
   
   public void listDoctors(){
	   for(int i=0 ; i < DoctorList.size() ; i++) {
		  // System.out.println( DoctorList.get(i).getName() + " ");
	   }
   }
   
   public void DoctorSlots(String DoctorName,int a,int b,int c) {
	   List<Integer> list = new ArrayList<>();
	   list.add(a);
	   list.add(b);
	   list.add(c);
	   
	   for(int i=0 ; i<list.size() ; i++) {
		   
		  slots[list.get(i)].setDocName(DoctorName);
		  slots[list.get(i)].setStatus("Avaiable");
	   }
   }
   
   
   // Doctor can set availablity of the same 
   
   public void DoctorAvailability(String docName) {
	  if ( docName != null) {
		  for(int i=0 ; i<slots.length ; i++) {
			  if (slots[i].getDocName() == docName) {
				 // System.out.print(slots[i].getStatus() + " " + 
			     // slots[i].getDocName() + " " + slots[i].getPatientName());
			  }
				  }
			  }
		  
	  }
	   
   
   // Register Doctor 

public void registerDoctor(Doctor doctor) {
	if ( doctor != null) {
		for(int i=0 ; i< DoctorList.size() ; i++) {
				if ( DoctorList.get(i).getId() == doctor.getId()) {
					System.out.print("Doctor already exists...");
					return ;
				}
			}
		 DoctorList.add(doctor);
		// System.out.print("Doctor have been registered successfully... ");
		}
	}
  




  // Book appointments 

public void bookAppoinment(String patientName,String doctorName,Date date,int time) {

   slots[time].setDocName(doctorName);
   slots[time].setPatientName(patientName);
   slots[time].setStatus("Booked");

   bookingList.add(new Booking(12L,patientName,doctorName,date,slots[time]));
   
 }


// Cancel Appointments 

public void cancelAppointment(String patientname,int time) {
	slots[time].setPatientName("");
	slots[time].setStatus("Free");
	
	for(int i=0 ; i<bookingList.size() ; i++) {
	
		
	}
	
	
	for(int i=0 ; i<bookingList.size() ; i++) {
		System.out.println(bookingList.get(i).getDoctorName() + " " + bookingList.get(i).getPatientName()
				+ bookingList.get(i).getSlots().getStatus());
	}
		
}


}





