package Lab.ch04;

import java.util.Scanner;

public class Switch_Statement {

	public static void main(String[] args) 
	{
		/*
		Use Scanner for receiving input, input = integer
		1 : You have a Gold medal.
		2 : You have a Silver medal.
		3 : You have a Bronze medal.
		switch, if/else if
		*/
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("정수 입력 : ");
		i = sc.nextInt();
		
		switch(i)
		{
			case 1 : case 10: case 100: System.out.println("당신은 금메달을 획득했습니다."); break;
			case 2 : case 20: case 200: System.out.println("당신은 은메달을 획득했습니다."); break;
			case 3 : case 30: case 300: System.out.println("당신은 동메달을 획득했습니다."); break;
			default : System.out.println("정수 1~3 중 하나를 입력하세요.");
		}
		
		if(i == 1||i==10||i==100) System.out.println("당신은 금메달을 획득했습니다.");
		else if(i==2||i==20||i==200) System.out.println("당신은 은메달을 획득했습니다.");
		else if(i==3||i==30||i==300) System.out.println("당신은 동메달을 획득했습니다.");
		else System.out.println("정수 1~3 중 하나를 입력하세요.");

	}

}
