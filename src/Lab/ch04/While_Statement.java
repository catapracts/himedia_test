package Lab.ch04;

public class While_Statement {

	public static void main(String[] args) 
	{
		/*
		  1000 ~ 1, 5씩 감소, for, while문 작성
		 */
		
		for(int a = 1000; a>=0; a-=5)
		{
			System.out.println(a);
		}
		
		System.out.println("");
		
		int b=1000;
		while(b>=0)
		{
			System.out.println(b);
			b-=5;
		}

	}

}
