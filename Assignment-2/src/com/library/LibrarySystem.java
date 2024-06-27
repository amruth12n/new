package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
 private List<LibraryMaterial> availableMaterials;

 public LibrarySystem() {
     this.availableMaterials = new ArrayList<>();
 }

 public void addMaterial(LibraryMaterial material) {
     availableMaterials.add(material);
 }

 public void displayAvailableMaterials() {
     System.out.println("\nAvailable Materials:");
     for (LibraryMaterial material : availableMaterials) {
         System.out.println(material.getTitle() + " by " + material.getAuthor());
     }
 }

 public void checkoutMaterial(LibraryMaterial material) {
     if (availableMaterials.contains(material)) {
         material.checkout();
         availableMaterials.remove(material);
     } else {
         System.out.println("Sorry, '" + material.getTitle() + "' is not available for checkout.");
     }
 }

 public void returnMaterial(LibraryMaterial material) {
     availableMaterials.add(material);
     material.returnMaterial();
 }
}
