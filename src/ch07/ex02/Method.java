package ch07.ex02;

import java.util.List;

public class Method 
{
	List<String> aList;
	int[] arr;
	
	//기본 생성자 - Method(){}
	
	void arrayListOut(List<Student> aList)
	{
		//aList input 받고, object 반환 후 내용 출력
		for(int i = 0; i<aList.size(); i++)
		{
			Student s = aList.get(i);
			System.out.println(s);
		}
	}
	
	void arrayOutput(int[] arr1, int a)
	{
		int count = 0;
		for(int i = 0; i<arr1.length; i++)
		{
			if(arr1[i]==a)
			{
				count++;
			}
		}
		System.out.println("input int : "+a+", Array에 : "+count+"개 있다.");
	}
	
	//List<Student> 객체를 받아서 각 객체의 이름을 출력하는 메소드
	void nameAddr(List<Student> aList)
	{
		for(int i = 0; i < aList.size(); i++)
		{
			Student s = aList.get(i);
			System.out.println("name : "+s.getName()+", Address : "+ s.getAddr());
		}
	}
	
	//List<Student> 객체를 받아서 객체 꺼내서 메소드 호출 sumAvg()
	void all(List<Student> aList)
	{
		for(int i = 0; i<aList.size();i++)
		{
			Student s = aList.get(i);
			s.sumAvg();
		}
		
	}
	
	void sMethod(Student s)
	{
		s.sumAvg();
	}
}
