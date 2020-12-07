package com.kodilla.testing.Library;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @Nested
    class TestBookWithCondition {

        @Test
        void testListBooksWithConditionsReturnList() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secret of Ne York", "Dany Smith", 2012);
            Book book3 = new Book("Secret life", "Steve Jobs", 2016);
            Book book4 = new Book("Secret night", "Lenny Wright", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
            // When
            List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
            // Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBooksWithConditionMoreThan20() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf10Books = generateListOfNBooks(10);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    class TestBookInHandsOf {

        LibraryUser libraryUser = new LibraryUser("John", "Smith", "94856481256");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listOfUserBooks = new ArrayList<>();

        @Test
        void listBookInHandsOfUserWithoutBook() {
            //Given
            bookLibrary.userBooksMap.put(libraryUser, listOfUserBooks);
            //When
            List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(listOfUserBooks, result);
        }

        @Test
        void listBookInHandsOfUserWith1Book() {
            //Given
            Book book = new Book("Some title","Some author", 2000);
            listOfUserBooks.add(book);
            bookLibrary.userBooksMap.put(libraryUser, listOfUserBooks);
            //When
            List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(listOfUserBooks, result);
        }

        @Test
        void listBookInHandsOfUserWith5Books() {
            //Given
            Book book = new Book("Some title","Some author", 2000);
            Book book1 = new Book("Some title1","Some author1", 2001);
            Book book2 = new Book("Some title2","Some author2", 2002);
            Book book3 = new Book("Some title3","Some author3", 2003);
            Book book4 = new Book("Some title4","Some author4", 2004);
            listOfUserBooks.add(book);
            listOfUserBooks.add(book1);
            listOfUserBooks.add(book2);
            listOfUserBooks.add(book3);
            listOfUserBooks.add(book4);
            bookLibrary.userBooksMap.put(libraryUser, listOfUserBooks);
            //When
            List<Book> result = bookLibrary.listBooksInHandsOf(libraryUser);
            //Then
            assertEquals(listOfUserBooks, result);
        }
    }
}