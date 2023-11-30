package Lab.ex07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_vs_ArrayList 
{

	public static void main(String[] args) 
	{
		//배열 - arr[] : index=100, 10의 배수 저장&출력
		//컬렉션 - aList[] : index=100, 20의 배수 저장&출력
		/*
		 * int arr[] = new int[100];
		 * 
		 * for(int i = 0, j=10; i<arr.length;i++) { arr[i]=j; j+=10; }
		 * System.out.println(Arrays.toString(arr));
		 * 
		 * System.out.println("=============================================");
		 * 
		 * List<Integer> aList = new ArrayList<Integer>();
		 * 
		 * System.out.println(aList.size());
		 * 
		 * for(int i = 0, j = 0; i<100;i++) { j+=20; aList.add(j); }
		 * 
		 * System.out.println(aList.size());
		 * 
		 * for(int i=0;i<aList.size();i++) { System.out.println(aList.get(i)); }
		 */
		
		int[] arr = new int[100];
		
		for(int i =0, a=0; i<arr.length;i++)
		{
			a+=10;
			arr[i] = a;
		}
		
		for(int k : arr)
		{
			System.out.println(k);
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("======================");
		
		List<Integer> aList = new ArrayList<>();
		ArrayList<Integer> aList2 = new ArrayList<>();
		
		for(int i = 0, a= 0; i<100;i++)
		{
			a+=20;
			aList.add(a);
		}
		
		System.out.println(aList.size());
		
		for(int i = 0; i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
		
		
	}

}
