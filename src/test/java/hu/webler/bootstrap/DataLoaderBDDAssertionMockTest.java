package hu.webler.bootstrap;

import hu.webler.model.Author;
import hu.webler.model.Book;
import hu.webler.value.Category;
import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class DataLoaderBDDAssertionMockTest {

    @Mock
    DataLoader mockDataLoader;

    @BeforeEach
    public void setUp() {
        mockDataLoader = Mockito.mock(DataLoader.class);
    }

    @Test
    @DisplayName("Given Dataloader when loaddata() then return mock books")
    public void givenDataLoaderMock_whenLoadData_thenReturnMockBooks() {
        //Given
        BDDMockito.given(mockDataLoader.loadData())
                .willReturn(
                        Arrays.asList(
                                new Book("Book 1", new Author("John Doe"), Category.FICTION),
                                new Book("Book 2", new Author("Jane Smith"), Category.NON_FICTION),
                                new Book("Book 3", new Author("John Doe"), Category.SCIENCE_FICTION)
                        )
                );

        //When
        List<Book> result = mockDataLoader.loadData();

        //Then
        then(result).hasSize(3);
        then(result.get(1).getAuthor().getName()).isEqualTo("Jane Smith");
    }
}

