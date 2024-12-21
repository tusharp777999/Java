package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;

public class NamesMapping {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Anushka");
        list.add("Trisha");
        list.add("Nayantara");
        list.add("Pooja Hedge");
        list.add("Anupama Parmeshwaram");
        list.add("Amisha Patel");
        
        list.stream().map(name -> name.toUpperCase()).forEach(System.out::println);
	}
}
