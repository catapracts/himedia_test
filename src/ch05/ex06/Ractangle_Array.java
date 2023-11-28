package ch05.ex06;

import java.util.Arrays;

public class Ractangle_Array {

	public static void main(String[] args) 
	{
		int[][] arr = new int[3][4];
		
		arr[0][0]=1; arr[0][1]=2; arr[0][2]=3; arr[0][3]=4;
		arr[1][0]=10; arr[1][1]=20; arr[1][2]=30; arr[1][3]=40;
		arr[2][0]=100; arr[2][1]=200; arr[2][2]=300; arr[2][3]=400;
		System.out.println(arr[0][0]+" "+arr[1][1]+" "+arr[2][3]);
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
		System.out.println(" ");
		
		for(int i =0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++) 
			{
				System.out.print("i : "+i+", j : "+j+", value : "+arr[i][j]);
				System.out.print("\t");
				
			}
		}
		
		System.out.println(" ");
		
		for(int[] a : arr) // 2차원 배열 중 행을 끄집어냄
		{
			for(int b : a) // 2차원 배열 중 끄집어낸 행에서 element들 빼내기
			{
				System.out.println(b);
				System.out.println("\t");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		System.out.println(" ");
		
		for(int i = 0;i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}

}
