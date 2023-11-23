package Lab.ch04;

import java.util.Scanner;

public class Switch_Statement2 {

	public static void main(String[] args) 
	{
		/*
		Using Scanner for input, input = month, output = days, result - month : days
		31days : 1, 3, 5, 7, 8, 10, 12
		30days : 4, 6, 9, 11
		28days : 2
		*/
		
		Scanner sc = new Scanner(System.in);
		int month; int day = 30;
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();
		
		switch(month)
		{
			//day+=1;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12: System.out.println("해당 월은 "+month+"월 이고, "+(day+1)+"일까지 존재합니다."); break;
			case 4: case 6: case 9: case 11: System.out.println("해당 월은"+month+"월이고,"+day+"일까지 존재합니다."); break;
			//day-=2;
			case 2:  System.out.println("해당 월은"+month+"월이고,"+(day-2)+"일까지 존재합니다."); break;
			//default : System.out.println("해당 월은"+month+"월이고,"+day+"일까지 존재합니다."); break;
			default : System.out.println("잘못 입력했습니다. 1~12 사이를 입력하세요."); break;
		}

	}

}
