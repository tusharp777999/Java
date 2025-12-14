package com.tushar.predicate;

import com.tushar.staticmethods.InterfStatic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class Program2Predicate {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        //Predicate<Collection> predicate1 = (collection) -> collection.isEmpty();
        Predicate<Collection> predicate1 = Collection::isEmpty;
        System.out.println(predicate1.test(arrayList1));
        System.out.println(predicate1.test(arrayList2));
    }
}
