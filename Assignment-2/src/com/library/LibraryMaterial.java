package com.library;


public abstract class LibraryMaterial {
	private String title;
    private String author;
    
    public LibraryMaterial(String title, String author) {
     this.title = title;
     this.author = author;
   }

   public abstract void checkout();

   public abstract void returnMaterial();

   public String getTitle() {
     return title;
   }

   public void setTitle(String title) {
	   this.title = title;
   }
   
   public String getAuthor() {
     return author;
   }
   public void setAuthor(String author) {
	   this.author = author;
   }


}
