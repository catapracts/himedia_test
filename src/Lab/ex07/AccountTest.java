package Lab.ex07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		//Student 객체 input만큼 만들기, 각 객체의 이름, 계좌, 
		Account a = new Account();
		int select;
		int num;
		
out : do { 
		 System.out.println("==========================================");
		 System.out.println("1.계좌이름 & 계좌번호 등록 2.입금 3.출금 4.종료");
		 System.out.println("==========================================");
		 System.out.println("정수 입력"); 
		 select=sc.nextInt();
		
		 switch(select)
		 {
		
		  case 1:
			 System.out.println("계좌 이름, 계좌 번호 입력 : ");
			 //System.out.println("계좌이름 입력 : ");
			 a.name=sc.next();
			 //System.out.println("계좌번호 입력 : ");
			 a.account=sc.nextInt();
			 System.out.println("계좌 이름 : "+a.getName()+", 계좌 번호 : "+a.getAccount());
			 
			 break;
			 
		  case 2:
			 if(a.name == null || a.account==0)
			 {
				 System.out.println("계좌를 먼저 등록해주세요.");
				 break;
			 }
			 System.out.println("입금할 금액 입력 : ");
			 num=sc.nextInt();
			 a.deposit(num);
			 break;
			 
		  case 3:
			  if(a.name == null || a.account==0)
			  {
				System.out.println("계좌를 먼저 등록해주세요.");
				break;
			  }
			 System.out.println("출금할 금액 입력 : ");
			 num=sc.nextInt();
			 a.withdraw(num);
			 break;
			 
		  case 4: 
			 break out;
		 }
		
		}while(true);
	
	System.out.println("Program End");
	

	}

}
