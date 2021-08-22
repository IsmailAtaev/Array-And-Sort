package com.ataev.Array;

/**@Author Ataev Imsayyl
*/

import com.ataev.person.Person;

public class MyArray {
    private Integer capacity = 10;
    private Integer length = 0;
    private Person array[];

    public MyArray(Integer capacity) {
        this.capacity = capacity;
        this.array = new Person[this.capacity];
    }

    public Person getIndex(Integer index) throws IllegalArgumentException {
        return array[index];
    }

    public void add(Person p) {
        if (this.length.equals(this.capacity)) {
            MyArray b = new MyArray(capacity * 2);
            MyArray.copyArray(array, b);
        }
        this.array[length] = p;
        length++;
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
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
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
            return;
        }
        for (int i = 0; i < a.length; i++) {
            b.add(a[i]);
        }
    }
}