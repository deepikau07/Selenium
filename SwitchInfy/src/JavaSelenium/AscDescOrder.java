package JavaSelenium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AscDescOrder {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,3,7,22,21,44,44,9,66,100);
		List<Integer> asc = list.stream().sorted().collect(Collectors.toList());
		System.out.println(asc);
		
		List<Integer> desc = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(desc);

	}

}
