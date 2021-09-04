package com.ataev.sort;

public class SortFactory {
    public ISort getSortMethod(String method) {

        switch (method) {
            case "bubbleSort":
                return new BubbleSort();
            case "insertSort":
                return new InsertSort();
            case "shakerSort":
                return new ShakerSort();
            case "shellSort":
                return new ShellSort();
            case "mergeSort":
                return new MergeSort();
            default:
                return new SelectionSort();
        }

    }
}
