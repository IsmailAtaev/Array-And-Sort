package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;


public class ShellSort implements ISort {
    @Override
    public void sort(MyArray array) {

        int step = array.getLength() / 2;
        while (step > 0) {
            for (int i = 0; i < array.getLength(); i++) {
                int j = i;
                while ((j >= step) && array.compare(array.getIndex(j - step), array.getIndex(j)) == 1) {
                    Person.swap(array.getIndex(j - step), array.getIndex(j));
                    j -= step;
                }
            }
            step /= 2;
        }
    }
}