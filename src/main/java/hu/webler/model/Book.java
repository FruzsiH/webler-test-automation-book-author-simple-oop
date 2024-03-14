package hu.webler.model;

import hu.webler.value.Category;

public class Book {

    private String title;
    private Author author;
    private Category category;

    public Book() {

    }

    public Book(String title, Author author, Category category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    /*@Override
    public String toString() {
        return "Title: " + title + " author: " + author.getName() + " category: " + category;
    }*/
}
