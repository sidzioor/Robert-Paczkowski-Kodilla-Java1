package com.kodilla.testing.library;

import com.kodilla.testing.Library.Book;
import com.kodilla.testing.Library.BookLibrary;
import com.kodilla.testing.Library.LibraryDatabase;
import com.kodilla.testing.Library.LibraryUser;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");


        assertEquals(4, theListOfBooks.size());
    }
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Test
    public void testListBooksWithConditionMoreThan20(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        //Whem
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListofBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListBooks40 = bookLibrary.listBookWithCondition("FortyBooks");

        //Given
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListofBooks15.size());
        assertEquals(0, theListBooks40.size());
    }
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testListBooksInHandsOf(){
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        LibraryUser libraryUser1 = new LibraryUser("Jhon", "Rambo", "1234567891");
        LibraryUser libraryUser2 = new LibraryUser("Wladimir", "Smirnof", "1987654321");
        LibraryUser libraryUser3 = new LibraryUser("Thomas", "Veyne", "5432167899");
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser1)).thenReturn(new ArrayList<>());
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2)).thenReturn(generateListOfNBooks(1));
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3)).thenReturn(generateListOfNBooks(5));

        //When
        List<Book> theHandOf0Books = bookLibrary.listBooksInHandsOf(libraryUser1);
        List<Book> theHandOf1Book = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> theHandOf5Books = bookLibrary.listBooksInHandsOf(libraryUser3);

        //Then
        assertEquals(0, theHandOf0Books.size());
        assertEquals(1, theHandOf1Book.size());
        assertEquals(5, theHandOf5Books.size());
    }
}
