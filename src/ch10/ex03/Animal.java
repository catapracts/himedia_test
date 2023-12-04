package ch10.ex03;

public class Animal
{
	//필드
	String name; //instance field
	int age; //instance field
	static String color; //static field - 객체화, 클래스명으로 호출
	
	//method(instance) = 객체화(인스턴스화)해서만 호출됨, Overriding 가능
	void cry()
	{
		System.out.println("All animals are crying");
	}
	
	//method(static) = 객체화(인스턴스화)안함, 클래스이름으로 호출, Overriding 불가능
	static void eat()
	{
		System.out.println("All animals are eating");
	}

}
