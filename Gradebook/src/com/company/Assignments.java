package com.company;

/**
 * Created by jr8800 on 4/15/2019.
 */
public class Assignments {
    private String assignmentName;
    private int pointsPossible;
    private double pointsEarned;

    Assignments(String assignmentName, int pointsPossible){
        this.assignmentName = assignmentName;
        this.pointsPossible = pointsPossible;
    }

    String getAssignmentName(){
        String assignment = assignmentName;
        return assignment;
    }

    void setPointsEarned(double pointsEarned){
        this.pointsEarned = pointsEarned;
    }

    double getPointsEarned(){
        return pointsEarned;
    }

    int getPointsPossible(){
        return pointsPossible;
    }
}
