package com.library;

public class Audiobook extends LibraryMaterial {
 private String narrator;

 public Audiobook(String title, String author, String narrator) {
     super(title, author);
     this.narrator = narrator;
 }

 @Override
 public void checkout() {
     System.out.println("Audiobook '" + getTitle() + "' by " + getAuthor() + ", Narrated by " + narrator + " has been checked out.");
 }

 @Override
 public void returnMaterial() {
     System.out.println("Audiobook '" + getTitle() + "' by " + getAuthor() + ", Narrated by " + narrator + " has been returned.");
 }
}
