package Lab.ch05;

public class Array_Definition4 {

	public static void main(String[] args) 
	{
		int a = 10;
		int[] b = new int[a];
		
		System.out.println(b);
		
		for(int i = 0; i<10; i++)
		{
			System.out.println(b[i]);
		}
		
		System.out.println(b.length);
		
		for(int i = 0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		
		

	}

}
