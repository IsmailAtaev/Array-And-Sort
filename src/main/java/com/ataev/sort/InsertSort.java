package com.ataev.sort;

import com.ataev.Array.MyArray;
import com.ataev.person.Person;

public class InsertSort implements ISort {

    @Override
    public void sort(MyArray array) {

        Person[] p = array.getReference();

        for (int i = 1; i < array.getLength(); i++) {
            Person temp = new Person(p[i]);
            //   int j = i;
            int k = i;
            for (; k > 0; k--) {
                if (temp.compareTo(p[k - 1]) == 1) {
                    break;
                }
                p[k] = p[k - 1];
            }
            p[k] = temp;
           /* while (j > 0 && (temp.compareTo(p[j - 1]) == -1)) {
                p[j] = p[j - 1];
                j--;
            }
            p[j] = temp;*/
        }
        array.serReference(p);
    }
}