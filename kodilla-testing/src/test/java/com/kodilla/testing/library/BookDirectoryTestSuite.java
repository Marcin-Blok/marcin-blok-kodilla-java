package com.kodilla.testing.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class BookDirectoryTestSuite {
    /*
    testListBooksWithConditionReturnList — ten test sprawdzi,
    czy lista książek spełniających warunek wyszukiwania jest
    poprawnie zwracana
     */
    @Test
    public void testListBooksWithConditionsReturnList() {
        assertTrue(false);
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
