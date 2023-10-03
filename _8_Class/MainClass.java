package _8_Class;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		HashSet<Student> stds = new HashSet<Student>();
		while(true) {

			System.out.println("Enter the student details: ");
			System.out.print("Id: ");
			int id = s.nextInt();
			System.out.print("Name: ");
			String name = s.next();
			System.out.print("Percentage: ");
			double per = s.nextDouble();

			Student std = new Student(id, name, per);
			boolean rs = stds.add(std);
			if(rs)
				System.out.println("Student details added Successfully.\n");
			else 
				System.err.println("Student details fail to add.\n");

			System.out.println("Do you want to add another student, (yes or no)");
			String res = s.next();
			if(res.equalsIgnoreCase("no"))
				break;
		}
		
		System.out.println("Press 1: Sort based on Id \n      2: Sort based on Name \n      3: Sort based on Percentage");
		Comparator<Student> comp = null;
		int choice  = s.nextInt();
		switch(choice) {
		case 1: comp = new sortById();
				System.out.println("Sorted based on Id");
				break;
				
		case 2: class sortByName implements Comparator<Student> {
					@Override
					public int compare(Student s1, Student s2) {
						return s1.getName().compareTo(s2.getName());
					}
				}
				comp = new sortByName();
				System.out.println("Sorted based on Name");
				break;
				
		case 3: comp = new Comparator<Student>() {
					@Override
					public int compare(Student s1, Student s2) {
						if(((Double)s1.getPer()).compareTo((Double)s2.getPer()) > 0)
							return 1;
						else 
							return -1;
					}
				};
				System.out.println("Sorted based on Percentage");
				break;
		}
		
		TreeSet<Student> ts = new TreeSet<Student>(comp);
		ts.addAll(stds);
		
		for(Student std : ts) {
			System.out.println(std);
		}
	}

}
