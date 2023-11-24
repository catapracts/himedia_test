package ch04.ex03;

import java.util.Iterator;

public class For_Statement 
{

	public static void main(String[] args) 
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("춥다");
		}
		
		/* infinite loop
		int a;
		for (a = 0; a >= 0; a++) 
		{
			System.out.println(a);
		}
		*/
		
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("");
		
		for (int i=0; i<=100; i+=2)
		{
			System.out.println(i);
			
		}
		//System.out.println(i); -> only use in the block
	}

}
