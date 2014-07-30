package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class LibraryTest {
    private Library library;
    private PrintStream printStream = mock(PrintStream.class);

    @Test
    public void shouldPrintOneBook() {
        Book book1 = mock(Book.class);
        when(book1.formattedBook()).thenReturn("BookDetails");
        Collection<Book> books = new ArrayList<Book>();
        books.add(book1);
        library = new Library(books, printStream);

        library.printBooks();

        verify(printStream).println("BookDetails");
    }

    @Test
    public void shouldPrintMultipleBooks() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        Collection<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        library = new Library(books, printStream);

        library.printBooks();

        verify(printStream, times(2)).println(anyString());
    }
}
