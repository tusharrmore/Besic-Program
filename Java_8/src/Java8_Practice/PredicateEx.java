package Java8_Practice;

import java.util.Arrays;
import java.util.List;

public class PredicateEx {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Even No: " + t));

	}

}
