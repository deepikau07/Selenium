package JavaSelenium;

public class CoreJava {

	public static void main(String[] args) {
		int[] r1 = new int[5];
		r1[0]=1;
		r1[1]=2;
		r1[2]=5;
		r1[3]=7;
		r1[4]=19;
	
		for(int i=0; i<r1.length; i++)
		{
			System.out.print(r1[i]+",");
		}
		
		String[] s = {"Deepika", "Pratysh","Mummy","Toto","Pua"};
		for (int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
			
		}
	}

}
