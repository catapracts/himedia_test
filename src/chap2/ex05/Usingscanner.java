package chap2.ex05;

import java.util.Scanner;

public class Usingscanner 
{

	public static void main(String[] args) 
	{
		//외부의 라이브러리 사용하기 - 자바에서 만들어진 클래스의 묶음 = 라이브러리
		System.out.println();
		String s; Integer b; Double c; Long d;
		
		Scanner sc = new Scanner(System.in);
		String fname;
		String mname;
		String myname;
		
		/*
		System.out.println("input >>>");
		
		fname = sc.next();
		mname = sc.next();
		myname = sc.next();
		
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(myname);
		*/
		
		System.out.println("input >>>");
		fname = sc.next();
		System.out.println("input >>>");
		mname = sc.next();
		System.out.println("input >>>");
		myname = sc.next();
		
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(myname);
		
		System.out.println("=============================================");
		
		int aa, bb, cc;
		
		System.out.println("blank >>>>");
		aa=sc.nextInt();
		bb=sc.nextInt();
		cc=sc.nextInt();
		
		System.out.println(aa+"\n"+bb+"\n"+cc);		
	}

}
