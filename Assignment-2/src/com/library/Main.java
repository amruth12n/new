package com.library;

public class Main {
 public static void main(String[] args) {
     LibrarySystem librarySystem = new LibrarySystem();

     LibraryMaterial book1 = new Book("Harry Potter", "J.K. Rowling", 400);
     LibraryMaterial magazine1 = new Magazine("National Geographic", "Various Authors", 123);
     LibraryMaterial audiobook1 = new Audiobook("The Da Vinci Code", "Dan Brown", "Paul Michael");

     librarySystem.addMaterial(book1);
     librarySystem.addMaterial(magazine1);
     librarySystem.addMaterial(audiobook1);

     librarySystem.displayAvailableMaterials();

     librarySystem.checkoutMaterial(book1);
     librarySystem.returnMaterial(book1);
     librarySystem.displayAvailableMaterials();
     
     librarySystem.checkoutMaterial(magazine1);
     librarySystem.returnMaterial(magazine1);
     librarySystem.displayAvailableMaterials();
     
     librarySystem.checkoutMaterial(audiobook1);
     librarySystem.returnMaterial(audiobook1);
     librarySystem.displayAvailableMaterials();
 }
}
