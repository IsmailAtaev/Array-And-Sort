package com.ataev.sort;

import com.ataev.Array.MyArray;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

/**
 * @author Ataev Ismayyl
 * binary
 * делим рекурсивно пока не будет n отделных элементов
 * 1-е операця спуск
 * 2-е оперция слияния
 * сложность O(n * log(n));
 * разделяй и властуй
 * дополнительная память расход O(n)
 *
 * */


public class MergeSort implements ISort {

    private static final Logger logger = LogManager.getLogger(MergeSort.class.getName());

    @Override
    public void sort(MyArray array) {

        if (array.getLength() == 1) {
            logger.log(Level.INFO, "array have one element do not sort");
            return;
        }
        int mid = array.getLength() / 2;


    }
}