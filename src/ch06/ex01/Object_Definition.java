package ch06.ex01
;

public class Object_Definition 
{
	String name; int age; double weight; String add;
	
	void print()
	{
		System.out.println("이름 : "+name);		
	}
	
	int printAge()
	{
		return age;
	}
	
	Object_Definition(){}
	
	Object_Definition(String name, int age, double weight, String add)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.add = add;
	}
	
	
	void printAll()
	{
		System.out.println("name : "+name+", age : "+age+", weight : "+weight+", add : "+add);
	}

	public static void main(String[] args) 
	{
		Object_Definition a = new Object_Definition();
		a.name = "aa";
		a.age = 20;
		a.weight = 55;
		a.add = "Seoul";
		a.print();
		a.printAge();
		System.out.println(a);
		a.printAll();
		System.out.println("==========================================");
		Object_Definition b = new Object_Definition("bb",21,50,"Busan");
		System.out.println(b);
		b.printAll();
		System.out.println("==========================================");
		Object_Definition c = new Object_Definition("cc",22,45,"Chuncheon");
		System.out.println(c);
		c.printAll();
		System.out.println(c.name);
		System.out.println(c.age);
		System.out.println("==========================================");
		c.name = "ccc";
		System.out.println(c.name);
		c.printAll();
	}

}
