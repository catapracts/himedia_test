package ch04.ex04;

public class While_Statement2 {

	public static void main(String[] args) 
	{
		int a = 1;
		while(a>0)
		{
			System.out.println("Infinite Loop");
			if(a==1000) break;
			a++;
		}
		
		boolean b = true;
		while(b)
		{
			System.out.println(a);
			a++;
			if(a== 10000) b=false;
		}

	}

}
