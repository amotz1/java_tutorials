package gradeAveraging;

import java.util.Scanner;

public class gradeAveragingUsingArray {
	
	public static void main(String[] args) {
		int maxStudents = 30; 
		
		String[] students = new String[maxStudents];
		double[] grades = new double[maxStudents];
		Scanner in = new Scanner(System.in);
		
		String newStudent;
		int numStudents = 0;
		
		System.out.println("enter a student name {enter to stop the program}");
		
		do {
			
			newStudent = in.nextLine();
			
			if (!newStudent.equals("")) {
				students[numStudents] = newStudent;
				numStudents++;
				
			}
			
		}  while(!newStudent.equals(""));
		
		double sum = 0;
		for (int i = 0 ; i < numStudents ; i++) {
			System.out.println("grade for subject " + students[i] + " " + "is");
			
			double grade = in.nextDouble();
			grades[i] = grade;
			sum += grade;
		}
		
		for (int i = 0 ; i< numStudents ; i++ ) {
			System.out.println("("+ students[i] + ")" + ":"  +grades[i]);
			i++;
		}
		
		
		double avg = sum / numStudents;
		
		System.out.println("the average is " + avg);
				
			
		}
				
				
	}
	


