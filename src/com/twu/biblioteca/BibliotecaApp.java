package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class BibliotecaApp {
    private PrintStream out;
    private Library library;
    private BufferedReader bufferedReader;

    public BibliotecaApp(Library library, PrintStream out, BufferedReader bufferedReader) {
        this.library = library;
        this.out = out;
        this.bufferedReader = bufferedReader;
    }

    public void start() {
        out.println("Welcome to Biblioteca!");

        out.println("List Books");

        try {
            bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        library.printBooks();
    }
}
