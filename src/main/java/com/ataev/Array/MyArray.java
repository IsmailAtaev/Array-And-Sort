package com.ataev.Array;

import com.ataev.person.Person;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * @author Ataev Imsayyl
 * @implNote Comparator, Serializable
 * @throws: IllegalArgumentException, CloneNotSupportedException, NullPointerException
 */

public class MyArray implements Comparator<Person>, Serializable {
    private static final Logger logger = LogManager.getLogger(MyArray.class);
    private int capacity = 1;
    private int length = 0;
    private Person[] array;

    public MyArray() {
        this.array = new Person[capacity];
    }

    /**
     * @param capacity
     * */
    public MyArray(int capacity) {
        this.capacity = capacity;
        this.array = new Person[this.capacity];
    }

    /**
     * @param index
     * check index less zero then exception
     * @throws IllegalArgumentException
     * @return object
     * */
    public Person getIndex(int index) throws IllegalArgumentException {
        if (index > this.length) {
            throw new IllegalArgumentException();
        }
        return array[index];
    }

    /**
     * @param personArray
     * */
    public void serReference(Person[] personArray) {
        this.array = personArray;
    }


    public Person[] getReference() {
        return array;
    }


    /**
     * @param p
     * check length more capacity then call method copy
     * otherwise add new Object and increase length
     * */
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

    /**
     * @param temp
     * check temp equals null
     * @throws NullPointerException
     * create new array Person multiplied by two
     * if it is object have elements
     * then copy in new arrays
     * @return array Person
     * */
    private static Person[] copy(Person[] temp) {
        /* do not equals becouse under have for loop */
        if (temp.equals(null)) {
            logger.log(Level.ERROR, "array null do not copy array second");
            throw new NullPointerException("Null pointer Person a[] ");
        }

        Person personArray[] = new Person[temp.length * 2];
        for (int i = 0; i < temp.length; i++) {
            personArray[i] = temp[i];
        }
        return personArray;
    }

    public void print() {
        for (int i = 0; i < this.getLength(); i++) {
            if (this.array[i] != null)
                System.out.println(array[i].toString());
        }
    }

    public void delete() {
        if (this.isEmpty()) return;
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
        return  Arrays.equals(myArray.array,array);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private static void copyArray(Person a[], MyArray b) throws NullPointerException {
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
    }



    /**
     * @param count
     * @return Array Person
     * copy from begin to count
     * */
    public Person[] take(int count) {
        Person person[] = new Person[count];
        for (int i = 0; i < count; i++) {
            person[i] = this.array[i];
        }
        return person;
    }

    /**
     * @param count
     * @return MyArray
     * @throws CloneNotSupportedException,Exception
     * copy from begin to count
     * */
    public MyArray takeMyArray(int count) {
        MyArray arr = new MyArray();
        try {
            for (int i = 0; i < count && count < this.getLength(); i++) {
                arr.add((Person) array[i].clone());
            }

        } catch (CloneNotSupportedException e) {
            logger.log(Level.ERROR, e.getMessage());
        } catch (Exception e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        return arr;
    }

    /**
     * @return MyArray
     * @param count
     * copy from count to end
     * */
    public MyArray skipMyArray(int count) {
        MyArray newArray = new MyArray();
        try {
            if (count < this.length) {
                for (int i = count; i < this.length; i++) {
                    newArray.add((Person) array[i].clone());
                }
            }
        } catch (CloneNotSupportedException e) {
            logger.log(Level.ERROR, e.getMessage());
        } catch (Exception e) {
            logger.log(Level.ERROR, e.getMessage());
        }
        return newArray;
    }

    /**
     * @param: tempCount
     * @return Person array
     * copy from count to end
     * */
    public Person[] skip(int count) {
        int tempCount = count;
        Person person[] = new Person[count];

        for (int i = 0; i < count; i++) {
            person[i] = this.array[tempCount++];
        }
        return person;
    }

}
