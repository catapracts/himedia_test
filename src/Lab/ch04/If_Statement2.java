package Lab.ch04;

import java.util.Scanner;

public class If_Statement2 {

	public static void main(String[] args) 
	{
		/*
		Using Scanner for input from console / input : integer = own's wealth
		if, else if, ==
		0~1000만원 : "take a bus or subway"
		1000~1억 : "take a taxi"
		1억~ : "take a airplane"
		*/
		
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("현재 내 자산(단위-만원) : ");
		i = sc.nextInt();
		
		if(i>=0 && i<1000) System.out.println("버스, 지하철 타고 다닌다.");
		else if(i>=1000 && i<10000) System.out.println("택시 타고 다닌다.");
		else if(i>=10000) System.out.println("비행기 타고 다닌다.");
		else System.out.println("잘못된 값을 입력했습니다. 양의 정수를 입력하세요");

	}

}
