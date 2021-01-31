package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> theList = new ArrayList<>();
        ArrayList<Integer> newList = oddNumbersExterminator.exterminate(theList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(newList.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator2 = new OddNumbersExterminator();
        ArrayList<Integer> theList2 = new ArrayList<>();
        theList2.add(5);
        theList2.add(9);
        theList2.add(3);
        theList2.add(2);
        theList2.add(8);
        //When
        ArrayList<Integer> newList2 = oddNumbersExterminator2.exterminate(theList2);
        System.out.println("Testing exterminating method");
        //Then
        Assertions.assertEquals(newList2.size(), 2);
    }
}
