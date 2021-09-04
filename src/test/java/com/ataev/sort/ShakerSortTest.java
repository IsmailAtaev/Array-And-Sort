package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.file.PersonDataReadFile;
import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShakerSortTest {

    @Test
    public void sortTest() {

        SortFactory factory = new SortFactory();
        ISort sort = factory.getSortMethod("shakerSort");
        MyArray array = new MyArray();
        PersonDataReadFile readFile = new PersonDataReadFile();
        array = readFile.getMyArrayData(array);

        MyArray expectedArray = new MyArray();
        expectedArray.add(new Person(20, "Ali"));
        expectedArray.add(new Person(21, "Arslan"));
        expectedArray.add(new Person(22, "Aman"));
        expectedArray.add(new Person(23, "Kamar"));
        expectedArray.add(new Person(33, "Ivan"));
        expectedArray.add(new Person(35, "Kemal"));

        sort.sort(array);
        Assert.assertEquals(expectedArray, array);
    }
}