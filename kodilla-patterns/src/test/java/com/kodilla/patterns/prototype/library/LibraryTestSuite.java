package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testLibrary() {
        //Given
        Book book1 = new Book("tittle1", "author1", LocalDate.of(1999, 10, 13));
        Book book2 = new Book("tittle2", "author2", LocalDate.of(1982, 07, 23));
        Book book3 = new Book("tittle3", "author3", LocalDate.of(1974, 06, 26));
        Book book4 = new Book("tittle4", "author4", LocalDate.of(2016, 03, 31));
        Book book5 = new Book("tittle5", "author5", LocalDate.of(2001, 12, 01));

        Library library = new Library("Library 1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library 2");
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        }catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book5);

        //Then
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
