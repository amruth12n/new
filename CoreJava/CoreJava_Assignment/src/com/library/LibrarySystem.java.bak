package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
	List<Audiobook> audio = new ArrayList<>();
	List<Book> book = new ArrayList<>();
	List<Magazine> magazine = new ArrayList<>();
	//String cls;
	
	
	public LibrarySystem() { }
	public LibrarySystem(List<Audiobook> audio, List<Book> book, List<Magazine> magazine) {
		
		this.audio = audio;
		this.book = book;
		this.magazine = magazine;
	}
	
	//add audio
	public void AddAudiobookList(List<Audiobook> audio) {
		for(Audiobook ad: audio)
			this.audio.add(ad);
	}
	public void AddAudiobookList(Audiobook audio) {
			this.audio.add(audio);
	}
	//add book
	public void AddBookList(List<Book> book) {
		for(Book bk: book)
			this.book.add(bk);
	}
	public void AddBookList(Book book) {
			this.book.add(book);
	}
	//add Magazine
	public void AddMagazineList(List<Magazine> magazine) {
		for(Magazine mg: magazine)
			this.magazine.add(mg);
	}
	public void AddMagazineList(Magazine magazine) {
			this.magazine.add(magazine);
	}
	
	//add materials
//	void setClass(String cls) { 
//		this.cls = cls;
//	}
//	
//	public void AddMaterialsList(List<cls> item) {
//		for(Magazine mg: magazine)
//			this.magazine.add(mg);
//	}
//	public void AddMagazineList(Magazine magazine) {
//			this.magazine.add(magazine);
//	}
	
	//display materials
	void displayMaterials() {
		
		for(Audiobook au: audio)
			System.out.println(au);
		//System.out.println("\n");
		
		for(Book bk: book)
			System.out.println(bk);
		//System.out.println("\n");
		
		for(Magazine mg: magazine)
			System.out.println(mg);
		
	}
	
	//checkout
	void checkoutAudobook() {
		if(audio.size() >0)
			audio.get(0).checkout();
	}
	void checkoutBook() {
		if(book.size() >0)
			book.get(0).checkout();
	}
	void checkoutMagazine() {
		if(magazine.size() >0)
			magazine.get(0).checkout();
	}
	
	//return 
	void returnAudobook() {
		audio.get(0).returnMaterial();
	}
	void returnBook() {
		book.get(0).returnMaterial();
	}
	void returnMagazine() {
		magazine.get(0).returnMaterial();
	}

	
	
	
	
	
}
