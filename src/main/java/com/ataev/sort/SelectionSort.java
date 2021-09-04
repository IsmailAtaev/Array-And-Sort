package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

/**
 * @author Ataev Ismayyl
 * @parametrs: MyArray array
 * @param: logger
 * O(n^2)
 * Selection sort is better than bubble sort because there is less swap
 * the logic behind it is remembering the index of the smaller value and
 * if we don't find the smaller value
 * then swap the null index with the index we memorized
 * then increase the zero index and repeat the same thing
 * */

public class SelectionSort implements ISort {

    private static final Logger logger = LogManager.getLogger(SelectionSort.class.getName());

    @Override
    public void sort(MyArray array) {

        int minIndex = 0;

        for (int i = 0; i < array.getLength() - 1; i++) {
            logger.log(Level.INFO, " i пока не будет равен array.getLength()"
                    + " проходим по всему массиву");
            minIndex = i;

            for (int j = i + 1; j < array.getLength(); j++) {
                if (array.getIndex(j).compareTo(array.getIndex(minIndex)) == -1) {
                    minIndex = j;
                    logger.log(Level.INFO, "minIndex = j because j less then minIndex");
                }
            }

            if (i != minIndex) {
                Person.swap(array.getIndex(i), array.getIndex(minIndex));
                logger.log(Level.ERROR, "if i do not equals minIndex"
                        + " swap i with minIndex");
            }
        }
    }
}