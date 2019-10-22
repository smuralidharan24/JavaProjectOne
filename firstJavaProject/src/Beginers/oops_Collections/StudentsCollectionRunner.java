package Beginers.oops_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(15, "Murali"), new Student(2, "Ranga"), new Student(3, "Test"));
		ArrayList<Student> studentsAl = new ArrayList<>(students);

		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
	}

}
