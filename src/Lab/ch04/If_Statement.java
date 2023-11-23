package Lab.ch04;

import java.util.Scanner;

public class If_Statement {

	public static void main(String[] args) 
	{
		/*
		console에서 input : "Monday" Output : "study JAVA"
		console에서 input : "Tuesday" Output : "study Database"
		console에서 input : "Wednesday" Output : "study HTML&Javascript"
		console에서 input : "Thursday" Output : "study JSP"
		console에서 input : "Friday" Output : "study Spring"
		console에서 input : "Saturday" Output : "Exercise"
		console에서 input : "Sunday" Output : "take a rest"
		console에서 input : another value Output : "It's a wrong answer. Please enter a day"
		if-else, .equals("Monday")
		*/
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("요일 입력 : ");
		str = sc.next();
		
		if(str.equals("월요일")) System.out.println("월요일은 JAVA공부한다.");
		else if(str.equals("화요일")) System.out.println("화요일은 DATABASE공부한다.");
		else if(str.equals("수요일")) System.out.println("수요일은 HTML&Javascript공부한다.");
		else if(str.equals("목요일")) System.out.println("목요일은 JSP공부한다.");
		else if(str.equals("금요일")) System.out.println("금요일은 Spring공부한다.");
		else if(str.equals("토요일")) System.out.println("토요일은 운동한다.");
		else if(str.equals("일요일")) System.out.println("일요일은 쉰다.");
		else System.out.println("잘못 입력했습니다. 요일을 입력하세요.");

	}

}
