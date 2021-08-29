package com.ataev.Array;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import com.ataev.person.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;


/**
 * @author: Ataev Imsayyl
 * @implNote:
 */


public class MyArray implements Comparator<Person> {
    private static final Logger logger = LogManager.getLogger(MyArray.class);
    private int capacity = 1;
    private int length = 0;
    private Person[] array;

    public MyArray() {
        this.array = new Person[capacity];
    }

    public MyArray(int capacity) {
        this.capacity = capacity;
        this.array = new Person[this.capacity];
    }


    public Person getIndex(int index) throws IllegalArgumentException {
        return array[index];
    }

    public void serReference(Person[] p) {
        this.array = p;
    }

    public Person[] getReference() {
        return array;
    }

    public void add(Person p) {
        if (this.length >= this.capacity) {
            //MyArray b = new MyArray(capacity * 2);
            Person[] b = MyArray.copy(array);
            array = b;
            this.capacity = b.length;
           // System.out.println(this.capacity + " capacity array ");
            //this.length++;
            //this.array = b.getReference();
        }
        this.array[length] = p;
        length++;
    }

    public void print() {
        if (!this.isEmpty()) {
            for (int i = 0; i < this.getLength(); i++) {
                if (this.array[i] != null)
                    System.out.println(array[i].toString());
            }
        }
        logger.log(Level.ERROR, "array is Empty equals null do not print");
    }

    public void delete() {
        this.array[length] = null;
        length--;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getLength() {
        return length;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(capacity, length);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.compareTo(o2);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArray array1 = (MyArray) o;
        return capacity == array1.capacity && length == array1.length && Arrays.equals(array, array1.array);
    }*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MyArray myArray = (MyArray) obj;

        Person[] persons = myArray.getReference();
        for (int i = 0; i < length; i++) {
            if (!array[i].equals(persons[i])) return false;
        }
        return true;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //TODO надо закончить method add to
    private static void copyArray(Person a[], MyArray b) throws NullPointerException {
        if (a.equals(null)) {
            logger.log(Level.ERROR, "array null do not copy array second");
            throw new NullPointerException("Null pointer Person a[] ");
        }
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
    }

    private static Person[] copy(Person[] temp) {

        if (temp.equals(null)) {
            logger.log(Level.ERROR, "array null do not copy array second");
            throw new NullPointerException("Null pointer Person a[] ");
        }

        Person personArray[] = new Person[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            //if (temp[i] != null) {
            personArray[i] = temp[i];
            //}
        }
        return personArray;
    }
}