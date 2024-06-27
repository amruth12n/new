package com.eventmanagement;

public class TicketBookingApp {
	 public static void main(String[] args) {
	 // Create array of no of event objects
		 
		 Event[] events = new Event[] {
				 new Event("Concert", 50),
		         new Event("Conference", 100),
		         new Event("Workshop", 30)
		  };
		 TicketBookingSystem bookingSystem = new TicketBookingSystem(events);
	 // Simulate multiple users trying to book tickets simultaneously
		 Thread user1 = new Thread(() -> {
			 bookingSystem.bookTickets("Concert", 2);
		 });
		 Thread user2 = new Thread(() -> {
			 bookingSystem.bookTickets("Conference", 5);
		 });
		 Thread user3 = new Thread(() -> {
			 bookingSystem.bookTickets("Workshop",3);
		 });
	// Start each thread
		 user1.start();
	     user2.start();
	     user3.start();
	     
	     try {
	            user1.join();
	            user2.join();
	            user3.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	 // Display available tickets
		 bookingSystem.displayAvailableTickets();
	 
	}
}