package ch05.ex05;

public class Array_Definition {

	public static void main(String[] args) 
	{
		int a = 3;
		int a1 = a;
		a1 = 7;
		System.out.println(a);
		System.out.println(a1);
		System.out.println("======================");
		int arr[] = new int[] {3,4,5};
		int arr1[] = arr;
		System.out.println(arr);
		System.out.println(arr1);
		arr[0] = 7;
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		
	}

}
