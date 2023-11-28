package ch05.ex07;

import java.util.Arrays;

public class Rectangle_Array {

	public static void main(String[] args) 
	{
		int[][] arr1 = new int[3][4];
		int[][] arr2;
		arr2 = new int[3][4];
		int arr3[][] = new int[3][4];
		int arr4[][]; 
		arr4= new int[3][4];
		
		int[][] arr5 = new int[][] {{1,2,3,4,5},{10,20,30,40,50},{100,200,300,400,500}};
		System.out.println(arr5[2][2]);
		System.out.println(arr5[1][4]);
		
		int arr6[][];
		arr6 = new int[][] {{1,2,3,4},{11,22,33,44},{111,222,333,444}};
		System.out.println(arr6[0][2]);
		System.out.println(arr6[1][4]);
		//System.out.println(Arrays.toString(arr6[0])); //index넘긴다.
		
		int[][] arr7 = {{1,2,3},{11,22,33},{111,222,333}};
		
		int[][] arr8; 
		//arr8 = {{1,2,3},{11,22,33},{111,222,333}}; - Error
		
	}

}
