package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.Collection;

public class Library {
    private Collection<Book> books;
    private PrintStream printStream;

    public Library(Collection<Book> books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooks() {
        for (Book book : books) {
            printStream.println(book.formattedBook());
        }
    }
}
