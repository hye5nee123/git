package com.example.demo.person;

public class Four {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.getSalary(100, 500); // 보너스 100, 기본급 500
    }
}

// Employee 클래스 정의
class Employee {
    // Employee 클래스의 속성 및 메서드 정의
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

// Manager 클래스 정의
class Manager extends Employee {
    int bonus;

    public Manager() {
        super("Default Name", 0); // 기본 이름과 기본 급여 설정
    }

    void getSalary(int bonus, int salary) {
        this.bonus = bonus; // 보너스 설정
        System.out.println("Total Salary: " + (bonus + salary)); // 총 급여 출력
    }
}
