package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

/**
 * @author Ataev Ismayyl
 * @implNote ISort override method sort
 * @parametr one MyArray
 * method sorts according to the principle bubble sort
 *
 *
 * */



public class BubbleSort implements ISort {

    private static final Logger logger = LogManager.getLogger(BubbleSort.class);

    @Override
    public void sort(MyArray array) {
        for (int i = 0; i < array.getLength() - 1; i++) {
            for (int j = i; j < array.getLength(); j++) {
                if (array.compare(array.getIndex(i), array.getIndex(j)) == 1) {
                    Person.swap(array.getIndex(i), array.getIndex(j));
                }
            }
        }
    }
}
