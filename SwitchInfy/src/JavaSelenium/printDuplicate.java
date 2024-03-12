package JavaSelenium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class printDuplicate {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(9,3,7,22,21,44,44,9,66);
		 Set<Integer> collect = list.stream().filter(e-> Collections.frequency(list, e)>1).collect(Collectors.toSet());
		 System.out.println(collect);

	}

}
