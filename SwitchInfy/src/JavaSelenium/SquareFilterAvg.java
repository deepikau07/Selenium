package JavaSelenium;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAvg {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(9,3,1);
		 double d = list.stream().map(e->e*e).mapToInt(e->e).average().getAsDouble();
		 System.out.println(d);

	}

}
