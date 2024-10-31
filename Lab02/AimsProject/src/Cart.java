

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
}