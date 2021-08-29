package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;


public class BubbleSortTest {

    @Test
    public void sortBubbleTest() {

        ISort bubbleSort = new BubbleSort();

        MyArray array = new MyArray(11);
        array.add(new Person(23, "Kamar"));
        array.add(new Person(20, "Ismail"));
        array.add(new Person(21, "Sultan"));
        array.add(new Person(33, "Ivan"));
        array.add(new Person(20, "Ali"));
        array.add(new Person(21, "Arslan"));
        array.add(new Person(21, "Merdan"));
        array.add(new Person(22, "Aman"));

        MyArray expectedArray = new MyArray();
        expectedArray.add(new Person(20, "Ismail"));
        expectedArray.add(new Person(20, "Ali"));
        expectedArray.add(new Person(21, "Sultan"));
        expectedArray.add(new Person(21, "Arslan"));
        expectedArray.add(new Person(21, "Merdan"));
        expectedArray.add(new Person(22, "Aman"));
        expectedArray.add(new Person(23, "Kamar"));
        expectedArray.add(new Person(33, "Ivan"));

        bubbleSort.sort(array);
        Assert.assertEquals(expectedArray, array);
    }
}