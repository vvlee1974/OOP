package org.example.lesson6.classwork.ex601.formatter;

import org.example.lesson6.classwork.ex601.book.ElectronBook;
import org.example.lesson6.classwork.ex601.formatter.Formatter;

public class HTMLFormatter implements Formatter {
    @Override
    public void toFormat(ElectronBook book) {
        System.out.println("Форматировали " + book + " в HTML");
    }
}
