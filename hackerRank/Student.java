package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {


	int id;
	String fName;
	double cgpa;
	
	static Scanner scan = new Scanner(System.in);
	
	public Student(int id, String fName, double cgpa){
		super();
		this.id = id;
		this.fName = fName;
		this.cgpa = cgpa;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getFName() {
		return fName;
	}
	
	public double getCgpa() {
		return cgpa;
	}

	public static void main(String[] args) {
		
		System.out.println("Cuantos estudiantes");
		int tc = scan.nextInt();
		
		int tf = 6;
		System.out.println();
		
		ArrayList<Student> sL = new ArrayList<Student>();
		
		for(int i = 0; i < tc; i++ ) {
			
		System.out.println("Enter ID");
		int id = scan.nextInt();
		
		System.out.println("Enter First Name");
		String fName = scan.next();
		
		System.out.println("Enter GPA");
		double cgpa = scan.nextDouble();
		
		
		Student student = new Student(id, fName, cgpa);
		 System.out.println("Student ID: " + student.id + " | " + " Student Name: " + student.fName + " | " + " Student GPA: " + student.cgpa);
		 System.out.println();
		 
		 sL.add(student);
		 
		 
		}
		
	//	Collections.sort(sL, Comparator.comparing(Student::getCgpa).reversed().thenComparing() );
		
		for(Student stud: sL) {
			System.out.println(stud.id + " | " + stud.fName + " | " + stud.cgpa);
			
		}
	}


}
