package com.sahil.SpringAssignment.Question6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    SortingAlgorithm sortingAlgorithm;

    BinarySearchImpl(SortingAlgorithm sortingAlgorithm){
        this.sortingAlgorithm = sortingAlgorithm;
    }

    boolean binarySearch( int arr[] , int numberToSearch){

        //Sorting the array before using binary search algorithm

        sortingAlgorithm.sort(arr);
        //search code

        System.out.println("Searching for :" + numberToSearch);

        return true;
    }
}
