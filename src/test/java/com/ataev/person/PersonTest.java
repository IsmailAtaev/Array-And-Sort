package com.ataev.person;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

@Test
    public void getAgeTest(){
        Person actually = new Person(22,"Leyla");
        int expectedAge = 22;
        Assert.assertEquals(expectedAge,actually.getAge());
    }
    @Test
    public void getName(){
        Person actually = new Person(22,"Leyla");
        String expectedName = "Leyla";
        Assert.assertEquals(expectedName,actually.getName());
    }

    @Test
    public void swapTest() throws CloneNotSupportedException {
        Person p1 = new Person(66, "Ivan");
        Person p2 = new Person(32, "Mered");
        Person expected = new Person(32, "Mered");
        Person.swap(p1, p2);
        Person actually = p1;
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void equalsPositiveTest() {
        Person p1 = new Person(33, "Ivan");
        Person p2 = new Person(33, "Ivan");
        boolean actually = p1.equals(p2);
        Assert.assertEquals(true, actually);
    }

    @Test
    public void equalsNegativeTest() {
        Person p1 = new Person(33, "Ivan");
        Person p2 = new Person(22, "Andrey");
        boolean actually = p1.equals(p2);
        Assert.assertEquals(false, actually);
    }

    @Test
    public void compareToEqualsTest() {
        Person p1 = new Person(33, "AA");
        Person p2 = new Person(33, "AA");
        int expected = 0;
        int actually = p1.compareTo(p2);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void compareToPositiveTest() {
        Person p1 = new Person(33, "AA");
        Person p2 = new Person(22, "BB");
        int expected = 1;
        int actually = p1.compareTo(p2);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void compareToNegativeTest() {
        Person p1 = new Person(22, "BB");
        Person p2 = new Person(33, "AA");
        int expected = -1;
        int actually = p1.compareTo(p2);
        Assert.assertEquals(expected, actually);
    }

    @Test
    public void toStringTestPositive(){
        Person actually = new Person(55,"Kamar");
        String expected = new String("Person{age= 55, name='Kamar'}");
        Assert.assertEquals(expected,actually.toString());
    }
}