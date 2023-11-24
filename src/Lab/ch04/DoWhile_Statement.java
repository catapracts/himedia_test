package Lab.ch04;

import java.util.Scanner;

public class DoWhile_Statement {

	public static void main(String[] args) 
	{
		//for, while, do-while
		
		Scanner sc = new Scanner(System.in);
		int a;
		
		do
		{
			System.out.println("\n");
			System.out.println("=============================================================================");
			System.out.println("1.구구단 출력||2.19단 출력||3.1~1000까지 3의 배수출력||4.짝수의 개수 출력||5.프로그램종료");
			System.out.println("=============================================================================");
			System.out.println("숫자 입력 >>>");
			a = sc.nextInt();
			
			if(a==1) 
			{
				System.out.println("구구단출력");
				
				for(int i = 1;i<=9;i++)
				{
					System.out.println("\n\n"+i+"단"+"\n");
					for(int j=1; j<=9; j++)
					{
						System.out.printf("%d * %d = %d\t", i, j, (i*j));
					}
				}
			}
			
			else if(a==2) 
			{
				System.out.println("19단출력");
				
				for(int i = 1;i<=19;i++)
				{
					System.out.println("\n\n"+i+"단"+"\n");
					for(int j=1; j<=19; j++)
					{
						System.out.printf("%d * %d = %d\t", i, j, (i*j));
					}
				}
			}
			
			else if(a==3) 
			{
				System.out.println("1~1000까지 3의 배수출력");
				
				//for문
				for(int i = 0; i<=1000;i++)
				{
					if(i%3==0) System.out.printf("%d ",i);
					else continue;
				}
				
				/*
				while
				int t = 0;
				while(t<=1000)
				{
					t++;
					if(t%3==0) System.out.printf("%d ",t);
					else continue;
					
				}
				*/
				
				/*
				do-while
				int t = 0;
				do
				{
					t++;
					if(t%3==0) System.out.printf("%d ",t);
					else continue; if(d==1000) t=false;
					
				}while(t<=1000); - t=true
				*/
			}
			
			else if(a==4) 
			{
				int c, count = 0;
				for(int i=1;i<=10;i++)
				{
					c = sc.nextInt();
					if(c<=0) continue; //
					if(c%2==0) count++;
				}
				System.out.println("짝수의 개수 : "+count);
				
			}
			
			else if(a==5) 
			{
				System.out.println("프로그램 종료");
				break;
				
			}
			
		}while(true);
		
		sc.close();

	}

}
