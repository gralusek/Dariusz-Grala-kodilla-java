package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MediaAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    void publicationYearMedianTest() {
        //Given
        MediaAdapter adapter = new MediaAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("J. R. R. Tolkien", "Władca Pierścieni", 1970, "LOTR"));
        books.add(new Book("J. K. Rowling", "Harry Potter", 1997, "HP1"));
        books.add(new Book("Brandon Sanderson", "Droga Królów", 2000, "Droga"));
        //When
        double median = adapter.publicationYearMedian(books);
        //Then
        assertEquals(1997, median);
    }
}
