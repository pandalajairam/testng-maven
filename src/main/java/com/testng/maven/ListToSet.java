package com.testng.maven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[] {1,2,3,4,5,6,6,6,7,6,5,3,9};
		
        Set<Integer> hSet = new HashSet<Integer>(); 
        for (Integer x : list) 
            hSet.add(x);
        List<Integer> namesList = new ArrayList<Integer>(hSet);
        Collections.reverse(namesList);
        System.out.println(namesList.get(2));

	}

}
