package com.company;

public class University {
    // lab's list
    private Lab[] labs;
    //university's name
    private String name;
    // university's capacity
    private int capacity;
    // current university's size
    private int currentSize;

    /**
     * this is constructor
     * @param n name
     * @param nm num
     */
    public University(String n, int nm) {
        name = n;
        labs = new Lab[nm];
        currentSize = 0;
        capacity = nm;
    }

    /**
     * this is the method which enroll students
     * @param lb student
     */
    public void enrollLabs(Lab lb) {
        if (currentSize < capacity) {
            labs[currentSize] = lb;
            currentSize++;
        } else {
            System.out.println("university is full!!!"); }
    }

    /**
     * this will print our university's list
     */

    public void print() {
        System.out.println("name :" + getName());
        for ( int i=0 ; i<labs.length ; i++ ){
            if (labs[i] != null ){
                labs[i].print();
            }
        }
    }


    /**
     * this will get the list of labs
     * @return labs
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * this will set the list of labs
     * @param lab lab
     */
    public void setLabs(Lab[] lab) {
        labs = lab;
    }

    /**
     * this will get the name of masters
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * this will set the name of masters
     * @param names names
     */
    public void setName(String names) {
        name = names;
    }

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
