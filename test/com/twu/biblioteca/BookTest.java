package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldPrintBookDetails() {
        Book book = new Book("Island", "Huxley, Aldous", 1950);
        assertEquals(book.formattedBook(), "Island     Huxley, Al 1950");
    }
}
