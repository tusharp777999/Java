package com.tushar.stream.questions;

/*
* Given a string you have to find the given string is palindrome or not without using any reverse method or reverse mechanism.
* I/P: String str = "madam";
* O/P: Palindrome
*/

public class Program72 {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}

