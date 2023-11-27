package ch05.ex04;

public class Array_Definition {

	public static void main(String[] args) 
	{
		int[] arr1 = new int[3];
		
		int[] arr2; 
		arr2 = new int[5];
		
		int arr3[] = new int[7];
		
		int arr4[];
		arr4 = new int[9];
		
		int[] arr5 = new int[] {10,20,30,40,50};
		
		System.out.println(arr5[0]);
		System.out.println(arr5[1]);
		System.out.println(arr5[2]);
		System.out.println(arr5[3]);
		System.out.println(arr5[4]);
		System.out.println(arr5.length);
		
		System.out.println("===================================");
		
		int arr6[];
		arr6 = new int[] {100,200,300,400,500,600};
		
		System.out.println(arr6[0]);
		System.out.println(arr6[1]);
		System.out.println(arr6[2]);
		System.out.println(arr6[3]);
		System.out.println(arr6[4]);
		System.out.println(arr6[5]);
		System.out.println(arr6.length);
		
		System.out.println("===================================");
		
		int arr7[] = {11,22,33,44,55};
		
		System.out.println(arr7[0]);
		System.out.println(arr7[1]);
		System.out.println(arr7[2]);
		System.out.println(arr7[3]);
		System.out.println(arr7[4]);
		System.out.println(arr7.length);
		
		/*
		int arr8[]; 
		arr8= {11,22,33,44,55};
		*/
		
		System.out.println("===================================");
		
		String arr9[] = {"a", "b", "c", "d", "e"};
		
		for(int i=0; i<arr9.length;i++)
		{
			System.out.println(arr9[i]);
		}

		System.out.println("===================================");
		
		arr9[0] = "A"; arr9[1] = "B"; arr9[2] = "C"; arr9[3] = "D"; arr9[4] = "E";

		for(int i=0; i<arr9.length;i++)
		{
			System.out.println(arr9[i]);
		}
		
		
		
		
	}

}
