package com.doc;

import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BookingManager bookingManager = new BookingManager();
     bookingManager.addDoctor(new Doctor("Dinesh Kini", 10101));
     bookingManager.addDoctor(new Doctor("Kamal Chetri", 10301));
     
     
     // Returns a list of doctors 
    //  bookingManager.listDoctors();
     
    // bookingManager.DoctorSlots("Dinesh Kini", 0, 4,8);
     
   //  bookingManager.DoctorAvailability("Dinesh Kini");
     
     bookingManager.registerDoctor(new Doctor("Dr. Dilip Dutta",10802));
     
     bookingManager.bookAppoinment("Prasun", "Kamal Chetri", new Date(),9);
     
     bookingManager.cancelAppointment("Prasun", 9);
     
    
     
	 
	}

}


//A new doctor should be able to register.
//A doctor should be able to declare his/her availability in 1hr slots(start of the hour) for the day from 9 am till 9 pm.
//Patients can look at all available slots across all doctors. The slots should be sorted by slot time. However, the sorting criteria can be extended in future.
//Patients should be able to book appointments with a doctor for an available slot.Patient can book multiple slots in the same day. A patient cannot book two appointments with two different doctors in the same time slot.
//Patients can also cancel an appointment, in which case that slot becomes available for someone else to book.
// We should be able to search for all booked appointments given the doctor’s name or patient’s name