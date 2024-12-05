package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Media{

    private String director;
    private int length;


    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }

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
        super(title);
        this.director = director;
    }
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title);
        this.director = director;
        this.length = length;
    }

    public String toString() {
        return this.getId() + ". DVD: " + this.getTitle() +
                " - Category: " + this.getCategory() +
                " - Director: " + this.director +
                " - DVD length: " + this.length +
                " - Cost: " + this.getCost() + "$";
    }

    public boolean isMatch(String title) {
        return this.getTitle().toLowerCase().contains(title.toLowerCase());
    }
}