package Lab.ch03;

import java.util.Scanner;

public class ConverType {

	public static void main(String[] args) 
	{
		/*
		String으로 입력받은 값을 정수나 실수 타입으로 변환해서 출력
		변수 = 문자열로 된 정수 "13", 실수 "13.33"
		String kor, eng, math; int sum; double avg;
		
		System.out.println("국어점수, 영어점수, 수학점수");
		
		System.out.println("모든 정수의 합 : " + sum);
		
		System.out.println("모든 과목의 평균 : " + avg);
		
		System.out.println(" ");
		System.out.println("------------------------------");
		System.out.println(" ");
		*/
		Scanner sc = new Scanner(System.in);
		String kor, eng, math; int sum; double avg;
		
		System.out.println("국어점수, 영어점수, 수학점수 입력>>>>>>>>>>>\t");
		kor = sc.next();
		eng = sc.next();
		math = sc.next();
		System.out.println("국어 : "+Integer.parseInt(kor)+" "+"영어 : "+Integer.parseInt(eng)+" "+"수학 : "+Integer.parseInt(math));
		sum = Integer.parseInt(kor) + Integer.parseInt(eng) + Integer.parseInt(math);
		avg = (double)sum/3;
		System.out.println("합 : "+sum+" "+"평균 : "+avg);
	}

}
