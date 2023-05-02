package a;

// use [ctrl + shift + o] to organize imports
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		// a List is a collection of objects (like array)
		List<String> myList = new ArrayList<>();
		myList.add("aaa");
		myList.add("bbb");
		myList.add("ccc");
		
		System.out.println("list size: " + myList.size());
		System.out.println("list content: " + myList);

	}

}
