package gradeAveraging;
import java.util.Scanner;
import java.util.ArrayList;

public class Averager {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<>();
		ArrayList<Double> grades= new ArrayList<>();
		Scanner in  = new Scanner(System.in);
		String newStudent;
		double sum = 0;

		
		System.out.println("enter a student name");
		
		do {
		   newStudent = in.nextLine();
		   
		   if(!newStudent.equals("")) {
			   students.add(newStudent);
		 
		   }
		   
		} while (!newStudent.equals(""));
		
		for (String student : students) {
			System.out.println("grade for " + student + ":");
			double grade = in.nextDouble();
			grades.add(grade);
		}
		
		System.out.println("\nclasses");
		
		for (int i = 0 ; i<students.size() ; i++) {
			System.out.println(students.get(i) + "(" +grades.get(i) + ")");
			sum += grades.get(i);
		}
		
		double avg = sum / students.size();
		System.out.println("average grade " + avg);
		
	}
				
	
}
