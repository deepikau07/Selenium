package JavaSelenium;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {

	public static void main(String[] args) {
		String s = "Mr Pratyush Das";
		
		String[] NewS = s.split(" ");
		
		System.out.println(NewS[0]);
		System.out.println(NewS[1]);
		System.out.println(NewS[2]);
		
		for (int i = s.length()-1;i>=0; i-- )
			
		{
			
			System.out.println(s.charAt(i));
		}
		
			}
		
	}


