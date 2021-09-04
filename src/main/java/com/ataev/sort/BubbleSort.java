package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author Ataev Ismayyl
 * @implNote ISort override method sort
 * difficile  work O(n^2)
 * method sorts according to the principle bubble sort
 * */

public class BubbleSort implements ISort {

    private static final Logger logger = LogManager.getLogger(BubbleSort.class);

    /**
     * @param array
     * first for loop for equals all values
     * if it is less then swap value etc
     * until it is sorted
     * */
    @Override
    public void sort(MyArray array) {
        logger.info("class bubbleSort method sort");
        for (int i = 0; i < array.getLength() - 1; i++) {
            for (int j = i; j < array.getLength(); j++) {
                if (array.compare(array.getIndex(i), array.getIndex(j)) == 1) {
                    Person.swap(array.getIndex(i), array.getIndex(j));
                }
            }
        }
    }
}
