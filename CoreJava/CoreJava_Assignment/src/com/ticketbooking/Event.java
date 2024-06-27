package com.ticketbooking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Event {
	
	 private String eventName;
	 private int availableTickets;
	 private Lock lock;
	 
	 public Event(String eventName, int availableTickets) {
		 this.eventName = eventName;
		 this.availableTickets = availableTickets;
		 this.lock = new ReentrantLock();
	 }

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public int getAvailableTickets() {
		return availableTickets;
	}

	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}

	public Lock getLock() {
		return lock;
	}

	public void setLock(Lock lock) {
		this.lock = lock;
	}
	 public boolean bookTickets(int numTickets) {
		 lock.lock();
		 try {
		// if available tickets are less than numTickets , update the available tickets and return true
			 if(this.availableTickets >= numTickets) {
				 this.availableTickets -= numTickets;
				 return true;
			 }
			 else return false;
		//else false
		  } finally {
		 lock.unlock();
		 }
	 }


}
