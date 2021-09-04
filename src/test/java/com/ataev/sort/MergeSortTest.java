package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.file.PersonDataReadFile;
import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sortMergeTest() {

        SortFactory factory = new SortFactory();
        PersonDataReadFile readFile =  new PersonDataReadFile();
        ISort mergeSort = factory.getSortMethod("mergeSort");

        MyArray array = new MyArray();
        array.add(new Person(23, "Kamar"));
        array.add(new Person(21, "Sultan"));
        array.add(new Person(33, "Ivan"));
        array.add(new Person(20, "Ali"));

        MyArray expectedArray = new MyArray();
        expectedArray.add(new Person(20, "Ali"));
        expectedArray.add(new Person(21, "Sultan"));
        expectedArray.add(new Person(23, "Kamar"));
        expectedArray.add(new Person(33, "Ivan"));

        mergeSort.sort(array);
        for (int i = 0 ; i < array.getLength(); i++) {
            Assert.assertEquals(expectedArray.getIndex(i), array.getIndex(i));
        }
    }
}