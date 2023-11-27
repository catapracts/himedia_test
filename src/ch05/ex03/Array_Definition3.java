package ch05.ex03;

import java.util.Arrays;

public class Array_Definition3 {

	public static void main(String[] args) 
	{
		int arr[] = new int[1000];
		
		for(int i = 0, j = 6; i<arr.length;i++)
		{
			arr[i] = j;
			j+=6;
		}

		System.out.println(arr[0]);
		System.out.println(arr[999]);
		
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int k : arr)
		{
			System.out.println(k);
		}
		System.out.println(Arrays.toString(arr));
	}

}
