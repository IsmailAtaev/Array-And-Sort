package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.file.PersonDataReadFile;
import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertSortTest {

    @Test
    public void sortInsertTest() {

        SortFactory factory = new SortFactory();
        MyArray array = new MyArray();
        PersonDataReadFile file =  new PersonDataReadFile();
        ISort insertSort = factory.getSortMethod("insertSort");
        array = file.getMyArrayData(array);

        MyArray expectedArray = new MyArray();
        expectedArray.add(new Person(20, "Ali"));
        expectedArray.add(new Person(21, "Arslan"));
        expectedArray.add(new Person(22, "Aman"));
        expectedArray.add(new Person(23, "Kamar"));
        expectedArray.add(new Person(33, "Ivan"));
        expectedArray.add(new Person(35, "Kemal"));
        insertSort.sort(array);
        Assert.assertEquals(expectedArray, array);
    }
}