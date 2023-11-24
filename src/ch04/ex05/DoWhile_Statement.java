package ch04.ex05;

public class DoWhile_Statement {

	public static void main(String[] args) 
	{
		int a = 0;
		while(a<0)
		{
			System.out.println(a);
		}
		
		System.out.println(" ");
		
		int b = 0;
		do {
			System.out.println(b);
		}while(b<0);
		
		System.out.println(" ");
		
		int c = 0;
		do {
			System.out.println(c);
			c++;
		}while(c<100);
		
		System.out.println(" ");
		
		a=0;
		while(a<10)
		{
			System.out.println(a);
			a++;
		}
		
		System.out.println(" ");
		
		a=0;
		do
		{
			System.out.println(a);
			a++;
		}while(a<10);

	}

}
