package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BookDirectoryTestSuite {
    /*
    testListBooksWithConditionReturnList — ten test sprawdzi,
    czy lista książek spełniających warunek wyszukiwania jest
    poprawnie zwracana
     */
    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
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

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    /*
    testListBooksWithConditionMoreThan20 — ten test posłuży do sprawdzenia,
    czy metoda listBooksWithCondition(String titleFragment)
    zachowuje się poprawnie, gdy liczba tytułów pasujących do wzorca
    jest większa niż 20.
    W tej sytuacji zwracana powinna być pusta lista
     */
    @Test
    public void testListBooksWithConditionMoreThan20() {
        assertTrue(false);
    }


    /*
    testListBooksWithConditionFragmentShorterThan3 — ten test sprawdza,
    czy zwracana lista książek jest pusta, w sytuacji,
    gdy wyszukiwany fragment tytułu jest krótszy niż trzy znaki
     */
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        assertTrue(false);
    }
}
