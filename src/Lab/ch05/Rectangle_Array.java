package Lab.ch05;

import java.util.Arrays;

public class Rectangle_Array {

	public static void main(String[] args) 
	{
		/*
		 arr[3][10] 
		 row 0 : start 0 & +1 
		 row 1 : 3의 배수
		 row 2 : 7,8의 배수
		 2중 for문 Enhanced for문, Arrays.toString() 출력
		*/
		
		int[][] arr = new int[3][10];
		System.out.println(arr.length); //행의 갯수
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println("");
		
		for(int i = 0; i<arr.length; i++) //행 반복
		{
			System.out.println("행 번호 : "+i);
			System.out.println("");
			
			if(i==0)
			{
				int a = 1;
				for(int j = 0; j<arr[i].length; j++) //열 반복
				{
					arr[i][j] = a;
					a++;
				}
			}
				
			else if(i==1)
			{
				int a = 3;
				for(int j = 0; j<arr[i].length; j++) //열 반복
				{
					arr[i][j] = a;
					a+=3;
				}
					
			}
				
			else if(i==2)
			{
				int a = 1;
				for(int j = 0; j<arr[i].length; a++) //열 반복
				{
					if(a%7==0||a%8==0)
					{
						arr[i][j] = a;
						j++;
					}
				}
					
			}
		}
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		/*
		for(int i = 0; i<arr.length; i++)
		{
			if(i==0)
			{
				for(int j = 0; j<arr[i].length;j++)
				{
					arr[i][j] = j;
				}
			}
			
			else if(i==1)
			{
				for(int j = 3; j<arr[i].length;j+=3)
				{
					arr[i][j] = j;
					System.out.print(i+" "+j+" "+arr[i][j]);
				}
			}
			
			else if(i==2)
			{
				int a = 1;
				for(int j = 0; j<arr[i].length; a++)
				{
					if(a%7==0 || a%8==0)
					{
					 arr[i][j] = j;
					 System.out.print(i+" "+j+" "+arr[i][j]);
					}
					else
					{
						continue;
					}
				}
			}
			
		}
		*/

		
		/*
		int arr[][] = new int[3][10];
		int k = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				arr[i][j] = k;
				k++;
			}
		}
		*/
		
		/*
		int arr[][] = new int[3][10];
		int k = 3;
		
		for(int i = 0; i<arr.length; i++)
		{
		 for(int j = 0; j<arr[i].length;j++)
		 {
			arr[i][j] = k;
			k+=3;
		 }
		}
		*/
		/*
		int arr[][] = new int[3][10];
		
		
		
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j < arr[i].length; j++)
			System.out.println(i+" "+j+" "+arr[i][j]);
		}
		
		System.out.println(" ");
		*/
		
		/*
		for(int[] a : arr) // 2차원 배열 중 행을 끄집어냄
		{
			for(int b : a) // 2차원 배열 중 끄집어낸 행에서 element들 빼내기
			{
				System.out.print(b);
				System.out.print("\t");
			}
			System.out.println();
		}
		
		System.out.println(" ");
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		*/
		
		
		
		
		
		
	}

}
