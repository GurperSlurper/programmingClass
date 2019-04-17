package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jr8800 on 4/15/2019.
 */
public class Sections {
    private String sectionName;
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<String> stuUser = new ArrayList<>();

    Sections(String sectionName) {
        this.sectionName = sectionName;
    }

    String getSection() {
        String section = sectionName;
        return section;
    }

    void addStudent(String studentFName, String studentLName, String studentUser, long studentNum) {
        studentList.add(new Student(studentFName, studentLName, studentUser, studentNum));
        stuUser.add(studentUser);
    }

    boolean checkStuUser(String studentUser) {
        if (stuUser.contains(studentUser)) {
            return true;
        }
        return false;
    }

    void addAssignmentToStudent(String stuUser, String assignmentName, int pointsPossible) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                student.addAssignment(assignmentName, pointsPossible);
            }
        }
    }

    boolean getAssignmentExist(String stuUser, String assignmentName) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                boolean assignmentExist = student.checkAssignment(assignmentName);
                return assignmentExist;
            }
        }
        return false;
    }

    void addAssignmentToAll(String assignmentName, int pointsPossible) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            student.addAssignment(assignmentName, pointsPossible);
        }
    }

    boolean getAssignmentExistAll(String assignmentName) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            boolean assignmentExist = student.checkAssignment(assignmentName);

            if (assignmentExist == true) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    void setPointsEarned(String stuUser, String assignmentName, double pointsEarned) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                student.setPointsEarned(assignmentName, pointsEarned);
            }
        }
    }

    void markTardy(String stuUser) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                student.markTardy();
            }
        }
    }

    int getTardies(String stuUser) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                int tardies = student.getTardies();
                return tardies;
            }
        }
        return -1;
    }

    void markAbsent(String stuUser) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                student.markAbsent();
            }
        }
    }

    int getAbsences(String stuUser) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                int absences = student.getAbsences();
                return absences;
            }
        }
        return -1;
    }

    double getOverall(String stuUser) {
        for (int i = 0; studentList.size() > i; i++) {

            if (stuUser.equals(studentList.get(i).getStudent())) {
                Student student = studentList.get(i);
                //***DEBUG*** System.out.println(student.getStudent());
                double overallEarned = student.overallEarned();
                int overallPossible = student.overallPossible();
                double overall = overallEarned / overallPossible;
                return overall;
            }
        }
        return -1;
    }
}

