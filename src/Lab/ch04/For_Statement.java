package Lab.ch04;

public class For_Statement {

	public static void main(String[] args) 
	{
		/*
		 구구단 중 7단만 출력, for문 이용
		 */
		
		for(int i=7, j=1; j<=9; j++)
		{
			int product = i*j;
			System.out.println(i+"*"+j+"="+product);
		}
		
		System.out.println(" ");
		
		for(int i=1, j=7; i<10; i++)
		{
			System.out.printf("%d * %d = %d\t", i,j,i*j);
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(int i=1; i<10; i++)
		{
			System.out.println("7"+"*"+i+"="+(7*i));
		}

	}

}
