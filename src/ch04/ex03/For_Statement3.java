package ch04.ex03;

public class For_Statement3 {

	public static void main(String[] args) 
	{
		for(int i = 0; i>=0; i+=10)
		{
			System.out.println(i);
			
			if(i==10000) {break;}
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i>=0; i+=10)
		{
			System.out.println(i);
			break;
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<10; j++)
			{
				System.out.println(i+" "+j);
			}
		}
		
		System.out.println("=====================");
		
		for(int i = 1; i<10; i++)
		{
			System.out.println(" ");
			System.out.println(i+"단 출력");
			for(int j = 1; j<10; j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		System.out.println("=====================");
		
		for(int i = 1; i<10; i++)
		{
			System.out.println(" ");
			System.out.println(i+"단 출력");
			for(int j = 1; j<10; j++)
			{
				System.out.printf("%d * %d = %d\t", i,j,i*j);
			}
			System.out.println(" ");
			System.out.println(" ");
		}

	}

}
