package com.sahil.SpringAssignment.Question3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    //It will connect the sorting algorithm to the bubbleSort bean as it is marked
    //with Component
    @Autowired
    SortingAlgorithm sortingAlgorithm;


    boolean binarySearch( int arr[] , int numberToSearch){

        //Sorting the array before using binary search algorithm

        sortingAlgorithm.sort(arr);
        //search code

        System.out.println("Searching for :" + numberToSearch);

        return true;
    }
}
