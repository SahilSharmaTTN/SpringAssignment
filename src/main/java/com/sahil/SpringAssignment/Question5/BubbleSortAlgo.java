package com.sahil.SpringAssignment.Question5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgo implements SortingAlgorithm{

    @Override
    public void sort(int[] arr) {
        System.out.println("Sort using Bubble sort");
        //sorting using bubble sort
    }
}
