package ch05.ex01;

public class Array_Definition {

	public static void main(String[] args) 
	{
		int a = 10; int b; int c;
		c=10; c=20; c=30; c=40;
		System.out.println(a); /*System.out.println(b);*/ System.out.println(c);
		
		int arr[] = new int[5];
		System.out.println("배열 값 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
		//ArrayIndexOutOfBoundException - arr[5] = 10;
		
		System.out.println("배열 값 출력");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
