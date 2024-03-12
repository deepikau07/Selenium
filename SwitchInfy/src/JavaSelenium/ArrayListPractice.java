package JavaSelenium;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("DOG");
		a.add("Cat");
		a.add("Parrot");
		a.add("Rabbit");
		a.add("Squrrel");
		a.add("Human");
		
		
		for (String Val :a)
		{ 
			//System.out.println(Val);
			//System.out.println(a.contains("Human"));
			
			for (int i=0; i<a.size(); i++)
				
			{
				System.out.print(a.get(i));
			}
				
			
		}
			

	}

}
