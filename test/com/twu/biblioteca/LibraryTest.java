package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Mockito.*;

public class LibraryTest {
    private Library library;
    private PrintStream printStream;
    private Book book1;
    private Collection<Book> books;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        book1 = mock(Book.class);
        books = new ArrayList<Book>();
        books.add(book1);
        library = new Library(books, printStream);
    }

    @Test
    public void shouldPrintOneBook() {
        when(book1.formattedBook()).thenReturn("BookDetails");

        library.printBooks();

        verify(printStream).println("BookDetails");
    }

    @Test
    public void shouldPrintMultipleBooks() {
        Book book2 = mock(Book.class);
        books.add(book2);
        when(book2.formattedBook()).thenReturn("BookDetails2");

        library.printBooks();

        verify(printStream).println("BookDetails2");
    }
}
