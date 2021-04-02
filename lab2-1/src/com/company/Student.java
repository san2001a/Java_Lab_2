package com.company;


/**
 * this is a class to share student's info
 * @author Sana
 * @version 1
 */

public class Student {

    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    //the grade
    private int grade;

    /**
     * this is constructor
     * Create a new student with a given name and ID number.
     * @param fName first name of student
     * @param lName last name of student
     * @param stdID student ID
     */
    public Student(String fName, String lName, String stdID ){
        firstName = fName;
        lastName = lName;
        id = stdID;
        grade = 0 ;
    }

    /**
     * this will get the first name of student
     * @return firstname
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * this will set the first name of a student
     * @param tmpFirstName first name
     */
    public void setFirstName(String tmpFirstName) {
        firstName = tmpFirstName;
    }

    /**
     * this will get the last name of student
     * @return lastname
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * this will set the last name of a student
     * @param tmpLastName last name
     */
    public void setLastName(String tmpLastName) {
        lastName = tmpLastName;
    }

    /**
     * this will get the ID of student
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * this will set the ID of a student
     * @param tmpID ID
     */
    public void setId(String tmpID) {
        id = tmpID;
    }

    /**
     * this will get the grade of student
     * @return Grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * this will set the ID of a student
     * @param tmpGrade Grade
     */
    public void setGrade(int tmpGrade) {
        grade = tmpGrade;
    }

    /**
     * this will print student's info
     */
    public void print() {
        System.out.println("first name: " +firstName+ ", last name: "+ lastName+ ", student ID: "+ id + ", grade: " + grade);
    }


}



