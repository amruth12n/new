package com.hr;

class SalaryBelowMinimumException extends Exception {
	 public SalaryBelowMinimumException(String message) {
		 super(message);
	 }
}