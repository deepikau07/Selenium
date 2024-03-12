package JavaSelenium;

public class MethodsDemo1 {
	public int add(int x, int y) {
		int s = x + y;
		System.out.println("Addition of the two numbrs are:");
		return s;

	}

	public static void main(String[] args) {
		MethodsDemo1 b = new MethodsDemo1();
		int sum=b.add(5, 6);
		System.out.println(sum);
	}

}
