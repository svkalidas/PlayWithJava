package com.ksv.codingChallenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student1{
   private int token;
   private String fname;
   private double cgpa;
   public Student1(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class StudentComparator1 implements Comparator<Student1> {
    
    public int compare(Student1 a, Student1 b) {
        if (a.getCgpa() == b.getCgpa()) {
            if (a.getFname().equals(b.getFname())) {
                return a.getToken() - b.getToken();
            } else {
                return a.getFname().compareTo(b.getFname());
            }
        } else {
            if (a.getCgpa() < b.getCgpa()) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

public class PriorityQueueTest1 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
        PriorityQueue<Student1> queue = new PriorityQueue<Student1>(totalEvents, new StudentComparator1());
      while(totalEvents>0){
         String event = in.next();
            
          if ("ENTER".equals(event)) {
              String fname = in.next();
              double cgpa = Double.parseDouble(in.next());
              int id = Integer.parseInt(in.next());
              queue.offer(new Student1(id, fname, cgpa));
          } else {
              queue.poll();
          }
           
         totalEvents--;
      }
        if (queue.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!queue.isEmpty()) {
                System.out.println(queue.poll().getFname());
            }
        }
    }
}
