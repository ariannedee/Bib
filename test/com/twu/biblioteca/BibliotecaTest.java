package com.twu.biblioteca;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BibliotecaTest {

    private PrintStream printStream;
    private Library library;
    private BibliotecaApp biblioteca;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        library = mock(Library.class);
        bufferedReader = mock(BufferedReader.class);
        biblioteca = new BibliotecaApp(library, printStream, bufferedReader);
    }

    @Test
    public void shouldPrintWelcomeMessageOnStart() {
        biblioteca.start();
        verify(printStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void shouldShowMenuWhenStarting() {
        biblioteca.start();

        verify(printStream).println("List Books");
    }

    @Test
    public void shouldGetUserInput() throws IOException {
        biblioteca.start();

        verify(bufferedReader).readLine();
    }
}
