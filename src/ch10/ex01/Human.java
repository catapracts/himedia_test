package ch10.ex01;

public class Human 
{
	
	//생략된 기본 생성자
	Human()
	{
		super(); ///Object
	}
	
	//constructor
	Human(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	String name;
	int age;
	
	void eat()
	{
		System.out.println("모든 사람은 먹는다.");
	}
	
	void sleep()
	{
		System.out.println("모든 사람은 잠을 잔다.");
	}
}
