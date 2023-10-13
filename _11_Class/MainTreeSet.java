package _11_Class;

import java.util.Set;
import java.util.TreeSet;

class Student{
	private Integer id;
	private String name;
	private Double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getId() {
		return id;
	}
	public Student(Integer id, String name, Double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		return this.getId();
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.getSal() == ((Student)obj).getSal();
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

public class MainTreeSet {
	public static void main(String[] args) {
		System.out.println("Sort based on id");
		Set<Student> students1 = new TreeSet<Student>((s1,s2) -> s1.getId() - s2.getId());
		students1.add(new Student(103,"Sharath",405000.54));
		students1.add(new Student(104,"Sunil",45000.3));
		students1.add(new Student(102,"Shafak",55000.38));
		students1.add(new Student(101,"Sanjeev",25000.3));
		
		students1.forEach(System.out :: println);
		System.out.println();
		
		System.out.println("Sort based on Salary");
		Set<Student> students2 = new TreeSet<Student>((s1,s2) -> s1.getSal().compareTo(s2.getSal()));
		students2.addAll(students1);
		
		students2.forEach(System.out :: println);
	}
}
