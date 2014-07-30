package com.twu.biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {
    private PrintStream out;
    private Library library;

    public BibliotecaApp (Library library, PrintStream out) {
        this.library = library;
        this.out = out;
    }

    public void start() {
        out.println("Welcome to Biblioteca!");
        library.printBooks();
    }
}
