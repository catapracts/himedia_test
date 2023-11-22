package ch03.ex02;

import java.util.Scanner;

public class BitWiseOperator 
{

	public static void main(String[] args) 
	{
		// 10, 8, 16진수, calc
		
		int data = 13;
		
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		System.out.println("3"+"5");
		System.out.println(Integer.parseInt("3")+Integer.parseInt("5"));
		System.out.println("30.55"+"27.59");
		System.out.println(Double.parseDouble("30.55")+Double.parseDouble("27.59"));
		
		System.out.println(" ");
		System.out.println("-------------------------------------------------");
		System.out.println(" ");
		
		//스캐너에서 숫자가 문자열로 들어왔을 때, 정수/실수로 변환 - kor, eng = int, avg = double
		Scanner sc = new Scanner(System.in);
		String kor, eng, avg;
		
		System.out.println("국어점수(정수) 영어점수(정수) 평균(실수) 입력");
		kor = sc.next(); eng = sc.next(); avg = sc.next();
		
		//int sum = kor + eng; -> error
		int sum = Integer.parseInt(kor) + Integer.parseInt(eng);
		
		System.out.println("국어점수(정수)+영어점수(정수) : "+sum);
		
		System.out.println("평균(실수) : " + Double.parseDouble(avg));
	}

}
