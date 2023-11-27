package Lab.ch05;

import java.util.Scanner;

public class Array_Definition3 {


	public static void main(String[] args) 
	{
		/*
		 use do-while / use scanner for Array size / 7,8의 배수 저장 후 출력
		 use do-while / use scanner for Array size / 1씩 증가 but 4의 배수 제외하고 출력
		 use do-while / use scanner for Array size / 3의 배수 저장 but 6의 배수 제외하고 출력
		 */
		
		/*
		Scanner sc = new Scanner(System.in);
		int a=0, b=0, c=0, d=0;
		int[] arr = new int[a];
				
		
		do {
			
			System.out.println("=======================================");
			System.out.println("1. 7, 8의 배수 저장 후 출력 / 2. 1씩 증가 but 4의 배수 제외하고 출력 / 3. 3의 배수 저장 but 6의 배수 제외하고 출력 / 4. quit");
			System.out.println("=======================================\n");
			
			System.out.println("input : ");
			a = sc.nextInt();

			System.out.println("");
			
			if(a==1)
			{
				int[] arr1 = new int[b];
				System.out.println("input index : ");
				b = sc.nextInt();
				
				System.out.println("");
				
				for(int i = 7, k = 0; k<arr1.length; i+=7)
				{
					arr1[k] = i;
					System.out.println(arr1[k]);
					//System.out.println(arr.length);
					k++;
				}
				
				System.out.println("");
				
				for(int i = 8, k = 0; k<arr1.length; i+=8)
				{
					arr1[k] = i;
					System.out.println(arr1[k]);
					//System.out.println(arr.length);
					k++;
				}
				
				System.out.println("");
			}
			
			else if(a==2)
			{
				int[] arr2 = new int[c];
				System.out.println("input index : ");
				c = sc.nextInt();
				
				System.out.println("");
				
				for(int i = 0, k = 0; k<arr2.length; i++)
				{
					if(i%4==0) 
					{
						continue;				
					}
					arr2[k] = i;
					System.out.println(arr2[k]);
					//System.out.println(arr.length);
					k++;
				}
			}
			
			else if(a==3)
			{
				int[] arr3 = new int[d];
				System.out.println("input index : ");
				d = sc.nextInt();
				
				System.out.println("");
				
				for(int i = 3, k = 0; k<arr3.length; i+=3)
				{
					if(i%3==0)
					{
						if(i%6==0)
						{
							continue;
						}
						arr3[k] = i;
					}
					
					System.out.println(arr3[k]);
					//System.out.println(arr.length);
					k++;
					
				}
			}
			
			else if(a==4) 
			{
				break;
			}
			
			else 
			{ 
				System.out.println("다시 입력\n");
			}
			
		}while(true);
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int arr[]; int n, idx;
		
		do
		{
			System.out.println("=======================================");
			System.out.println("1. use do-while / use scanner for Array size / 7,8의 배수 저장 후 출력\n");
			System.out.println("2. use do-while / use scanner for Array size / 1씩 증가 but 4의 배수 제외하고 출력\n");
			System.out.println("3. use do-while / use scanner for Array size / 3의 배수 저장 but 6의 배수 제외하고 출력\n");
			System.out.println("4. 종료\n");
			System.out.println("=======================================\n");
			System.out.println("select>>>>>>>>>>>>>>>>");
			n = sc.nextInt();
			
			
			if(n==1)
			{
				System.out.println("1. use do-while / use scanner for Array size / 7,8의 배수 저장 후 출력\n");
				System.out.println("input index : ");
				idx=sc.nextInt();
				arr = new int[idx];
				//System.out.println("index : "+arr.length);
				
				System.out.println("");
				
				int a = 1;
				
				for(int i = 0 ;; a++) //each value allocated by 7의 배수, 8의배수 in array
				{
					if(i==idx) {break;}
					
					if(a%7==0 || a%8==0)
					{
						arr[i] = a;
						i++;
					}
				}
				
				for(int i=0; i<arr.length;i++)
				{
					System.out.println("index : "+i+", value : "+arr[i]);
				}
				
			}
			
			else if(n==2)
			{
				System.out.println("2. use do-while / use scanner for Array size / 1씩 증가 but 4의 배수 제외하고 출력\n");
				System.out.println("input index : ");
				idx=sc.nextInt();
				arr = new int[idx];
				//System.out.println("index : "+arr.length);
				
				int a = 1;
				
				for(int i = 0 ;i<arr.length; a++)
				{
					if(a%4==0) {continue;}
					arr[i] = a;
					i++;
				}
				
				for(int i=0; i<arr.length;i++)
				{
					System.out.println("index : "+i+", value : "+arr[i]);
				}
				
			}
			
			else if(n==3)
			{
				System.out.println("3. use do-while / use scanner for Array size / 3의 배수 저장 but 6의 배수 제외하고 출력\n");
				System.out.println("input index : \n");
				idx=sc.nextInt();
				arr = new int[idx];
				//System.out.println("index : "+arr.length);
				
				int a = 1;
				
				for(int i = 0 ;i<arr.length; a++)
				{
					if(a%3==0) 
					{
						if(a%6!=0)
						{
							arr[i] = a;
							i++;
						}
					}
				}
				
				for(int i=0; i<arr.length;i++)
				{
					System.out.println("index : "+i+", value : "+arr[i]);
				}
				
				
			}
			
			else if(n==4)
			{
				System.out.println("종료");
				break;
			}
			
			else
			{
				System.out.println("다시 입력\n");
			}
			
		}while(true);
	}

}
