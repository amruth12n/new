package com.library;

public class Book extends LibraryMaterial {
	
	protected int numberOfPages;

	
	public Book(int numberOfPages, String title, String author) {
		super();
		this.numberOfPages = numberOfPages;
		this.title = title;
		this.author = author;
	}

	@Override
	void checkout() {
		System.out.println("CheckOut the Book");
	}

	@Override
	void returnMaterial() {
		System.out.println("Return the book");
	}

	@Override
	public String toString() {
		return "Book [numberOfPages=" + numberOfPages + ", title=" + title + ", author=" + author + "]";
	}

	
	
}
