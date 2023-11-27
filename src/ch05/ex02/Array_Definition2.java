package ch05.ex02;

public class Array_Definition2 {

	public static void main(String[] args) 
	{
		double[] arr = new double[10];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);		
		System.out.println(arr[5]);
		System.out.println(arr[6]);		
		System.out.println(arr[7]);		
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		System.out.println("");
		
		arr[0] = 10.1; arr[1] = 11.1; arr[2] = 12.1; arr[3] = 13.1; arr[4] = 14.1; arr[5] = 15.1; arr[6] = 16.1; arr[7] = 17.1;
		arr[8] = 18.1; arr[9] = 19.1;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);		
		System.out.println(arr[5]);
		System.out.println(arr[6]);		
		System.out.println(arr[7]);		
		System.out.println(arr[8]);
		System.out.println(arr[9]);
		
		System.out.println("");
		
		for(int i = 0; i<10; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		
		System.out.println(arr.length);
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		
		int arr1[] = new int[100];
		
		for(int i = 0, j = 1; i < arr1.length; i++)
		{			
			arr1[i] = j;
			j++;
		}
		
		System.out.println("");
		
		for(int i = 0; i < arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		
		
	}

}
