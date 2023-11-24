package ch04.ex03;

public class For_Statement5 {

	public static void main(String[] args) 
	{
		for(int i=1;i<10;i++)
		{
			if(i%3==0) continue;
			System.out.println(i);
		}
		
		System.out.println("=================");
		
		for(int i=1;i<10;i++)
		{
			System.out.println(i);
			if(i==7) break;
		}

	}

}
