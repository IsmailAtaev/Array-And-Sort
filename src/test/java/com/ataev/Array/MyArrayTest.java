package com.ataev.Array;

import com.ataev.person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayTest {

    @Test
    public void getIndex() {
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
        array.add(new Person(89, "Hardi"));
        array.add(new Person(100, "pp"));

        array.print();

    }

    @Test
    public void delete() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void getCapacity() {
    }

    @Test
    public void getLength() {
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
    public void testEquals() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void takeTest() throws CloneNotSupportedException {

        MyArray Array = new MyArray();
        Array.add(new Person(20, "Ismail"));
        Array.add(new Person(21, "Sultan"));
        Array.add(new Person(33, "Ivan"));
        Array.add(new Person(20, "Ali"));
        Array.add(new Person(21, "Arslan"));
        Array.add(new Person(21, "Merdan"));
        Array.add(new Person(22, "Aman"));
        Array.add(new Person(24, "Maksim"));
        int mid = Array.getLength() / 2;

        Person[] actuallyArray = new Person[mid];
        actuallyArray[0] = (Person) Array.getIndex(0).clone();
        actuallyArray[1] = (Person) Array.getIndex(1).clone();
        actuallyArray[2] = (Person) Array.getIndex(2).clone();
        actuallyArray[3] = (Person) Array.getIndex(3).clone();

        Person[] expectedArray = Array.take(mid);

        Assert.assertEquals(expectedArray, actuallyArray);

        Array.add(new Person(23, "Kamar"));
    }


    @Test
    public void skipTest() throws CloneNotSupportedException {

        MyArray Array = new MyArray();
        Array.add(new Person(20, "Ismail"));
        Array.add(new Person(21, "Sultan"));
        Array.add(new Person(33, "Ivan"));
        Array.add(new Person(20, "Ali"));
        Array.add(new Person(21, "Arslan"));
        Array.add(new Person(21, "Merdan"));
        Array.add(new Person(22, "Aman"));
        Array.add(new Person(24, "Maksim"));
        int mid = Array.getLength() / 2 ;

        Person[] actuallyArray = new Person[mid];
        actuallyArray[0] = (Person) Array.getIndex(4).clone();
        actuallyArray[1] = (Person) Array.getIndex(5).clone();
        actuallyArray[2] = (Person) Array.getIndex(6).clone();
        actuallyArray[3] = (Person) Array.getIndex(7).clone();

        Person[] expectedArray = Array.skip(mid);
        Assert.assertEquals(expectedArray, actuallyArray);
    }

}