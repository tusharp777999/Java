package com.tushar.stream.utility;

import java.util.ArrayList;
import java.util.List;

public class Utility {
    public static List<String> getVegetables() {
        List<String> list = new ArrayList<>();
        list.add("Cabbage");
        list.add("Chilly");
        list.add("Lady Finger");
        list.add("Tomato");
        list.add("Potato");
        list.add("Carrot");
        list.add("Raddish");
        list.add("Mint");
        list.add("Mushroom");
        return list;
    }

    public static List<Integer> getIntegers() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(25);
        list.add(15);
        return list;
    }

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Sam", "sam@gmail.com"));
        list.add(new Employee("Ram", "ram@yahoo.com"));
        list.add(new Employee("Jam", "jam@gmail.com"));
        list.add(new Employee("Pam", "pam@yahoo.com"));
        return list;
    }

    public static List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Max", 18));
        list.add(new Person("Peter", 23));
        list.add(new Person("Pamela", 24));
        list.add(new Person("David", 28));
        list.add(new Person("Dan", 30));
        list.add(new Person("Van", 32));
        list.add(new Person("Man", 50));
        list.add(new Person("Can", 45));
        return list;
    }

    public static List<Person1> getPersons1() {
        List<Person1> list = new ArrayList<>();
        list.add(new Person1("Max", "Mumbai", 18));
        list.add(new Person1("Peter", "Panvel", 23));
        list.add(new Person1("Pamela", "Panvel", 24));
        list.add(new Person1("David", "Dadar", 28));
        list.add(new Person1("Dan", "Dombivali", 30));
        return list;
    }

    public static List<Product> getProducts() {
        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "Lifeboy", 20, "Soap"));
        list.add(new Product(2, "Portronics", 200, "Adaptor"));
        list.add(new Product(3, "SurfExcel", 90, "Washing Powder"));
        list.add(new Product(4, "Yamaha", 8000, "Guitar"));
        list.add(new Product(5, "Honda", 5000, "Mirror"));
        return list;
    }

    public static List<Employee1> getEmployees1() {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1("Anil", "anil@gmail.com", 24, "M"));
        list.add(new Employee1("Bob", "bob@yahoo.com", 35, "M"));
        list.add(new Employee1("Cindy", "cindy@yahoo.com", 33, "F"));
        list.add(new Employee1("Diana", "diana@gmail.com", 45, "F"));
        return list;
    }

    public static List<Employee2> getEmployees2() {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Bob", 10000.0));
        list.add(new Employee2("Maddy", 15000.0));
        list.add(new Employee2("Linda", 21000));
        list.add(new Employee2("Macho", 40000));
        list.add(new Employee2("Sam", 8000.0));
        list.add(new Employee2("Dolla", 5000.0));
        return list;
    }

    public static List<Person2> getPerson2() {
        List<Person2> list = new ArrayList<>();
        list.add(new Person2("Bob", "Mathew"));
        list.add(new Person2("Bob", "Aderson"));
        list.add(new Person2("Linda", "Commet"));
        list.add(new Person2("Macho", "Sumeat"));
        return list;
    }

    public static List<Employee3> getEmployees3() {
        List<Employee3> list = new ArrayList<>();
        list.add(new Employee3("Alice", "HR"));
        list.add(new Employee3("Bob", "IT"));
        list.add(new Employee3("Charlie", "IT"));
        list.add(new Employee3("David", "Finance"));
        list.add(new Employee3("Eve", "IT"));
        list.add(new Employee3("Frank", "HR"));
        list.add(new Employee3("Grace", "Finance"));
        list.add(new Employee3("Hannah", "IT"));
        return list;
    }

    public static List<Employee4> getEmployees4() {
        List<Employee4> list = new ArrayList<>();
        list.add(new Employee4("Alice", "HR", 50000));
        list.add(new Employee4("Bob", "IT", 70000));
        list.add(new Employee4("Charlie", "IT", 80000));
        list.add(new Employee4("David", "Finance", 60000));
        list.add(new Employee4("Eve", "IT", 75000));
        list.add(new Employee4("Frank", "HR", 55000));
        list.add(new Employee4("Grace", "Finance", 65000));
        list.add(new Employee4("Hannah", "IT", 72000));
        return list;
    }

}
