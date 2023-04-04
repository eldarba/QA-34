package b.concat;

public class Demo1 {

	public static void main(String[] args) {
		
		String str1 = "There will be ";
		int visitors = 5;
		String str2 = " people for dinner.";
		
		String msg = str1 + visitors + str2;
		System.out.println(msg);
		
		System.out.println(str1 + visitors + str2);
		System.out.println(str1 + (visitors + 2) + str2);

	} 

}
