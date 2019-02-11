package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student("Jeff", 5, 10);
        student.printGrade();
        student.SetParticipation(20);
        student.printGrade();
        student.SetContentGrade(20);
        student.printGrade();
        student.SetWorkHabitGrade(8);
        student.printGrade();
    }
}
