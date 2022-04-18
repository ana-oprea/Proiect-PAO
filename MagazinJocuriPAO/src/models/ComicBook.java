package models;

public class ComicBook extends Product{
    private static int idContor = 200;
    private int volume;
    private String series;
    private String author;
    private String artist;

    public ComicBook(String name, float price, int stock, int yearOfPublication, String publisher, String language) {
        super(idContor++, name, price, stock, yearOfPublication, publisher, language);
    }

    public ComicBook(String name, float price, int stock, int yearOfPublication, String publisher, String language, int volume, String series, String author, String artist) {
        super(idContor++, name, price, stock, yearOfPublication, publisher, language);
        this.volume = volume;
        this.series = series;
        this.author = author;
        this.artist = artist;
    }
    @Override
    public float TVACalculator() {
        return this.getPrice() * 0.4f + this.getPrice();
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return super.toString() +
                "volume=" + volume + '\n' +
                "series='" + series + '\n' +
                "author='" + author + '\n' +
                "artist='" + artist + '\n';
    }
}
