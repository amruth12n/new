package com.eventmanagement;

class TicketBookingSystem {
	 private Event[] events;
	 
	 public TicketBookingSystem(Event[] events) {
		 this.events = events;
	 }
	 public void bookTickets(String eventName, int numTickets) {
		 for (Event event : events) {
			 if (event.getEventName().equals(eventName)) {
				 if (event.bookTickets(numTickets)) {
					 System.out.println(numTickets + " tickets booked for event: " + eventName);
				 } else {
					 System.out.println("Failed to book tickets for event: " + eventName + ". Insufficient tickets.");
				 }
				 return;
			 }
		 }
		 System.out.println("Event not found: " + eventName);
	 }
	 
	 public void displayAvailableTickets() {
		 System.out.println("\nAvailable Tickets:");
		 for (Event event : events) {
	            System.out.println("Event: " + event.getEventName() + ", Available Tickets: " + event.getAvailableTickets());
	     }
	}
}