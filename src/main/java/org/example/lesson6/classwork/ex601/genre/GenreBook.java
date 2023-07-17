package org.example.lesson6.classwork.ex601.genre;

import org.example.lesson6.classwork.ex601.genre.Genre;

public class GenreBook implements Genre {
    private String genreName;

    public GenreBook(String genreName) {
        this.genreName = genreName;
    }

    @Override
    public String toGenre() {
        return genreName;
    }
}
