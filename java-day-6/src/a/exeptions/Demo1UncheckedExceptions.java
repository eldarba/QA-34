package a.exeptions;

public class Demo1UncheckedExceptions {

	public static void main(String[] args) {
		
		// Examples for unchecked exceptions
		// Wrong use of API
		
		String s = "aaa";
		System.out.println(s.length());
		s = null;
		System.out.println(s.length());
		
		
		int[] arr = new int[10];
		arr[100] = 3;
		
		int x = 4/0;
		
		
		

	}

}
