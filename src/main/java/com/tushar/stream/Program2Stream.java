package com.tushar.stream;

import com.tushar.stream.utility.Utility;

import java.util.ArrayList;
import java.util.List;

public class Program2Stream {
    public static void main(String[] args) {
        List<Integer> list1 = Utility.getIntegers();

        //Old approach to double the value:
        List<Integer> oldApproachList = new ArrayList<>();
        for(Integer integerData : list1) {
            oldApproachList.add(integerData * 2);
        }
        System.out.println(oldApproachList);

        //New approach to double the value:
        List<Integer> list2 = Utility.getIntegers();
        List<Integer> newApproachList = list2.stream().map(data -> data * 2).toList();
        System.out.println(newApproachList);
    }
}
