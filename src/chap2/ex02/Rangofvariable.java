package chap2.ex02;

public class Rangofvariable 
{

	public static void main(String[] args) 
	{
		int a = 10;
		
		{
			int b =2;
			System.out.println(a);
			System.out.println(b);
			{
				int c =3;
				System.out.println("==========================");
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println("==========================");
			}
			// System.out.println(c); error
		}
		
		//System.out.println(b); error

	}

}
