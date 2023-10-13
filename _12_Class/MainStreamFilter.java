package _12_Class;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainStreamFilter {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(20,30,65,29,67,48);
		System.out.println(al);
		List<Integer> even = al.stream().filter(t -> t%2==0).collect(Collectors.toList());
		List<Integer> odd = al.stream().filter(t -> t%2!=0).collect(Collectors.toList());
		System.out.println(even);
		System.out.println(odd);	
	}
}
