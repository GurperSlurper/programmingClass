package com.company;

import sun.org.mozilla.javascript.internal.ast.Assignment;

import java.util.ArrayList;

/**
 * Created by jr8800 on 4/15/2019.
 */
public class Student {
    private String studentFName;
    private String studentLName;
    private String studentUser;
    private long studentNum;
    private int absences;
    private int tardies;
    private ArrayList<Assignments> assignmentsList = new ArrayList<>();
    private ArrayList<String> assignments = new ArrayList<>();
    private double overallEarned = 0;
    private int overallPossible = 0;

    Student(String studentFName, String studentLName, String studentUser, long studentNum){
        this.studentFName = studentFName;
        this.studentLName = studentLName;
        this.studentNum = studentNum;
        this.studentUser = studentUser;
    }

    public String getStudent(){
        String student = studentUser;
        return student;
    }

    boolean checkAssignment(String assignmentName){
        if(assignments.contains(assignmentName)){
            return true;
        }
        return false;
    }

    void addAssignment(String assignmentName, int pointsPossible){
        assignmentsList.add(new Assignments(assignmentName, pointsPossible));
        assignments.add(assignmentName);
    }

    void setPointsEarned(String assignmentName, double pointsEarned){
        for(int i = 0; assignmentsList.size() >  i; i++) {

            if(assignmentName.equals(assignmentsList.get(i).getAssignmentName())){
                Assignments assignments = assignmentsList.get(i);
                assignments.setPointsEarned(pointsEarned);
            }
        }
    }

    void markTardy(){
        tardies++;
    }

    int getTardies(){
        return tardies;
    }

    void markAbsent(){
        absences++;
    }

    int getAbsences(){
        return absences;
    }

    double overallEarned(){
        for (int i = 0; i < assignmentsList.size(); i++){
            Assignments assignments = assignmentsList.get(i);
            double overall = assignments.getPointsEarned();
            overallEarned = overall + overallEarned;
        }
        return overallEarned;
    }

    int overallPossible(){
        for (int i = 0; i < assignmentsList.size(); i++){
            Assignments assignments = assignmentsList.get(i);
            int overall = assignments.getPointsPossible();
            overallPossible = overall + overallPossible;
        }
        return overallPossible;
    }
}
