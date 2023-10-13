package _13_Class;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterStream {
	public static void main(String[] args) {
		String inputString = "Hello, World!";

		// Using Java streams to calculate character frequency
		Map<Character, Long> characterFrequencyMap = inputString.chars()
				.mapToObj(c -> (char) c)
				.filter(Character::isLetterOrDigit)  // Optionally, you can filter for specific characters
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(characterFrequencyMap);
	}
}
