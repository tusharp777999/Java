package com.tushar.stream.utility;

public class Employee3 {
    private String name;
    private String department;

    public Employee3(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee3{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

}
