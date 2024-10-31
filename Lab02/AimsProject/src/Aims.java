public class Aims {

    public static void main(String[] args) {
        //Create a new cart
        Cart anOrder = new Cart();
        anOrder.setQtyOrdered(0); 

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", 
        "Roger Allers",87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", 
        "George Lucas",87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println(anOrder.totalCost());
        
        System.out.println("\nTesting removeDigitalVideoDisc method");
        anOrder.removeDigitalVideoDisc(dvd2);
        anOrder.showCart();
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avengers", "Science Fiction","Joss Whedon", 99999.99f);
        anOrder.addDigitalVideoDisc(dvd4);
        anOrder.showCart();
        System.out.println(anOrder.totalCost());
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.removeDigitalVideoDisc(dvd3);
        anOrder.removeDigitalVideoDisc(dvd4);
        anOrder.removeDigitalVideoDisc(dvd4);
    }
}