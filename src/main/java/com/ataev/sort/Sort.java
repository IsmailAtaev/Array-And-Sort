package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.types.sort.TypesOfSort;

/**
 * @author  Ataev Ismayyl
 * @param
 *
 *
 * */


public class Sort implements TypesOfSort {
    @Override
    public void bubbleSortArray(MyArray array) {
        if(array.isEmpty() || array.equals(null)) {
            return;
        }

        for (int i = 0; i < array.getLength(); i++) {
            //  if(array[i].compareTo(array.getIndex(i+1)) == 1){
            // swap (array, i , i+1);
        }
    }
}
