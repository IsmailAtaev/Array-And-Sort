package com.ataev.Array;

import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {

    @Test
    public void getIndex() {
        MyArray array = new MyArray();
        array.add(new Person(33, "Hakim"));
        array.add(new Person(34, "Vera"));
        array.add(new Person(35, "Maksim"));
        array.add(new Person(36, "Dima"));
        array.add(new Person(37, "Evva"));

        Person actually = new Person(37, "Evva");
        Person expected = array.getIndex(4);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void addTest() {
        MyArray array = new MyArray();
        array.add(new Person(33, "Isma"));
        array.add(new Person(88, "Arslan"));
        array.add(new Person(77, "Kamar"));
        array.add(new Person(55, "Atanazar"));
        array.add(new Person(44, "Bashim"));
        array.add(new Person(22, "OrazEje"));
        array.add(new Person(11, "Muho"));
        array.add(new Person(23, "Jon"));
        array.add(new Person(13, "Vick"));
        array.add(new Person(56, "Tom"));
        array.add(new Person(100, "pp"));

        Person expectedArray[] = new Person[11];

        expectedArray[0] = new Person(33, "Isma");
        expectedArray[1] = new Person(88, "Arslan");
        expectedArray[2] = new Person(77, "Kamar");
        expectedArray[3] = new Person(55, "Atanazar");
        expectedArray[4] = new Person(44, "Bashim");
        expectedArray[5] = new Person(22, "OrazEje");
        expectedArray[6] = new Person(11, "Muho");
        expectedArray[7] = new Person(23, "Jon");
        expectedArray[8] = new Person(13, "Vick");
        expectedArray[9] = new Person(56, "Tom");
        expectedArray[10] = new Person(100, "pp");

        Person[] actually = new Person[array.getLength()];
        for (int i = 0; i < array.getLength(); i++) {
            actually[i] = array.getIndex(i);
        }
        Assert.assertEquals(expectedArray, actually);


    }

    @Test
    public void delete() {

    }

    @Test
    public void isEmptyTestPositive() {
        MyArray actually = new MyArray();
        Assert.assertEquals(true, actually.isEmpty());
    }


    @Test
    public void isEmptyTestNegative() {
        MyArray actually = new MyArray();
        actually.add(new Person(22, "issy"));
        Assert.assertEquals(false, actually.isEmpty());
    }

    @Test
    public void getCapacityTest() {
        MyArray actually = new MyArray(11);
        byte expected = 11;
        Assert.assertEquals(expected, actually.getCapacity());
    }

    @Test
    public void getLengthTest() {
        MyArray actually = new MyArray();
        actually.add(new Person(20, "issy"));
        actually.add(new Person(21, "Muho"));
        byte expected = 2;
        Assert.assertEquals(expected, actually.getLength());
    }

    @Test
    public void compareEqualsTest() {
        MyArray array = new MyArray();
        Person p1 = new Person(33, "Ivan");
        Person p2 = new Person(33, "Ivan");
        int expected = 0;
        int actually = array.compare(p1, p2);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void comparePositiveTest() {
        MyArray array = new MyArray();
        Person p1 = new Person(33, "Ivanov");
        Person p2 = new Person(4, "Maksim");
        int expected = 1;
        int actually = array.compare(p1, p2);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void compareNegativeTest() {
        MyArray array = new MyArray();
        Person p1 = new Person(4, "Maksim");
        Person p2 = new Person(33, "Ivan");
        int expected = -1;
        int actually = array.compare(p1, p2);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void testEqualsTestPositive() {
        MyArray array = new MyArray();
        array.add(new Person(44, "Maksim"));
        array.add(new Person(33, "olay"));
        MyArray array1 = new MyArray();
        array1.add(new Person(44, "Maksim"));
        array1.add(new Person(33, "olay"));
        boolean actually = array.equals(array1);
        Assert.assertEquals(true, actually);
    }

    @Test
    public void testEqualsTestNegative() {
        MyArray array = new MyArray();
        array.add(new Person(44, "Maksim"));
        array.add(new Person(22, "Nepes"));
        MyArray array1 = new MyArray();
        array1.add(new Person(99, "Ilya"));
        array1.add(new Person(33, "olay"));
        boolean actually = array.equals(array1);
        Assert.assertEquals(false, actually);
    }
}