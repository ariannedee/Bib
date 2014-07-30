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

    @Test
    public void shouldNotifyWithInvalidMessageOptionIfNotMenuOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("not an option");

        biblioteca.start();

        verify(printStream).println("Select a valid option!");
    }

    @Test
    public void shouldNotListBooksIfNotMenuOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("not an option");

        biblioteca.start();

        verify(library, times(0)).printBooks();
    }

    @Test
    public void shouldListBooksIfListBookMenuOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("List Books");

        biblioteca.start();

        verify(library).printBooks();
    }

    @Test
    public void shouldNotNotifyWithInvalidMessageOptionIfIsMenuOption() throws IOException {
        when(bufferedReader.readLine()).thenReturn("List Books");

        biblioteca.start();

        verify(printStream, times(0)).println("Select a valid option!");
    }

//    @Test
//    public void shouldContinueShowingMenu() throws IOException {
//        when(bufferedReader.readLine()).thenReturn("-");
//
//        biblioteca.start();
//
//        verify(printStream, times(3)).println("Select a valid option!");
//    }
}
