package Lab.ch2;

import java.util.Scanner;

public class UsingScanner {

	public static void main(String[] args) 
	{
		//학생 1,2,3 / 국어, 영어, 수학 / 정수합, 평균
		String str1, str2, str3;
		int kor, eng, math, sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		//학생1의 점수 입력, 점수 합, 평균 계산
		System.out.println("학생1의 이름 국어점수 영어점수 수학점수를 입력하세요.>>>");
		str1 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		System.out.println(str1+"의 "+"국어 점수 : "+kor+"\t 영어 점수 : "+eng+"\t 영어 점수 : "+math);
		sum = kor+eng+math;
		avg = (double)(sum)/3;
		System.out.println(str1+"의 모든 점수의 합계는 : "+sum+"점 이고 "+"평균은"+avg+"입니다.");
		
		System.out.println(" ");
		System.out.println("===============================");
		System.out.println(" ");
		
		//학생2의 점수 입력, 점수 합, 평균 계산
		System.out.println("학생2의 이름 국어점수 영어점수 수학점수를 입력하세요.>>>");
		str2 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		System.out.println(str2+"의 "+"국어 점수 : "+kor+"\t 영어 점수 : "+eng+"\t 영어 점수 : "+math);
		sum = kor+eng+math;
		avg = (double)(sum)/3;
		System.out.println(str2+"의 모든 점수의 합계는 : "+sum+"점 이고 "+"평균은"+avg+"입니다.");
		
		System.out.println(" ");
		System.out.println("===============================");
		System.out.println(" ");
		
		//학생3의 점수 입력, 점수 합, 평균 계산
		System.out.println("학생3의 이름 국어점수 영어점수 수학점수를 입력하세요.>>>");
		str3 = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		
		System.out.println(str3+"의 "+"국어 점수 : "+kor+"\t 영어 점수 : "+eng+"\t 영어 점수 : "+math);
		sum = kor+eng+math;
		avg = (double)(sum)/3;
		System.out.println(str3+"의 모든 점수의 합계는 : "+sum+"점 이고 "+"평균은"+avg+"입니다.");
	}
}
