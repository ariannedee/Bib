package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "author1", 1949);
        Book book2 = new Book("Book2", "author2", 1948);
        Book book3 = new Book("Book3", "author3", 1947);
        Collection<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library = new Library(books, System.out);
        BibliotecaApp biblioteca = new BibliotecaApp(library, System.out);
        biblioteca.start();
    }
}
