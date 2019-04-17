package com.company;

import sun.swing.SwingUtilities2;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by dbaker on 2/15/2019.
 */
public class Gradebook {
    //properties
    //list/array of sections

    ArrayList<Sections> sectionsList = new ArrayList<>();
    ArrayList<String> section = new ArrayList<>();
    String sectionName;

    //methods
    void displaySection(){
        System.out.println(sectionName);
    }

    boolean checkSection(String sectionName){
        if (section.contains(sectionName)){
            return true;
        }
        return false;
    }


    //sets the currently active section - needs to set the currently active section
    //to the section with the given sectionName.
    // Returns: true if it succeeds false if it fails(no section that matches that name).
    public boolean changeSection(String sectionName){
    for(int i = 0; section.size() >  i; i++) {

            if(sectionName.equals(section.get(i))){
                Sections sections = sectionsList.get(i);
                //***DEBUG*** System.out.println(sections.getSection());
                this.sectionName = sections.getSection();
                return true;
            }
        }
        return false;
    }

    //creates a new section if there are not already 6 sections
    // and sectionName is not already used , also need to set the currentSection to be the new section
    // Returns: true if it succeeds false if it fails.
    public boolean addSection(String sectionName){
        if (sectionsList.size() != 6) {
            boolean sectionExist = checkSection(sectionName);
            if (sectionExist == true){
                return false;
            }
            else if (sectionExist == false) {
                section.add(sectionName);
                sectionsList.add(new Sections(sectionName));
                this.sectionName = sectionName;
                return true;
            }
        }
        return false;
    }

    //Creates a new student and adds the student to the currently active section
    //returns: True if it succeeds, false if it fails(a student with the same username already exists or there are no sections)
    public boolean addStudent(String firstName, String lastName, String username, long phoneNumber){
        for(int i = 0; section.size() >  i; i++) {

            if(sectionName.equals(section.get(i))){

                Sections sections = sectionsList.get(i);
                boolean userExist = sections.checkStuUser(username);
                //***DEBUG*** System.out.println(sections.getSection());
                sections.addStudent(firstName, lastName, username, phoneNumber);
                if (userExist == true){
                    return false;
                }
                else if(userExist == false){
                    return true;
                }
            }
        }
        return false;
    }

    //returns overall score (total points earned for all assignments/ total points possible) as a percentage for specified student
    //returns -1 if the student was not found or if the student did not have any assignments assigned or there are no sections.
    public double getOverallScore(String username) {
        for(int i = 0; section.size() >  i; i++) {

            if (sectionName.equals(section.get(i))) {
                Sections sections = sectionsList.get(i);
                double overall = sections.getOverall(username);
                overall = overall * 100;
                return overall;
            }
        }
        return -1;
    }
    //returns overall score as a percentage for the current section - (the average of each students overall score.)
    //Each student should have the same weight even if they have different number of points possible
    //IE: get each student's overall score as a percentage and calculate the average percentage for the students .
    //do not count students with no assignments assigned in the average.
    //returns -1 if there were no assignments in the section or there are no sections.
    public double getOverallScoreAvg(){
        return -1; //FIXME
    }

    //creates a new assignment and adds it to the student specified by username.
    //Returns true if it succeeds and false if the student is not found or the student already has an assignment with the
    //same assignmentName or there are no sections
    public boolean addAssignmentToStudent(String username, String assignmentName, int pointsPossible){
        for(int i = 0; section.size() >  i; i++) {

            if(sectionName.equals(section.get(i))){
                Sections sections = sectionsList.get(i);
                boolean assignmentExist = sections.getAssignmentExist(username, assignmentName);
                //***DEBUG*** System.out.println(sections.getSection());
                if (assignmentExist == true){
                    return false;
                }
                if (assignmentExist == false) {
                    sections.addAssignmentToStudent(username, assignmentName, pointsPossible);
                    return true;
                }
            }
        }
        return false;
    }

    //checks to make sure no student already has an assignment with the same assignment name first
    //if there is no existing assignment it creates a new assignment and adds the assignment to all
    // the students in the current section.
    //returns: True if successful and false if at least one student has the same assignment name or there are no sections
    public boolean addAssignmentToSection(String assignmentName, int pointsPossible){
        for(int i = 0; section.size() >  i; i++) {

            if (sectionName.equals(section.get(i))) {
                Sections sections = sectionsList.get(i);
                boolean assignmentExist = sections.getAssignmentExistAll(assignmentName);
                //***DEBUG*** System.out.println(sections.getSection());
                if (assignmentExist == true){
                    return false;
                }
                if (assignmentExist == false) {
                    sections.addAssignmentToAll(assignmentName, pointsPossible);
                    return true;
                }
            }
        }
        return false;
    }

    //sets the pointsEarned property for the student specified in the current section for the assignment specified
    //returns: true if successful, false if the student is not found or the assignmentName is not found  or there are no sections.
    public boolean setScore(String username, String assignmentName, int pointsEarned){
        for(int i = 0; section.size() >  i; i++) {

            if(sectionName.equals(section.get(i))){
                Sections sections = sectionsList.get(i);
                sections.setPointsEarned(username, assignmentName, pointsEarned);
                return true;
            }
        }
        return false;
    }

    //returns score on assignment specified as a percentage for the specified student in the current section
    //returns -1 if the student was not found or the student did not have an assignment with the specified assignment name or there are no sections
    public double getAssignmentScorePercent(String username, String assignmentName){
        return -1;//FIXME
    }

    //returns the average score as a percentage for the current section.
    //only the student with the assignment assigned to them will be counted in the average.
    //returns -1 if no student had an assignment with the specified assignment name  or there are no sections
    public double getAssignmentScoreAvg(String assignmentName){
        return -1;//FIXME
    }

    //adds 1 to the specified student's tardy count.
    //returns: true if successful, false if the student was not found in the current section  or there are no sections
    public boolean markTardy(String username) {
        for(int i = 0; section.size() >  i; i++) {

            if (sectionName.equals(section.get(i))) {
                Sections sections = sectionsList.get(i);
                sections.markTardy(username);
                return true;
            }
        }
        return false;
    }

    //adds 1 to the specified student's absent count.
    //returns: true if successful, false if the student was not found in the current section  or there are no sections
    public boolean markAbsent(String username){
        for(int i = 0; section.size() >  i; i++) {

            if (sectionName.equals(section.get(i))) {
                Sections sections = sectionsList.get(i);
                sections.markAbsent(username);
                return true;
            }
        }
        return false;
    }

    //returns the student tardy count for the specified student, it returns -1 if the student was not found  or there are no sections
    public int getTardyCount(String username){
        for(int i = 0; section.size() >  i; i++) {

            if (sectionName.equals(section.get(i))) {
                Sections sections = sectionsList.get(i);
                int tardies = sections.getTardies(username);
                return tardies;
            }
        }
        return -1;
    }

    //returns the student tardy count for the specified student, it returns -1 if the student was not found  or there are no sections
    public int getAbsentCount(String username){
        for(int i = 0; section.size() >  i; i++) {

            if (sectionName.equals(section.get(i))) {
                Sections sections = sectionsList.get(i);
                int absences = sections.getAbsences(username);
                return absences;
            }
        }
        return -1;
    }


}
