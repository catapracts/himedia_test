package ch04.ex02;

public class SwitchStatement {

	public static void main(String[] args) 
	{
		int val1 = 1;
		
		switch(val1)
		{
			case 1 :
				System.out.println("A"); break;
			case 2 :
				System.out.println("B"); break;
			case 3 :
				System.out.println("C"); break;
			case 4 :
				System.out.println("D"); break;
			case 5 :
				System.out.println("E"); break;
			case 6 :
				System.out.println("F"); break;
			default :
				System.out.println("잘못된 값을 입력했습니다. 양의 정수를 입력하세요.");
		}

		char ch1 = 'a';
		
		switch(ch1)
		{
			case 'a' : System.out.println("A"); break;
			case 'b' : System.out.println("B"); break;
			case 'c' : System.out.println("C"); break;
			case 'd' : System.out.println("D"); break;
			case 'e' : System.out.println("E"); break;
			case 'f' : System.out.println("F"); break;
			default : System.out.println("잘못된 값을 입력했습니다. 영어 소문자 1개를 입력하세요.");
		}
		
		String str1 = "abc";
		
		switch(str1)
		{
			case "abc" : System.out.println("A"); break;
			case "def" : System.out.println("B"); break;
			case "ghi" : System.out.println("C"); break;
			case "jkl" : System.out.println("D"); break;
			case "mno" : System.out.println("E"); break;
			case "pqr" : System.out.println("F"); break;
			default : System.out.println("잘못된 값을 입력했습니다. 문자열을 입력하세요.");
		}
	}

}
