package JavaSelenium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighestSecLowest {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(96,100,101,1,3,7);
		 Integer SL = list.stream().sorted().distinct().skip(1).findFirst().get();
		 
		 Integer SH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		 
		 System.out.println(SL);
		 System.out.println(SH);
	}

}
