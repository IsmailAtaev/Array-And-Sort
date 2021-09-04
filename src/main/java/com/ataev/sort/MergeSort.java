package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

/**
 * @author Ataev Ismayyl
 * binary
 * делим рекурсивно пока не будет n отделных элементов
 * 1-е операця спуск
 * 2-е оперция слияния
 * сложность O(n * log(n)); всегда
 * разделяй и властуй
 * дополнительная память расход O(n)
 * */


public class MergeSort implements ISort {

    private static final Logger logger = LogManager.getLogger(MergeSort.class.getName());

    @Override
    public void sort(MyArray array) {
        Person[] issy = arraySorted(array.getReference());
        array.serReference(issy);
    }

    private Person[] arraySorted(Person[] arr) {

        if (arr.length <= 1) {
            return arr;
        }

        int midpoint = arr.length / 2;
        Person[] left = new Person[midpoint];
        Person[] right;

        if (arr.length % 2 == 0) {
            right = new Person[midpoint];
        } else {
            right = new Person[midpoint + 1];
        }

        for (int i = 0; i < midpoint; i++) {
            left[i] = arr[i];
        }
        //copy min zero

        for (int j = 0; j < right.length; j++) {
            right[j] = arr[midpoint + j];
        }

        left = arraySorted(left);
        right = arraySorted(right);
        return Merge(left, right);
    }

    public static Person[] Merge(Person[] left, Person[] right) {

        Person[] result = new Person[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {

            if (leftPointer < left.length && rightPointer < right.length) {

                if (left[leftPointer].compareTo(right[rightPointer]) == -1) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }

            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }

    // do not use today because have error
    /*  private MyArray merge(Person[] left, Person[] right) {

        int length = left.length + right.length;
        int leftPointer = 0;
        int rightPointer = 0;
        MyArray result = new MyArray(length);

        for (int i = 0; i < length; i++) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (result.compare(left[leftPointer], right[rightPointer]) == -1) {
                    result.add(left[leftPointer]);
                    leftPointer++;
                } else {
                    result.add(right[rightPointer]);
                    rightPointer++;
                }
            } else {
                if (rightPointer < right.length) {
                    result.add(right[rightPointer]);
                    rightPointer++;
                } else {
                    result.add(left[leftPointer]);
                    leftPointer++;
                }
            }
        }
        return result;
    }
    private MyArray getSortedMyArray(MyArray arr){
        if (arr.getLength() == 1) {
            logger.log(Level.INFO, "array have one element do not sort");
        }
        int mid = arr.getLength() / 2;
        MyArray left = arr.takeMyArray(mid);
        MyArray right = arr.skipMyArray(mid);

        return mergeArray(getSortedMyArray(left),getSortedMyArray(right));
    }
    private MyArray mergeArray(MyArray left, MyArray right) {
        int length = left.getLength() + right.getLength();
        int leftPointer = 0;
        int rightPointer = 0;
        MyArray result = new MyArray();

        for (int i = 0; i < length; i++) {
            if (leftPointer < left.getLength() && rightPointer < right.getLength()) {
                if (result.compare(left.getIndex(leftPointer), result.getIndex(rightPointer)) == -1) {
                    result.add(left.getIndex(leftPointer++));
                } else {
                    result.add(right.getIndex(rightPointer++));
                }
            } else {
                if (rightPointer < right.getLength()) {
                    result.add(right.getIndex(rightPointer++));
                } else {
                    result.add(left.getIndex(leftPointer++));
                }
            }
        }
        return result;
    }
   */
}