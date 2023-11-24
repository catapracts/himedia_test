package ch04.ex03;

public class For_statement2 {

	public static void main(String[] args)
	{
		for (int i = 0, j=0; i <=1000; i+=3, j++) 
		{
			System.out.println("i변수의 값 : "+i+"\t j변수의 값 : "+j);
		}
		
		System.out.println("");
		System.out.println("========================================================");
		System.out.println("");
		
		for(int i = 1; i<=100; i++)
		{
			if(i%3==0) System.out.println(i);
		}

	}

}
