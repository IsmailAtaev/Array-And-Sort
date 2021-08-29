package com.ataev.person;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * @author: Ataev Ismayyl
 * @param: logger for logging
 * @param: age human
 * @param: name human
 * @implNote: Comparable */

public class Person implements Comparable<Person> {

    private static final Logger logger = LogManager.getLogger(Person.class);
    private int age;
    private String name;

    public Person(Person person) {
        this.age = person.getAge();
        this.name = person.getName();

    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setPerson(Person p) {
        this.age = p.getAge();
        this.name = p.getName();
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Person(this.getAge(), this.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "age= " + age +
                ", name='" + name + '\'' +
                '}';
    }

    //TODO or swap reference ?
    public static void swap(Person p1, Person p2) {
        Person person = new Person(p1.getAge(), p1.getName());
        p1.setAge(p2.getAge());
        p1.setName(p2.getName());
        p2.setAge(person.getAge());
        p2.setName(person.getName());
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() > o.getAge()) {
            return 1; //TODO name.compareTo(o.getName());
        } else if (this.getAge() == o.getAge()) {
            return 0; //TODO this.getName().compareTo(o.getName());
        } else
            return -1;
    }
}