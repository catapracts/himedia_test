package ch05.ex08;

import java.util.Arrays;

public class NoRectangle_Array {

	public static void main(String[] args) 
	{
		//비정방형 배열 = 행에 대해서 열의 개수가 다른 배열
		
		int arr[][] = new int[3][]; // 행의 개수만 정의
		arr[0] = new int[2]; arr[1] = new int[3]; arr[2] = new int[4]; //열의 개수 정의
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));

	}

}
