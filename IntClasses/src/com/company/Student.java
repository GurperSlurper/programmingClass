package com.company;

public class Student {
    private int studentID;
    private String name;
    private double contentGrade;
    private double workHabitGrade;
    private double participation;
    private int age;

    public Student(String name, int studentID, int age){
        this.age = age;
        this.studentID = studentID;
        this.name = name;
    }

    public Student(){
        name = "TestStudent";
        studentID = -1;
        contentGrade = 0;
        workHabitGrade = 0;
        participation = 0;
        age = 18;
    }

    public void SetContentGrade(int grade){
        contentGrade = grade;
    }

    public void SetWorkHabitGrade(int grade){
        workHabitGrade = grade;
    }

    public void SetParticipation(int grade){
        participation = grade;
    }

    public double GetGrade(){
        double overall = workHabitGrade*.35 + contentGrade*.4 + participation*.25;
        return overall;
    }

    public void printGrade(){
        System.out.println(GetGrade());
    }
}
