package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * auther Ataev Ismayyl
 *  шейкер сортировка по возрастанию
 *  сперва мы сортируем по левой стороны 1 раз
 *  и уменьшаем параметр right на один элемент,
 *  затем мы сортируем по правой стороны и увеличиваем left на один элемент
 *  и повторяем пока наш массив не отсортируете
 * */

//TODO если мы один раз прошлись и массив был отсортирован то надо закончить цикл
// если не было swap

public class ShakerSort implements ISort {

    private static final Logger logger = LogManager.getLogger(ShakerSort.class);

    @Override
    public void sort(MyArray array) {
        int swapCount = 0;
        int left = 0; // until the left side reaches the middle increase
        int right = array.getLength() - 1; // until the left side reaches the middle decrease
        while (left < right) {

            for (int i = 0; i < right; i++) {
                if (array.compare(array.getIndex(i), array.getIndex(i + 1)) == 1) {
                    Person.swap(array.getIndex(i), array.getIndex(i + 1));
                    swapCount++;
                }
            }
            right--;

            if (swapCount == 0) {
                logger.log(Level.INFO, "ShakerSort array already sort");
                break;
            }

            for (int j = right; j > left; j--) {
                if (array.compare(array.getIndex(j), array.getIndex(j - 1)) == -1) {
                    Person.swap(array.getIndex(j), array.getIndex(j - 1));
                }
            }
            left++;
        }
    }
}