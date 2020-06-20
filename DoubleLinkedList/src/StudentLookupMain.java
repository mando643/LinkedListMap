import java.io.File;
import java.util.Scanner;

public class StudentLookupMain {
	public static void main(String[] args) {
		StudentLinkedListMap students = new StudentLinkedListMap();
		
		// Read in file
		try {
			Scanner fileIn = new Scanner(new File("Students.txt"));
			String firstName;
			String lastName;
			String birthday;
			String major;
			double gpa;
			
			while(fileIn.hasNext()) {
				firstName = fileIn.next();
				lastName = fileIn.next();
				birthday = fileIn.next();
				major = fileIn.next();
				gpa = fileIn.nextDouble();
				
				students.addLast(new Student(firstName, lastName, birthday, major, gpa));
			}
			
			fileIn.close();
		
		} catch (Exception ex) {
			System.out.println("Error reading file");
			return;
		}
		
		System.out.println("Read in file!");
		
		students.remove("Sarah");
		
		System.out.println("The first student is: " + students.getStudentAtIndex(0).getFirstName());
		System.out.println("The student at index 4 is: " + students.getStudentAtIndex(4).getFirstName());
		
		// Search through list for a student
		
		
		
		System.out.println();
		System.out.print("Enter a first name: ");
		Scanner kbd = new Scanner(System.in);
		String searchName = kbd.next();
		kbd.close();
		
		// Look for searchName in students
		Student foundStudent = students.find(searchName);
		
		if (foundStudent == null) {
			System.out.println("Did not find student with name: " + searchName);
		} else {
			System.out.println("Student " + foundStudent.getFullName() + " has GPA " + foundStudent.getGpa());
		}

	}
}