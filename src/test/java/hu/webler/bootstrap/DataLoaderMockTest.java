package hu.webler.bootstrap;

import hu.webler.model.Author;
import hu.webler.model.Book;
import hu.webler.value.Category;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//elnevezés csak a tartalom miatt, nem szoktunk több eltérőt írni. a lépésről lépésre dolgok miatt vannak külön
public class DataLoaderMockTest {

    @Test
    public void testLoadData() {

        //create mock objects
        DataLoader mockDataLoader = Mockito.mock(DataLoader.class);


        //define sample data
        Author author1 = new Author("XXX");
        Author author2 = new Author("YYY");

        Book book1 = new Book("Book 1", author1, Category.HORROR);
        Book book2 = new Book("Book 2", author2, Category.BIOGRAPHY);
        Book book3 = new Book("Book 3", author1, Category.MYSTERY);

        List<Book> mockBooks = Arrays.asList(book1, book2, book3);

        //Mock behavior of DataLoader
        when(mockDataLoader.loadData()).thenReturn(mockBooks);

        //Invite the method under test
        List<Book> result = mockDataLoader.loadData();

        //Verify the result
        assertEquals(3, result.size());
        assertEquals("Book 3", result.getLast().getTitle());
        assertEquals("MYSTERY", result.getLast().getCategory().name());
        assertEquals("XXX", result.getLast().getAuthor().getName());

    }
}
