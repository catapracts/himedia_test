package ch03.ex04;

public class ReationOperator {

	public static void main(String[] args) 
	{
		//크기 비교, 등가 비교
		System.out.println(5>2);
		System.out.println(5<2);
		System.out.println(5>=2);
		System.out.println(5<=2);
		System.out.println(5==2);
		System.out.println(5!=2);
		
		System.out.println(" ");
		System.out.println("==============");
		System.out.println(" ");
		
		char a ='a';
		char b ='b';
		System.out.println(a==b);
		System.out.println(a!=b);
		
		
		System.out.println(" ");
		System.out.println("==============");
		System.out.println(" ");
		
		//크기 비교, 등가 비교 - 참조 자료형
		String str1 = new String("Hello");
		String str2 = new String("World");
		System.out.println(str1==str2);
		System.out.println(str1!=str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(" ");
		System.out.println("==============");
		System.out.println(" ");
		
		String str3 = "★";
		String str4 = "★";
		System.out.println(str3==str4); // == : Stack에 저장된 Heap의 메모리주소값이 있다.(실제값은 Heap에 있다.)
		System.out.println(str3.equals(str4));
		
		
		
		
	}

}
