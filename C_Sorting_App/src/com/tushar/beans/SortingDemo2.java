package com.tushar.beans;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(21);
		al.add(32);
		al.add(5);
		al.add(8);
		
		System.out.println("Elements Before Sorting :: " + al);
		
		Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
			}
		});
		System.out.println("Elements After Sorting :: " + al);
	}

}
