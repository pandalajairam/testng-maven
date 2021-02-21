package com.testng.maven;

public class FindSecondLargestMain {
    public static void main(String args[])
    {
        int[] arr1={7,7,7,7,4,2};
        int secondHighest=findSecondLargestNumberInTheArray(arr1);
        System.out.println("Third largest element in the array : "+ secondHighest);
    }
 
    public static int findSecondLargestNumberInTheArray(int array[])
    {
        // Initialize these to the smallest value possible
        int highest = 0;
        int secondHighest = 0;
        int thirdHighest = 0;
 
        // Loop over the array
        for (int i = 0; i < array.length; i++) { 
            // If current element is greater than highest 
            if (array[i] > highest) {
                // assign second highest element to highest element 
            	thirdHighest = secondHighest;
                secondHighest = highest;
                // highest element to current element
                highest = array[i];
            } else if (array[i] > secondHighest && array[i]!=highest)
            {
                // Just replace the second highest
            	thirdHighest = secondHighest;
                secondHighest = array[i];
            }
            else if(array[i] > thirdHighest && array[i]!=highest)
            	thirdHighest = array[i];
            
            System.out.println("Highest: "+highest +"\n"+"Second: "+secondHighest +"\n"+"Third: "+thirdHighest);
            System.out.println("=========");
        }
 
        // After exiting the loop, secondHighest now represents the second
        // largest value in the array
        return thirdHighest;
    }
}
