package c.casting;

public class Demo1 {

	public static void main(String[] args) {
		
		double x = 15.36;
		int a = (int)x; // casting - convert from double to int
		
		System.out.println(x); // 15.36
		System.out.println(a); // 15
		
		long n1 = 150; // 64 bit
		int n2 = (int)n1; // casting - convert from long to int
		short n3 = (short)n1; // casting - convert from long to short
		byte n4 = (byte)n1; // casting - convert from long to byte
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
	}

}
