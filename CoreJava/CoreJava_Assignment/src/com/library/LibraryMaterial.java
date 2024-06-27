package com.library;

public abstract class LibraryMaterial {
	
	protected String title;
	protected String author;
	
	abstract void checkout();
	abstract void returnMaterial();


}
