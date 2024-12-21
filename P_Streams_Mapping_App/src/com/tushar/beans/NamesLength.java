package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;

public class NamesLength {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
        list.add("Anushka");
        list.add("Trisha");
        list.add("Nayantara");
        list.add("Pooja Hedge");
        list.add("Anupama Parmeshwaram");
        list.add("Amisha Patel");
        
        list.stream().map(name -> name.toUpperCase() + " : " + name.length()).forEach(System.out::println);
        
        //Map to Integer
        list.stream().mapToInt(name -> name.length()).forEach(System.out::println);
        
        //Get names which starts with "A" and length of that names.
        list.stream().filter(name -> name.startsWith("A")).map(name -> name.toUpperCase() + " : " + name.length()).forEach(System.out::println);
     
        //Here first data will transform and then it will filter so this is also gives same output but the issue is this will transform all the data then it will filter.
        list.stream().map(name -> name.toUpperCase() + " : " + name.length()).filter(name -> name.startsWith("A")).forEach(System.out::println);
	
	}
}
