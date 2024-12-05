package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Maximum of 20 items in one cart
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>(); // Array to store media


    // Method to add a media item to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
        }
        else {
            itemsOrdered.add(media);
            System.out.println(media.getTitle() + " has been added!");
        }
    }
    
    // Method to remove a media item from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.size() == 0) {
            System.out.println("No product in cart!");
        } 
        else {
            if (itemsOrdered.remove(media)) {
                System.out.println(media.getTitle() + " has been successfully removed from the cart.");
            } 
            else {
                System.out.println("Media not found in cart!");
            }
        }
    }

    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.isMatch(keyword)) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("Sorry, no media were found with \"" + keyword + "\" in the title!");
        }
    }
    
    public void searchByCategory(String category) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getCategory().equalsIgnoreCase(category)) {
                System.out.println("Found " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media matching the \"" + category + "\" category were found!");
        }
    }

    public void searchByPrice(float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() <= maxCost) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No media with price lower than given price!");
        }
    }
    public void searchByPrice(float minCost, float maxCost) {
        boolean matchFound = false;
        for (Media media : itemsOrdered) {
            if (media.getCost() >= minCost && media.getCost() <= maxCost) {
                System.out.println("Found " + media);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No media within cost range!");
        }
    }

    public void searchByID(int id) {
        boolean found = false;
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found " + media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No ID match!");
        }
    }


    public String totalCost() {
        float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return "Total cost is: " + total;
    }


    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i =0;
        for (Media media : itemsOrdered) {
            i +=1;
            System.out.println(i + ". " + media);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}