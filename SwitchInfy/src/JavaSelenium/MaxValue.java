package JavaSelenium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;import org.apache.commons.io.comparator.ComparatorAbstractTest;

public class MaxValue {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(9,3,7,22,21,44,44,9,66,100);
		Integer max = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		Integer min = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);

	}

}
