package org.example.lesson6.classwork.ex601.search;

import org.example.lesson6.classwork.ex601.book.Book;

import java.util.List;

public interface Searchable {
    public List<Book> booksSearchByAuthor(String author);
}
