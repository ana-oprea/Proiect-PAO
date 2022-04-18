package models;

public class Product implements TVA{
    private int id;
    private String name;
    private float price;
    private int stock;
    private int yearOfPublication;
    private String publisher;
    private String language;

    public Product(int id, String name, float price, int stock, int yearOfPublication, String publisher, String language) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
        this.language = language;
    }

    public Product() {

    }

    public float TVACalculator(){
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return  " name='" + name + '\n' +
                "price=" + price + '\n' +
                "stock=" + stock + '\n' +
                "yearOfPublication=" + yearOfPublication + '\n' +
                "publisher='" + publisher + '\n' +
                "language='" + language + '\n';
    }
}
