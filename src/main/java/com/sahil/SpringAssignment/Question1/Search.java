package com.sahil.SpringAssignment.Question1;

public class Search {

    public static void main(String[] args) {

        // I am using binary search example
        // to show tight coupling as for sorting the array we will have 2 options
        // BubbleSort and QuickSort

        BinarySearch binarySearch =  new BinarySearch();

        boolean result = binarySearch.binarySearch(new int[]{1,2,3},3);
        System.out.println(result);

    }
}
