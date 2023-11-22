package ch03.ex01;

public class ArithmeticOperator 
{

	public static void main(String[] args) 
	{
		int a = 5, b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		
		System.out.println(2+(double)3);
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		
		System.out.println(8/5);
		System.out.println(8/5.0);
		System.out.println((int)(8/5.0));
		System.out.println(8%5);
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		
		int val1 = 3;
		System.out.println(++val1);
		System.out.println(val1);
		
		System.out.println(--val1);
		System.out.println(val1);
		
		int val2 = 3;
		System.out.println(val2++);
		System.out.println(val2);
		
		System.out.println(val2--);
		System.out.println(val2);
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		
		int val3 =3, val4=4, val5=2 + val3-- + ++val4;;
		System.out.println("val5 = " + val5);
		System.out.println("val3 = " + val3);
		System.out.println("val4 = " + val4);
		
		System.out.println(" ");
		System.out.println("---------------------------------");
		System.out.println(" ");
		
		int val6 =30, val7 = 40, val8 = 50;
		int val9 = 7 + --val6 + ++val7 + val8--;
		System.out.println("val6 = " + val6);
		System.out.println("val7 = " + val7);
		System.out.println("val8 = " + val8);
		System.out.println("val9 = " + val9);
	}

}
