package com.sahil.SpringAssignment.Question2;

public class Search {

    //I have made an Interface SortingAlgorithm that is implemented by
    //Quicksort and BubbleSort class

    public static void main(String[] args) {

        //Here the binary search is loosely coupled with the sorting algorithm that
        //is to be used

        BinarySearch binarySearch1 =  new BinarySearch(new BubbleSort());

        System.out.println(binarySearch1.binarySearch(new int[]{1,2,3},3));

        BinarySearch binarySearch2 =  new BinarySearch(new QuickSort());

        System.out.println(binarySearch2.binarySearch(new int[]{1,2,3},3));



    }
}
