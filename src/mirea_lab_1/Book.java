package mirea_lab_1;

public class Book {
    private String name;
    private String genre;
    private double price;

    public Book(String n, String g, double p){
        name = n;
        genre = g;
        price = p;
    }

    public Book(String n){
        name = n;
        genre = "horrors";
        price = 0;
    }

    public Book(){
        name = "Hello";
        genre = "fantasy";
        price = 1;
    }

    public void setName(String n){
        this.name = n;
    }
    public void setGenre(String g){
        this.genre = g;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public String getName(){
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public double getPrice(){
        return price;
    }
    public String toString(){
        return "Book`s name " + this.name + ", genre " + this.genre + ", price " + this.price;
    }
    public void bookSale(){
        price = price / 2;
        System.out.println("Book`s price " + price + " dollars");
    }
}
