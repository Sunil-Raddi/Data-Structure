package _12_Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStream {
	public static void main(String[] args) {
		List<Integer> al1 = Arrays.asList(23,15,6,29,13,75);
		List<Integer> al2 = Arrays.asList(23,15,6,29,13,75);
		List<Integer> al3 = Arrays.asList(23,15,6,29,13,75);
		List<Integer> al4 = Arrays.asList(23,15,6,29,13,75);
		
		System.out.println(al1);
//		al.forEach(System.out::println);
		// First Way - By using set method.
		for(int i=0; i<al1.size(); i++) {
			al1.set(i,al1.get(i)+10);
		}
		
		System.out.println(al1);
		System.out.println("_______________________________________________________________");
		
		// Second method - By using another list and assigning back.
		List<Integer> temp=new ArrayList<Integer>();;
		
		for(Integer i : al2) {
			temp.add(i+10);
		}
		al2 = temp;
		System.out.println(al2);
		
		System.out.println("_______________________________________________________________");
		
		// Using Functional Interface and Stream API.
		//USing Ananomus class.
		Function<Integer, Integer> maps1 = new Function<Integer, Integer>(){
			@Override
			public Integer apply(Integer i) {
				return i+10;
			}
		};
		
		//USing Lamda Expression
		Function<Integer, Integer> maps2 = i -> i+10;
		
		Stream<Integer> s1 = al3.stream(); // Creating the stream object to process the collection
		Stream<Integer> s2 = s1.map(maps1);
//		Stream<Integer> s2 = s1.map(t -> t+10);		
		al3 = s2.collect(Collectors.toList());
		
		System.out.println(al3);
		
		System.out.println("_______________________________________________________________");

		al4 = al4.stream().map(t -> t+10).collect(Collectors.toList());
	}
}
