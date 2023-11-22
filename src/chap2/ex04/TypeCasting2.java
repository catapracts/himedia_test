package chap2.ex04;

public class TypeCasting2 {

	public static void main(String[] args) 
	{
		int kor = 100;
		int eng = 93;
		int math = 97;
		
		System.out.println(kor+eng+math);
		System.out.println((kor+eng+math)/3);
		System.out.println(((double)(kor+eng+math))/3);
		
		System.out.println("==============================");
		
		int sum = kor + eng + math;
		double avg = ((double)sum/3);
		double avg1 = sum/3; // 정수/정수 = 정수 -> 더블
		double avg2 = sum/3.0; // 정수(더블)/더블 = 더블 -> 더블
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avg1);
		System.out.println(avg2);
	}

}
