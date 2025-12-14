package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class Program1Stream {
    public static void main(String[] args) {
        List<Integer> list1 = Utility.getIntegers();

        //Old approach to print even number list:
        List<Integer> oldApproachList = new ArrayList<>();
        for(Integer integerData : list1) {
            if(integerData % 2 == 0) {
                oldApproachList.add(integerData);
            }
        }
        System.out.println(oldApproachList);

        //New approach to print even number list:
        List<Integer> list2 = Utility.getIntegers();
        List<Integer> newApproachList = list2.stream().filter(data -> data % 2 == 0).toList();
        System.out.println(newApproachList);
    }
}
