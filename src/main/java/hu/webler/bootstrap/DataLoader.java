package hu.webler.bootstrap;

import hu.webler.model.Author;
import hu.webler.model.Book;
import hu.webler.value.Category;

import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public List<Book> loadData() {
        List<Book> books = new ArrayList<>();

        Author author1 = new Author("John Doe");
        Author author2 = new Author("Jane Smsthi");

        Book book1 = new Book("Book 1", author1, Category.FICTION);
        Book book2 = new Book("Book 2", author2, Category.NON_FICTION);
        Book book3 = new Book("Book 3", author1, Category.SCIENCE_FICTION);

        books.add(book1);
        books.add(book2);
        books.add(book3);

        return books;
    }
}
