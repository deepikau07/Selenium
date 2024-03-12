package JavaSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithTwo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,3,7,22,21,44,66);
		List<String> list2 = list.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).collect(Collectors.toList());
		System.out.println(list2);

	}

}
