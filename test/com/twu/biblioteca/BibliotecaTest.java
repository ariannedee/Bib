package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    private PrintStream ps = mock(PrintStream.class);
    private Library library;
    private BibliotecaApp biblioteca;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        biblioteca = new BibliotecaApp(library, ps);
    }

    @Test
    public void shouldPrintWelcomeMessageOnStart() {
        biblioteca.start();
        verify(ps).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldPrintBooksWhenStarting() {
        biblioteca.start();

        verify(library).printBooks();
    }
}
