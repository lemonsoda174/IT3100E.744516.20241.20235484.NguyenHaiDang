package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc{
    public DigitalVideoDisc(String title) {
        super(title);
    }
    public DigitalVideoDisc(String title, String category) {
        super(title, category);
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, float cost) {
        super(title, category, director, cost);
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    public String toString() {
        return this.getId() + ". DVD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Director: " + this.getDirector() +
                " - DVD length: " + this.getLength() +
                " - Cost: " + this.getCost() + "$";
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
}