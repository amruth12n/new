package com.ticketbooking;

public class TicketBookingApp {

	public static void main(String[] args) {

		//array of no of event objects
		Event events[] = {new Event("Classical Music",36),
							new Event("Concert",70),
							new Event("Workshop",25),
							new Event("Conference",20),
							new Event("Rock",53)};
		
		 TicketBookingSystem bookingSystem = new TicketBookingSystem(events);
		 
		 // Simulate multiple users trying to book tickets simultaneously
		 Thread user1 = new Thread(() -> {
			 bookingSystem.bookTickets("Concert", 2);
		 });
		 Thread user2 = new Thread(() -> {
			 bookingSystem.bookTickets("Conference", 5);
		 });
		 Thread user3 = new Thread(() -> {
			 bookingSystem.bookTickets("Workshop", 3);
		 });
		// Start each thread
		 user1.start(); user3.start(); user2.start();
		 
		 // Display available tickets
		 bookingSystem.displayAvailableTickets();


	}

}
