package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.dsai.aims.exception.PlayerException;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }

    public CompactDisc(String title) {
        super(title);
    }
    public CompactDisc(String title, String category) {
        super(title, category);
    }
    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public CompactDisc(String title, String category, String artist, float cost) {
        super(title, category, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Input track is already in the list.");
        }
    }
    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
        } else {
            System.out.println("Input track does not exist in the list.");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
        System.out.println("Playing CD: " + this.getTitle());
        System.out.println("CD length: " + this.getLength());
        for (Track track : tracks) {
            track.play();
        }
    }

    @Override
    public String toString() {
        return this.getId() + " - CD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Artist: " + this.getArtist() +
                " - Length: " + this.getLength() +
                " - Cost: " + this.getCost() + "$";
    }

    public String playGUI() throws PlayerException {
        if(this.getLength() > 0) {
            String output =  "Playing CD: " + this.getTitle() + "\n" + 
                            "CD length: " + formatDuration(this.getLength()) + "\n"+ "\n";
            for (Track track : tracks) {
                try {
                    output += track.playGUI() + "\n";
                } catch (PlayerException e) {
                    output += track.getTitle() + "\n" + e.getMessage();
                }
            }
            return output;
            } else {
                throw new PlayerException("ERROR: CD length is non-positive!");
            }
    }
}
