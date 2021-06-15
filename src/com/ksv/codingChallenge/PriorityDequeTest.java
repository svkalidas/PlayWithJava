package com.ksv.codingChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityDequeTest {

	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}

class Student {

	private int id;

	private String name;

	private double cgpa;

	public Student(String name, double cgpa, int id) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

}

class StudentComparator implements Comparator<Student> {
    
	@Override
    public int compare(Student a, Student b) {
        if (a.getCgpa() == b.getCgpa()) {
            if (a.getName().equals(b.getName())) {
                return a.getId() - b.getId();
            } else {
                return a.getName().compareTo(b.getName());
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

class Priorities {

	public List<Student> getStudents(List<String> events) {
		PriorityQueue<Student> queue = new PriorityQueue<Student>(events.size(), new StudentComparator());
		List<Student> list =  new ArrayList<>();
		for (String data : events) {
			String[] details = data.split(" ");
			if ("ENTER".equals(details[0])) {
				queue.add(new Student(details[1].trim(), Double.parseDouble(details[2]), Integer.parseInt(details[3])));
			} else {
				queue.poll();
			}

		}
		while (!queue.isEmpty()) {
            list.add(queue.poll());
        }
		return list;
	}

	 public int compare(Student a, Student b) {
	        if (a.getCgpa() == b.getCgpa()) {
	            if (a.getName().equals(b.getName())) {
	                return a.getId() - b.getId();
	            } else {
	                return a.getName().compareTo(b.getName());
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