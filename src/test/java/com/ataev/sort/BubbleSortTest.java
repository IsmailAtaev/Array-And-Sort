package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.file.PersonDataReadFile;
import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;


public class BubbleSortTest {

    @Test
    public void sortBubbleTest() {

        SortFactory factory = new SortFactory();
        MyArray array = new MyArray();
        PersonDataReadFile file = new PersonDataReadFile();

        ISort bubbleSort = factory.getSortMethod("bubbleSort");
        array = file.getMyArrayData(array);

        MyArray expectedArray = new MyArray();
        expectedArray.add(new Person(20, "Ali"));
        expectedArray.add(new Person(21, "Arslan"));
        expectedArray.add(new Person(22, "Aman"));
        expectedArray.add(new Person(23, "Kamar"));
        expectedArray.add(new Person(33, "Ivan"));
        expectedArray.add(new Person(35, "Kemal"));

        bubbleSort.sort(array);
        Assert.assertEquals(expectedArray, array);
    }
}

/*  array.add(new Person(23, "Kamar"));
        array.add(new Person(20, "Ismail"));
        array.add(new Person(21, "Sultan"));
        array.add(new Person(33, "Ivan"));
        array.add(new Person(20, "Ali"));
        array.add(new Person(21, "Arslan"));
        array.add(new Person(21, "Merdan"));
        array.add(new Person(22, "Aman"));*/