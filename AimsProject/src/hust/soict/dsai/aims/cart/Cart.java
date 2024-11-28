package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20; // Maximum of 20 DVDs in one cart
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED]; // Array to store DVDs
    private int qtyOrdered; // Number of DVDs currently in the cart

    public void setQtyOrdered(int qty) {
        this.qtyOrdered = qty;
    }

    // Method to add a DVD to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Disc Added to Cart"); 
        } else {
            System.out.println("Cart Full"); 
        }
    }
    
    // Method to remove a DVD from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                System.out.println("Removed DVD " + disc.getTitle() + " from Cart."); 
                // Shift remaining items left
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                qtyOrdered--; 
                itemsOrdered[qtyOrdered] = null; 
                return;
            }
        }
        System.out.println("Cannot find disc in Cart"); 
    }

    public void searchByTitle(String keyword) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].isMatch(keyword)) {
                System.out.println("Found " + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No DVD with \"" + keyword +"\" in the title!");
        }
    }
    
    public void searchByCategory(String category) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCategory().equalsIgnoreCase(category)) {
                System.out.println("Found " + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No DVD matching the \"" + category + "\" category were found!");
        }
    }

    public void searchByPrice(float maxCost) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCost() <= maxCost) {
                System.out.println("Found " + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No DVD with price lower than given price!");
        }
    }
    public void searchByPrice(float minCost, float maxCost) {
        boolean matchFound = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getCost() >= minCost && itemsOrdered[i].getCost() <= maxCost) {
                System.out.println("Found " + itemsOrdered[i]);
                matchFound = true;
            }
        }
        if (!matchFound) {
            System.out.println("No DVD within cost range!");
        }
    }

    public void searchByID(int id) {
        boolean found = false;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i].getId() == id) {
                System.out.println("Found " + itemsOrdered[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No ID match!");
        }
    }

    // Method to calculate the total cost of DVDs in the cart
    public String totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return "Total cost is: " + total;
    }

    // Method to display the list of DVDs in the cart
    public void showCart() {
        System.out.println("Current items:"); 
        int i = 1;
        for (DigitalVideoDisc disc : itemsOrdered) {
            if (disc != null) {
                System.out.println(i++ + ". " + disc.getTitle() + " - " + disc.getCost() );
            }
        }
    }
    public void print() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        for (int i = 0; i < qtyOrdered; i++) {
            System.out.println(itemsOrdered[i]);
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}