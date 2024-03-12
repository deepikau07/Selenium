package JavaSelenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StreamsLambda {

	public static void main(String[] args) {
		StreamsLambda var=new StreamsLambda();
		var.streamCollect();
		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Baby");
		names1.add("Toto");
		names1.add("Totia");
		names1.add("Tatali");
		names1.add("Tutuli");
		names1.add("Tutila");
		
		Long c=names1.stream().filter(s->s.startsWith("T")).count();
		System.out.println(c);
		names1.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		//print names ending with and in upper case
		Stream.of("Totia","Tatali","Tutila").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//converted List to Arraylist
		List<String> names2= Arrays.asList("Ram","Sita","Hanuman");
		//merge both Arraylists
		Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
		//to check any value present in list(return true/false)
		boolean flag =	newStream.anyMatch(s->s.equalsIgnoreCase("Ram"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	@Test
			public void streamCollect()
			
	{	
		List<String> ls=	Stream.of("Totia","Tatali","Tutila").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		//get the 1st element
		System.out.println(ls.get(0));
		//get unique number
		List<Integer> number = Arrays.asList(1,2,2,2,2,3,4,4,5,6,7,8,8,9);
		number.stream().distinct().forEach(s->System.out.println(s));
		
		List<Integer> Li = number.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(Li.get(2));
	}
		

}
