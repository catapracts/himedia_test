package Lab.ch03;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) 
	{
		//정수값 입력 받기, 출력 : 인풋 받은 값은 ~이고, 짝수 / 홀수입니다.
		//정수값 입력 받기, 출력 : 인풋 받은 값은 ~이고, 3,6,9의 배수입니다/아닙니다.
		//스캐너, 정수, %, ||, 3항 연산자 이용
		/*
		Scanner sc = new Scanner(System.in);
		
		//3항 연산자 = int val = (i%2) ? 
		int i = 0;
		System.out.println("값 입력 :");
		i = sc.nextInt();
		
		if(i%2==0)
		{
			System.out.println("인풋 받은 값은 "+i+"이고, 짝수입니다.\n");
		}
		
		else if(i%3==0)
		{
			System.out.println("인풋 받은 값은 "+i+"이고, 홀수입니다.\n");
		}
		
		
		//3항 연산자 = 
		int j;
		System.out.println("값 입력 :");
		j=sc.nextInt();
		
		if(i%3==0 && i%6==0 && i%9==0)
		{
			System.out.println("인풋 받은 값은 "+j+"이고, 3,6,9의 배수입니다.\n");
		}
		
		else
		{
			System.out.println("인풋 받은 값은 "+j+"이고, 3,6,9의 배수가 아닙니다.\n");
		}
		*/
		
		Scanner sc1 = new Scanner(System.in);
		int input; System.out.println("값 입력 : "); input = sc1.nextInt();
		System.out.println("인풋 받은 값은 "+input+"이고");
		System.out.println((input%2==0)?"짝수입니다.":"홀수입니다.");
		System.out.println((input%3==0||input%6==0||input%9==0)?"3,6,9의 배수입니다.":"3,6,9의 배수아닙니다.");
	}

}
