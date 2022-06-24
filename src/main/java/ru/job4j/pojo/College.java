package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("John John Doe");
        student.setGroup("JJ-11");
        student.setStartDate(LocalDate.of(2021, 9, 1));
        System.out.println("Full name: " + student.getFullName());
        System.out.println("Group: " + student.getGroup());
        System.out.println("Start date: " + student.getStartDate());
    }
}
