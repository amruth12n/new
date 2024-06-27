package com.library;

public class Magazine extends LibraryMaterial {
 private int issueNumber;

 public Magazine(String title, String author, int issueNumber) {
     super(title, author);
     this.issueNumber = issueNumber;
 }

 @Override
 public void checkout() {
     System.out.println("Magazine '" + getTitle() + "', Issue " + issueNumber + " has been checked out.");
 }

 @Override
 public void returnMaterial() {
     System.out.println("Magazine '" + getTitle() + "', Issue " + issueNumber + " has been returned.");
 }
}
