package ch06.ex02;

class Student
{
	String name; int num, kor, eng, math;
	//Student(){} = 기본생성자
	void printAll()
	{
		System.out.println("name : "+name);
		System.out.println("num : "+num);
		System.out.println("kor : "+kor);
		System.out.println("eng : "+eng);
		System.out.println("math : "+math);
	}
	
	double avg()
	{
		double avgAll = 0.0;
		avgAll = (kor+eng+math)/3.0;
		return avgAll;
	}
	
	int plus(int a, int b)
	{
		int sum = a+b;
		return sum;
	}
	
	String abc(String name1, String name2)
	{
		return name1 +" "+ name2;
	}
}

class Car
{
	String name, color; double speed; int door;
	Car(){}
	Car(String name, String color, double speed, int door)
	{
		this.name = name;
		this.color = color;
		this.speed = speed;
		this.door = door;
	}
	void printAll()
	{
		System.out.println("name : "+name);
		System.out.println("color : "+color);
		System.out.println("speed : "+speed);
		System.out.println("door : "+door);
	}
}

public class Object_Definition2 
{

	public static void main(String[] args) 
	{
		Student s1 = new Student();
		s1.printAll();
		System.out.println(s1.plus(80, 100));
		System.out.println(s1.abc("aa","bb"));
		s1.name = "a"; s1.num = 1111; s1.kor=99; s1.eng=99; s1.math=1;
		s1.printAll();
		System.out.println(s1.avg());
		System.out.println("===================================");
		Student s2 = new Student();
		s2.printAll();
		s2.name = "b"; s2.num = 2222; s2.kor=1; s2.eng=99; s2.math=99;
		s2.printAll();
		System.out.println(s2.avg());
		System.out.println("===================================");
		
		Car c1 = new Car();
		c1.printAll();
		Car c2 = new Car("c1","red",1.0,1);
		c2.printAll();
		Car c3 = new Car("c2","Blue",2.0,2);
		c3.printAll();
	}

}
