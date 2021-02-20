package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //given
        Library library = new Library("book shelf");
        Book book1 = new Book("LOTR", "J. R. R. Tolkien",
                LocalDate.of(1954, 07, 29));
        library.getBooks().add(book1);
        library.getBooks().add(new Book("Harry Potter", "J. K. Rowling",
                LocalDate.of(1999, 02, 22)));
        library.getBooks().add(new Book("Hobbit", "J. R. R. Tolkien",
                LocalDate.of(1950, 10, 15)));

        //When
        //making a shallow clone of object board
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(cloneLibrary);

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //NEW: removing elements
        library.getBooks().remove(book1);
        library.getBooks().remove(new Book("Harry Potter", "J. K. Rowling",
                LocalDate.of(1999, 02, 22)));

        //Then
        assertEquals(1, library.getBooks().size());
        assertEquals(1, cloneLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
    }
}
