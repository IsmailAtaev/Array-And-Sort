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
    public void add() {
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
}