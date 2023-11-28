package Lab.ch05;

import java.util.Arrays;

public class Rectangle_Array2 {

	public static void main(String[] args) 
	{
		/*
		 arr = 배열 변수명, 2차원 배열, [5][10]
		 arr[0] = 짝수만 저장 / arr[1] = 홀수만 저장(단 3의 배수 제외) / arr[2] = 4, 5의 배수 저장 / arr[3] = 10의 배수 저장 / 
		 arr[4] = 8단 입력시킨 값 입력
		 for문, Enhanced for문, Arrays.toString() 출력
		 */
		/*
		int arr[][] = new int[5][10];
		
		for(int i = 0; i<arr.length; i++)
		{
			
			if(i==0) //arr[0] = 짝수만 저장
			{
				int a = 0;
				for(int j=0; j<arr[i].length;a++)
				{
					if(a%2==0)
					{
						arr[i][j] = a;
						j++;
					}
					else
					{
						continue;
					}
				}
				
			}
			
			else if (i==1) //arr[1] = 홀수만 저장(단 3의 배수 제외)
			{
				int a = 0;
				for(int j=0; j<arr[i].length;a++)
				{
					if(a%2==1)
					{
						if(a%3==0)
						{
							continue;
						}
						arr[i][j] = a;
						j++;
					}
				}
				
			}
			
			else if (i==2) //arr[2] = 4, 5의 배수 저장
			{
				int a = 4;
				for(int j=0; j<arr[i].length;a++)
				{
					if(a%4==0 || a%5==0)
					{
						arr[i][j] = a;
						j++;
					}
					
					else
					{
						continue;
					}
				}
				
			}
			
			else if (i==3) //arr[3] = 10의 배수 저장
			{
				int a = 10;
				for(int j=0; j<arr[i].length;j++)
				{
					if(a%10==0)
					{
						arr[i][j] = a;
						a+=10;
					}
					
					else
					{
						continue;
					}
				}
			}
			
			else if (i==4) //arr[4] = 8단 입력시킨 값 입력
			{
				int b = 8;
				for(int j=0; j<arr[i].length;j++)
				{	
					arr[i][j] = b;
					b+=8;
				}
					
			}				
		}
			
	*/
		
		/*
		for(int i = 0; i<arr.length;i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				System.out.println("i : "+i+", j : "+j+", arr : "+arr[i][j]+"\t");
			}
		}
		*/
		
		/*
		for(int[] a : arr )
		{
		 for(int  b : a)
		 {
		 	System.out.println(b);
		 	System.out.println("\t");
		}
		*/
		
		/*
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		*/
		
		int[][] arr = new int[5][10];
		
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++)
		{
			if(i==0)
			{
				int a = 2;
				for(int j = 0; j<arr[0].length;j++)
				{
					arr[i][j]=a;
					a+=2;
				}
			}
			
			else if(i==1)
			{
				int a = 1;
				for(int j = 0; j<arr[i].length; a++)
				{
					if(a%2 != 0)
					{
						if(a%3!=0)
						{
							arr[i][j] = a;
							j++;
						}
					}
				}
			}
			
			else if(i==2)
			{
				int a = 1;
				for(int j = 0; j<arr[i].length; a++)
				{
					if(a%4==0 || a%5==0)
					{
						arr[i][j] = a;
						j++;
					}
				}
				
			}
			
			else if(i==3)
			{
				int a = 1;
				for(int j = 0; j<arr[i].length; a++)
				{
					if(a%10==0)
					{
						arr[i][j] = a;
						j++;
					}
				}
			}
			
			else if(i==4)
			{
				int a = 8;
				for(int j = 0; j<arr[i].length; j++)
				{
					arr[i][j] = a;
					a+=8;
				}
			}
			
			System.out.println("");
			System.out.println(Arrays.toString(arr[0]));
			System.out.println("");
			System.out.println(Arrays.toString(arr[1]));
			System.out.println("");
			System.out.println(Arrays.toString(arr[2]));
			System.out.println("");
			System.out.println(Arrays.toString(arr[3]));
			System.out.println("");
			System.out.println(Arrays.toString(arr[4]));
			System.out.println("");
			
			for(int i1 = 0; i1<arr.length;i1++)
			{
				for(int j = 0; j<arr[i1].length; j++)
				{
					System.out.print("i : "+i1+", j : "+j+", arr : "+arr[i1][j]);
					System.out.println("\t");
				}
			}
			
			for(int[] a : arr)
			{
				System.out.println(Arrays.toString(a));
			}
			
			for(int[] a : arr)
			{
				for(int b : a)
				{
					System.out.println(b);
					System.out.println("\t");
				}
			}
		}
		
	}
}
