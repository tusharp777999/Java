package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesFilter {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Anushka");
        list.add("Trisha");
        list.add("Nayantara");
        list.add("Pooja Hedge");
        list.add("Anupama Parmeshwaram");
        list.add("Amisha Patel");
        
        //Stream<String> stream = list.stream();
        //stream.filter(name -> name.startsWith("A")).forEach(System.out::println);
        list.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
	}
}
