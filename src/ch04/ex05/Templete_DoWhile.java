package ch04.ex05;

import java.util.Scanner;

public class Templete_DoWhile {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a; //스캐너로 input 받기
		
		do
		{
			System.out.println("===========================================");
			System.out.println("1.평균출력||2.합계출력||3.이름출력||4.프로그램종료");
			System.out.println("===========================================");
			System.out.println("숫자 입력 >>>");
			a = sc.nextInt();
			
			if(a==1) {System.out.println("평균출력");}
			else if(a==2) {System.out.println("합계출력");}
			else if(a==3) {System.out.println("이름출력");}
			else if(a==4) {System.out.println("프로그램 종료"); break;}
			
		}while(true);
		
		sc.close();
	}

}
