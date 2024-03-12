package JavaSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfNums {


	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(9,3,7);
		 
		 Optional<Integer> optional = list.stream().reduce((a,b) -> a+b);
		 
		 System.out.println("Sum is: "+optional.get());
		
		}

	}

