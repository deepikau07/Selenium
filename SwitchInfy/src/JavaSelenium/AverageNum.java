package JavaSelenium;

import java.util.Arrays;
import java.util.List;

public class AverageNum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4);
		double d = list.stream().mapToInt(e -> e).average().getAsDouble();
		System.out.println("Average is "+d);

	}

}
