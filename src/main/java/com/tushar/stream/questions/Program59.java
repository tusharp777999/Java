package com.tushar.stream.questions;

/*
* Using Stream API extract messages in the correct chronological order from the give log data in
* HH:MM:ID:Message
* I/P: List<String> logs = Arrays.asList(
*   "14:30:3:Server Started",
*   "14:30:1:User Logged In",
*   "14:29:2:Database Connected",
*   "18:32:4:User Logged Out"
* );
*
* O/P:  Database Connected
*       User Logged In
*       Server Started
*       User Logged Out
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program59 {
    public static void main(String[] args) {
        List<String> logs = Arrays.asList(
                "14:30:3:Server Started",
                "14:30:1:User Logged In",
                "14:29:2:Database Connected",
                "18:32:4:User Logged Out");

        List<String> result = logs.stream().sorted((str1, str2) -> {
            String[] section1 = str1.split(":");
            String[] section2 = str2.split(":");

            int hour1 = Integer.parseInt(section1[0]);
            int minute1 = Integer.parseInt(section1[1]);
            int id1 = Integer.parseInt(section1[2]);

            int hour2 = Integer.parseInt(section2[0]);
            int minute2 = Integer.parseInt(section2[1]);
            int id2 = Integer.parseInt(section2[2]);

            if(hour1 != hour2)
                return Integer.compare(hour1, hour2);
            if(minute1 != minute2)
                return Integer.compare(minute1, minute2);
            return Integer.compare(id1, id2);
        }).map(data -> data.split(":", 4)[3]).toList();

        System.out.println(result);

        List<String> result1 = logs.stream()
                .sorted(Comparator.comparing((String data) -> data.split(":")[0])
                        .thenComparing(data -> data.split(":")[1])
                        .thenComparing(data -> data.split(":")[2]))
                        .map(data -> data.split(":", 4)[3]).toList();
        System.out.println(result1);
    }
}
