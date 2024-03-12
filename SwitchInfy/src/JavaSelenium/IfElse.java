package JavaSelenium;

import java.util.ArrayList;

public class IfElse {

	public static void main(String[] args) {
		// If Else
		//int[] r2 = {1,4,5,6,8,9,10,14,15,18};
		//for (int i=0; i<r2.length; i++)
		{
			//if (r2[i] % 2 == 0)
			{
				//System.out.println(r2[i]);
			
				{
				//ArrayList
				ArrayList<String> a = new ArrayList<String>();
				a.add("DEE");
				a.add("PI");
				a.add("KA");
				
				//System.out.println(a.get(0));
				
				for (int j=0; j<a.size(); j++)
				{
					System.out.println(a.get(j));
				
					System.out.println("********************");
					
					
					for (String Val :a)
					{
						System.out.println(Val);
					}
					System.out.println(a.contains("DEE"));
				}
				}
			}
		}

	}

}
