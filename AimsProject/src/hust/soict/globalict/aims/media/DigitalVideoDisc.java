package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media implements Playable{
    private int length;

    public int getLength() {
        return length;
    }

    public void play()
    {
        System.out.println("Playing DVD: " + this.getTitle()); 
        System.out.println("DVD length: " + this.getLength()); 
    }

    public DigitalVideoDisc(int id, String title, String category, float cost, int length) {
        super(id, title, category, cost);
        this.length = length;
    }
}



