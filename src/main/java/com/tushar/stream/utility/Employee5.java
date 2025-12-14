package com.tushar.stream.utility;

public class Employee5 {
    private int id;
    private String name;

    public Employee5(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
