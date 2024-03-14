package hu.webler.bootstrap;

import hu.webler.model.Book;
import hu.webler.value.Category;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
//IntelliJ generálja. legegyszerűbb módszer
class DataLoaderTest {


    @Test
    public void testLoadData() {

        List<Book> books = new DataLoader().loadData();

        assertNotNull(books);
        assertEquals(3, books.size());

        //Test individual books
        Book book1 = books.getFirst();
        assertEquals("Book 1", book1.getTitle());
        assertEquals("John Doe", book1.getAuthor().getName());
        assertEquals(Category.FICTION, book1.getCategory());//enumként hasonlít
        assertEquals("FICTION", book1.getCategory().name());//Stringként hasonít
    }


}