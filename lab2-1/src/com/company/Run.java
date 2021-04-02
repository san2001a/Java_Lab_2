package com.company;

public class Run {
    public static void main(String[] args) {
        System.out.println("Student Class: ");
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        //std1.print();
        std1.setGrade(15);
        std1.print();
        //std2.print();
        std2.setGrade(20);
        std2.print();
       // std3.print();
        std3.setFirstName("HamidReza");
        std3.print();


        System.out.println();
        System.out.println("Lab Class: ");
        Lab lab1 = new Lab(10, "3 Esfand");
        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);
        lab1.enrollStudent(std3);
        lab1.print();


        System.out.println();
        System.out.println("University Class: ");
        University uni = new University("Fakhri", 2 );
        uni.enrollLabs(lab1);
        lab1.setDay("Sat");
        uni.print();



















        //    public void print() {
//        for (int i = 0; i < students.size(); i++) {
//                 if ( students[i].getFirstName() != null && students[i].getId()!= null && students[i].getGrade()!= null)
//            System.out.println("std fname: " + students[i].getFirstName() k + " std id:" + students[i].getId()
//                    j + " std grade:"+ students[i].getGrade());
//        }    ￼
//        System.out.println("Lab AVG:" + avg);
//    }



    }
}