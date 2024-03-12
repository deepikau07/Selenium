package JavaSelenium;

import java.util.Arrays;
import java.util.List;

public class Practice2 {

	public static void main(String[] args) {
		String[] Ar = {"DeE", "PI","Ka"};
		List<String> NewAr = Arrays.asList(Ar);
		//System.out.print(NewAr.contains("Ka"));
		
		String s = "Deepika Rani Upadhyaya";
		
		String[] NewS = s.split(" ");
		System.out.println(NewS[0]);
		System.out.println(NewS[1]);
		System.out.println(NewS[2]);
		
		for (int i=s.length()-1; i>=0; i--)
			
		{
			System.out.print(s.charAt(i));
			}

	}

}
