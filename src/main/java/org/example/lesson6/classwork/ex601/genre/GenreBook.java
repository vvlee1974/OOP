package org.example.lesson6.classwork.ex601.genre;


public class GenreBook implements Genre {
    private String genreName;

    public GenreBook(String genreName) {
        this.genreName = genreName;
    }

    public GenreBook() {
    }

    @Override
    public String toGenre() {
        return genreName;
    }
}
