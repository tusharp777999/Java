package com.tushar.stream.questions;

import java.util.Optional;

/*
 * Write a program from Command Line Arguments you may or may not get the arguments based on this you have to write a code which simply prints the "Hello World"
 * with the provided data from Command Lind Arguments otherwise just "Hello World" use the Optional class only to validate the null.
 */

public class Program75 {
    static void main(String[] args) {
        System.out.println("Hello World " +
                Optional.ofNullable(args.length > 0 ? args[0] : null)
                        .orElse("Tushar"));
    }
}
