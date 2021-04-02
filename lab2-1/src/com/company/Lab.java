package com.company;

public class Lab {

    // student's list
    private Student[] students;
    // student's average
    private int avg;
    // lab's day
    private String day;
    // lab's capacity
    private int capacity;
    // current lab's size
    private int currentSize;

    /**
     * this is constructor
     * @param cap lab's capacity
     * @param d lab's date
     */
    public Lab(int cap, String d) {
    capacity = cap;
    day = d;
    currentSize = 0 ;
    avg = 0 ;
    students = new Student[cap] ;
    }

    /**
     * this is the method which enroll students
     * @param std student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!"); }
        calculateAvg();
    }

    /**
     * this will print our lab's list
     */
    public void print() {
        for ( int i=0 ; i<currentSize ; i++ ){
            students[i].print();
        }
        System.out.println("Average : " + calculateAvg());
    }


    /**
     * this will get the list of student
     * @return students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * this will set the list of students
     * @param student student
     */
    public void setStudents(Student[] student) {
        students = student;
    }

    /**
     * this will get the average
     * @return avg
     */
    public int getAvg(){
        return avg;
    }

    /**
     * this will calculate the average
     */
    public double calculateAvg() {
        double sum = 0;
        double average;
        for ( int i=0 ; i<currentSize ; i++){
            sum = sum + students[i].getGrade();
        }
        average = sum/currentSize ;
        return average;
    }

    /**
     * this will get lab's day
     * @return day
     */
    public String getDay() {
        return day;
    }

    /**
     * this will set the lab's day
     * @param date day
     */
    public void setDay(String date) {
        day = date ;
    }

    /**
     * this will get capacity
     * @return capacity
     */
    public int getCapacity() {
        return capacity ;
    }

    /**
     * this will set the capacity
     * @param cap capacity
     */
    public void setCapacity(int cap) {
        capacity = cap ;
    }

}