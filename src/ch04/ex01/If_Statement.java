package ch04.ex01;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = 10;
		
		System.out.println("Program Start");
		
		if(a>30)
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("false");
		}
		
		System.out.println("Program End");
		
		System.out.println(" ");
		System.out.println("----------------------");
		System.out.println(" ");
		
		int b = 0;
		b=sc.nextInt();
		
		if(b >= 90)
		{
			System.out.println("A");
		}
		
		else if(b>=80)
		{
			System.out.println("B");
		}
		
		else if(b>=70)
		{
			System.out.println("C");
		}
		
		else if(b>=60)
		{
			System.out.println("D");
		}
		
		else if(b>=50)
		{
			System.out.println("E");
		}
		
		else if(b>=40)
		{
			System.out.println("F");
		}
		
		else
		{
			System.out.println("사람이신가요?");
		}
		
		
		if(b >= 40 && b < 50) //true && true ==> 실행
		{
			System.out.println("F");
		}
		
		else if(b>=50 && b < 60)
		{
			System.out.println("E");
		}
		
		else if(b>=60 && b < 70)
		{
			System.out.println("D");
		}
		
		else if(b>=70 && b < 80)
		{
			System.out.println("C");
		}
		
		else if(b>=80 && b < 90)
		{
			System.out.println("B");
		}
		
		else if(b>=90 && b < 100)
		{
			System.out.println("A");
		}
		
		else
		{
			System.out.println("사람이신가요?");
		}
		
		System.out.println(" ");
		System.out.println("----------------------");
		System.out.println(" ");
		
		if(10>5) {System.out.println("charm");}
		if(10>5) System.out.println("charm");
	}
}