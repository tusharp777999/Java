package com.tushar.staticmethods;

public class Program2Implements implements InterfStatic {
    public static void main(String[] args) {
        //m1(); //You can't direct call.
        Program2Implements program2Implements = new Program2Implements();
        //program2Implements.m1(); //You can't call directly using the object reference.

        //Program2Implements.m1() //You can't call directly using implemented class name.

        InterfStatic.m1(); //You can only call using the Interface name only.
    }
}
