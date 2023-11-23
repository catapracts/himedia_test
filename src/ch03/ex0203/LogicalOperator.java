package ch03.ex0203;

public class LogicalOperator 
{

	public static void main(String[] args) 
	{
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println(" ");
		
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println(" ");
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println(" ");
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(" ");
		System.out.println("--------------------------");
		System.out.println(" ");
		
		int val1 = 3;
		System.out.println(false && ++val1 > 6); //short-circuit - 뒤에 거 처리 x
		System.out.println(val1);
		
		int val2 = 4;
		System.out.println(true || ++val2 > 6); //short-circuit - 뒤에 거 처리 x
		System.out.println(val2);
		
		int val3 = 5;
		System.out.println(false & ++val3 > 6); //short-circuit방지 - & 앞, 뒤 무조건 다 처리
		System.out.println(val3);
		
		int val4 = 4;
		System.out.println(true | ++val4 > 6); //short-circuit방지 - | 앞, 뒤 무조건 다 처리
		System.out.println(val4);
		
		
	}

}
