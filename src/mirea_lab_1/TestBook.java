package mirea_lab_1;

public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("War and Peace", "romance", 1000);
        Book b2 = new Book("Count of Monte Cristo", "adventnre",400);
        Book b3 = new Book ("Harry Potter", "adventnre", 600);
        b2.setPrice(420);
        System.out.println(b2);
        b1.bookSale();
        b2.bookSale();
        b3.bookSale();

    }
}
