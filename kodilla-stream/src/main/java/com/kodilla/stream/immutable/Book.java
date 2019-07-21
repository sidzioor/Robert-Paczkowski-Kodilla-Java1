package com.kodilla.stream.immutable;

public class Book {
    private final String title;
    private final String author;
    private final int yearsOfPublication;

    public Book(final String title, final String author, final int yearsOfPublication) {
        this.title = title;
        this.author = author;
        this.yearsOfPublication = yearsOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearsOfPublication() {
        return yearsOfPublication;
    }

}
