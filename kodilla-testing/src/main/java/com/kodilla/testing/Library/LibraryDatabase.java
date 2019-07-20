package com.kodilla.testing.Library;

import java.util.List;
public interface LibraryDatabase {
    //lists books having tittle beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //List books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    //try to rent a book for libraryUser
    //returns true when success
    //and return false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser);

    //return all books borrowed by libraryUser to the library
    //returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
