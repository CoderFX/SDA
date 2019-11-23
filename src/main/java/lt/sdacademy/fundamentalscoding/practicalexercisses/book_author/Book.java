package lt.sdacademy.fundamentalscoding.practicalexercisses.book_author;

import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private double price;
    private int qnt;

    public Book(String title, List<Author> authors, double price, int qnt) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qnt = qnt;
    }

    public String toString() {
        return String.format("Knygos PVD: %s, autorius: %s, kaina: %s, kiekis: %s", title, authors.toString(), price, qnt);
    }
}
