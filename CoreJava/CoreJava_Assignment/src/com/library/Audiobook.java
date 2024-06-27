package com.library;

public class Audiobook extends LibraryMaterial{
	
	protected String narrator;
	
	

	public Audiobook(String narrator, String title, String author) {
		super();
		this.narrator = narrator;
		this.title = title;
		this.author = author;
	}

	@Override
	void checkout() {
		System.out.println("CheckOut the Audiobook");
	}

	@Override
	void returnMaterial() {
		System.out.println("Return the Audiobook");
	}

	@Override
	public String toString() {
		return "Audiobook [narrator=" + narrator + ", title=" + title + ", author=" + author + "]";
	}
	
	
}
