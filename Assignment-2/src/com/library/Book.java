package com.library;

public class Book extends LibraryMaterial {
 private int numberOfPages;

 public Book(String title, String author, int numberOfPages) {
     super(title, author);
     this.numberOfPages = numberOfPages;
 }
@Override
 public void checkout() {
     System.out.println("Book '" + getTitle() + "' by " + getAuthor() + " has been checked out.");
 }
@Override
 public void returnMaterial() {
     System.out.println("Book '" + getTitle() + "' by " + getAuthor() + " has been returned.");
 }
}
