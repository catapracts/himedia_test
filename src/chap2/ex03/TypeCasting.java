package chap2.ex03;

public class TypeCasting 
{

	public static void main(String[] args) 
	{
		int a =10;
		double b=20.55;
		System.out.println(a+b); //Up casting : int -> double
		System.out.println((int)(a+b)); //Down casting : double -> int
		
		double c = 100; //변수가 자동으로 Up casting 되어서 double 변수에 할당됨
		int d = (int)200.5; //실수를 Down casting 해서 정수 변수에 할당시키기
		System.out.println(c);
		System.out.println(d);
	}

}
