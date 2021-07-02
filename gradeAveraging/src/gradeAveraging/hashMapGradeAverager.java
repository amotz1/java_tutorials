package gradeAveraging;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class hashMapGradeAverager {

	public static void main(String[] args) {
		HashMap<String, Double> students = new HashMap<>();
		Scanner in = new Scanner(System.in);
		String newStudent;
		int numStudents;
		double grade;
		double sum = 0;
		
		System.out.println("enter a student press enter to finish");
		
		do {
			
			System.out.println("enter a student:");
			newStudent = in.nextLine();
			
			if (!newStudent.equals("")) {
			System.out.println("enter a grade:");
			grade = in.nextDouble();

			students.put(newStudent,grade);
            in.nextLine();
            
			}
		} while (!newStudent.equals(""));
		
		for (Map.Entry<String, Double> student: students.entrySet()) {
			System.out.println("(" + student.getKey() + ")" + student.getValue() + ")");
			sum += student.getValue();
		}
		
		System.out.println("the average is: " + sum /  students.size());
		
		
		
	}

}
