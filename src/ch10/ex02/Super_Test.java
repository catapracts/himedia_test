package ch10.ex02;

class A
{
	A()
	{
		System.out.println("basic constuructor of A");
	}
	
	A(int a)
	{
		System.out.println("consturctor of A with input - integer");
	}
	
	A(String str, int a)
	{
		System.out.println("consturctor of A with two inputs - String and integer");
	}
}

class B extends A
{
	B(){System.out.println("basic constuructor of B");}
	B(int a){super(1); System.out.println("consturctor of B with input - integer");}
	B(String str, int a){System.out.println("consturctor of B with two inputs - String and integer");}
}

class C extends B
{
	C(){System.out.println("basic constuructor of C");}
	C(String a){super(1); System.out.println("consturctor of C with input - String");}
	int a = 22, b = 33;
}


public class Super_Test 
{

	public static void main(String[] args) 
	{
		C c1 = new C("100");
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}
