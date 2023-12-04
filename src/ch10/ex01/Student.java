package ch10.ex01;

public class Student extends Human
{
	
	//생략된 기본 생성자
	Student()
	{
		super();
	}
	
	Student(int ID)
	{
		super("아무개", 20);
		this.ID = ID;
		this.stName = super.name;
		super.eat();
	}
	
	String stName;
	int ID;
	
	void goToSchool()
	{
		System.out.println("모든 학생은 학교를 간다.");
	}
	
	void stuInfo()
	{
		System.out.println("학생 이름 : "+name);
		System.out.println("학생 나이 : "+age);
		System.out.println("학생증 번호 : "+ID);
	}
}
