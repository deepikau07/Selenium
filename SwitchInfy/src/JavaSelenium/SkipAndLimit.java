package JavaSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipAndLimit {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,3,7,22,21,44,44,9,66,100);
		List<Integer> skip = list.stream().skip(7).collect(Collectors.toList());
		List<Integer> limit = list.stream().limit(7).collect(Collectors.toList());
		Integer r = list.stream().limit(5).reduce((a,b)-> a*b).get();
		System.out.println(limit);
		System.out.println(skip);
		System.out.println(r);

	}

}
