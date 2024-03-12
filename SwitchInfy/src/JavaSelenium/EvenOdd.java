package JavaSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(9,3,7,22,21,44,66);
		 List<Integer> list2 = list.stream().filter(e->e%2==1).collect(Collectors.toList());
		 System.out.println(list2);

	}

}
