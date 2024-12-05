package hust.soict.dsai.test.media;

import java.util.*;

import hust.soict.dsai.aims.media.*;

public class MediaTest {
    
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        
        Book book = new Book("Harry Potter", "Novel", 25.00f);
        
        CompactDisc cd = new CompactDisc("Bao tang cua nuoi tiec", "Music","Vu.", 15.98f);
        
        Track track1 = new Track("Neu Nhung Tiec Nuoi", 500);
        Track track2 = new Track("Nhung Loi Hua Bo Quen", 400);
        Track track3 = new Track("Mua Mua Ay", 300);
        
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);
        
        mediae.add(cd);
        mediae.add(book);
        mediae.add(dvd);    
        for (Media media : mediae) {
            System.out.println(media.toString());
        }
    }
}