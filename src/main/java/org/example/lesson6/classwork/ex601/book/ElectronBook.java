package org.example.lesson6.classwork.ex601.book;

import org.example.lesson6.classwork.ex601.genre.GenreBook;

public class ElectronBook extends Book {
    private String format; // todo: change format
    private Integer size;


    public ElectronBook() {
    }

    public ElectronBook(String name, String author, int year, GenreBook genre, String format, Integer size) {
        super(name, author, year, genre);
        this.format = format;
        this.size = size;
    }


    public String getFormat() {
        return format;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "ElectronBook{" +
                "name='" + super.getName() + '\'' +
                ", author='" + super.getAuthor() + '\'' +
                ", year=" + super.getYear() +
                "format='" + format + '\'' +
                ", size=" + size +
                '}';
    }
}
