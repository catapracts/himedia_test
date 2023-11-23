package Lab.ch03;

import java.util.Scanner;

public class ConditionalOperator2 {

	public static void main(String[] args) 
	{
		//스캐너로  문자열 입력 = "안녕" : 출력 = "안녕하세요." "안녕 못합니다."
		//==, .equals(안녕) ? / 삼항연산자
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("입력 : ");
		str = sc.next();
		System.out.println((str.equals("안녕")) ? "안녕하세요":"안녕못합니다");
		/*
		String str1;
		System.out.println("단어 하나 입력하세요>>>");
		st1=sc.next();
		System.out.println((str1=="안녕") ? "안녕하세요":"안녕못합니다");
		*/
	}

}
