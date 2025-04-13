package com.tushar;

import java.util.HashSet;

public class CollectionHashCode02 {
	public static void main(String[] args) {
		HashSet<Object> data = new HashSet<Object>();
		data.add("a");
		System.out.println(data);//Here only [a] will get printed, and the ASCII value of a is 97 and the hashcode also a 97.
		
		data.add("b");
		System.out.println(data);//Here only [a, b] will get printed, and the ASCII value of b is 98 and the hashcode also a 98.
		
		data.add("c");
		System.out.println(data);//Here only [a, b, c] will get printed, and the ASCII value of c is 99 and the hashcode also a 99.
		
		data.add(97);
		System.out.println(data);//Here only [a, 97, b, c] will get printed, and the ASCII value of a is 97 and the hashcode also a 97 and the value is 97 
								//and its hashcode is also 97.
		
		data.add(98);
		System.out.println(data);//Here only [a, 97, b, 98, c] will get printed, and the ASCII value of b is 98 and the hashcode also a 98 and the value is 98 
								//and its hashcode is also 98.
		
		data.add('c');
		System.out.println(data);//Here only [a, 97, b, 98, c, c] will get printed, and the ASCII value of c is 99 and the hashcode also a 99 and the value is c 
								//character and its hashcode is also 99.
	}
}
