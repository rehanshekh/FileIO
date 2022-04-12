package com.blz;

public class EmpPayrollData {
    int id;
    String name;
    double salary;
    public EmpPayrollData(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    @Override
    public String toString() {
        return "EmpPayrollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
