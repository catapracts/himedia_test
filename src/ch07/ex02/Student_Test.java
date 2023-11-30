package ch07.ex02;

import java.util.ArrayList;
import java.util.List;

public class Student_Test {

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		Student s2 = new Student("AAA");
		Student s3 = new Student(1111);
		Student s4 = new Student("BBB","place1");
		Student s5 = new Student("CCC","Place2",1111);
		
		List<Student> aList = new ArrayList<>();
		aList.add(s1); aList.add(s2); aList.add(s3); aList.add(s4); aList.add(s5);
		
		System.out.println("===============================");
		
		int arr[] = new int[] {1,2,1,3,3,3,4,5,5};
		Method m = new Method();
		m.arrayListOut(aList);
		m.arrayOutput(arr, 4);
		m.nameAddr(aList);
		
		System.out.println("===============================");
		
		aList.add(new Student("DDD", 99,99,9));
		aList.add(new Student("EEE", 8,88,88));
		aList.add(new Student("FFF", 77,7,77));
		
		m.all(aList);
		
		System.out.println("===============================");
		
		m.sMethod(new Student("GGG", 66,66,6));
		
	}

}
