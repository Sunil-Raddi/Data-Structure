package _11_Class;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortStudent {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sunil","Shankarnag","Sugunama","Sujani","Hemanth","Maharaj");
		
		Comparator<String> com = (v1, v2) -> {
			return v1.length() - (v2.length());
		};
		
		Collections.sort(names, com);
		
		System.out.println(names);
	}
}
