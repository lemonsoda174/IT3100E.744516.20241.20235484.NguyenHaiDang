package hust.soict.dsai.test.media;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
    
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        DigitalVideoDiscWrapper wjungleDVD = new DigitalVideoDiscWrapper(jungleDVD);
        DigitalVideoDiscWrapper wcinderellaDVD = new DigitalVideoDiscWrapper(cinderellaDVD);

        // Correct swap() function
        swap(wjungleDVD, wcinderellaDVD);
        System.out.println("Jungle dvd title: " + wjungleDVD.dvd.getTitle());
        System.out.println("Cinderella dvd title: " + wcinderellaDVD.dvd.getTitle());
    }

    public static void swap(DigitalVideoDiscWrapper o1, DigitalVideoDiscWrapper o2) {
        DigitalVideoDisc tmp = o1.dvd;
        o1.dvd = o2.dvd;
        o2.dvd = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }

    
}