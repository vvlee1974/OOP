package org.example.lesson6.classwork.ex601;

import org.example.lesson6.classwork.ex601.book.Book;
import org.example.lesson6.classwork.ex601.book.ElectronBook;
import org.example.lesson6.classwork.ex601.formatter.FormatJSON;
import org.example.lesson6.classwork.ex601.formatter.Formatter;
import org.example.lesson6.classwork.ex601.genre.GenreBook;
import org.example.lesson6.classwork.ex601.search.Library;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Library library = new Library(Arrays.asList(
                new Book("Властелин колец", "Толкиен", 1984, new GenreBook("tyusd")),
                new Book("Гарри Поттер", "rty", 1994, new GenreBook("bvnbvcn")),
                new Book("qwe", "rty", 2005, new GenreBook("gyuhq")),
                new ElectronBook("iop", "Толкиен", 2005, new GenreBook("gyuhq"), "pdf", 125),
                new ElectronBook("zxc", "vbn", 2005, new GenreBook("bvnbvcn"), "pdf", 200)
        ));

        System.out.println("library.booksSearchByAuthor(\"Толкиен\") = " + library.booksSearchByAuthor("Толкиен"));
        System.out.println("library.booksSearchByAuthor(\"rty\") = " + library.booksSearchByAuthor("rty"));
        Formatter formatter = new FormatJSON();

        formatter.toFormat((ElectronBook) library.getBooks().get(3));
        formatter.toFormat((ElectronBook) library.getBooks().get(4));
    }
}
