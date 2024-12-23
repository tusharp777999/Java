package com.tushar.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMapDemo {
	public static void main(String[] args) {
		 List<String> cricketPlayerNames = new ArrayList<String>();
		 cricketPlayerNames.add("Rahul");
		 cricketPlayerNames.add("Sachin");
		 cricketPlayerNames.add("Hardik");
		 cricketPlayerNames.add("Dhoni");
		 
		 Map<String, Integer> namesMap = cricketPlayerNames.stream()
		                   .collect(Collectors.toMap(cricketPlayerName -> cricketPlayerName, cricketPlayerName -> cricketPlayerName.length()));
		 System.out.println(namesMap);
	}
}
