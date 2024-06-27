package com.library;

public class Main {

	public static void main(String[] args) {
		
		LibrarySystem lbSystem = new LibrarySystem();
		
		lbSystem.AddAudiobookList(new Audiobook("Bob","Business","Alex"));
		lbSystem.AddBookList(new Book(56,"Java","J.Peterson"));
		lbSystem.AddMagazineList(new Magazine(10023,"Eco-System","Lily"));
		
		lbSystem.checkoutAudobook();
		lbSystem.checkoutMagazine();
		
		lbSystem.displayMaterials();
		
		

	}

}
