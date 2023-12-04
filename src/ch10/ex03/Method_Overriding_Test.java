package ch10.ex03;

public class Method_Overriding_Test {

	public static void main(String[] args) 
	{
		Animal a1 = new Animal();
		a1.name = "aa";
		a1.age = 10;
		a1.color = "RED";
		a1.eat();
		Animal.color = "Blue";
		Animal a2 = new Animal();
		a2.cry();
		
		System.out.println("===================");
		
		Animal a3 = new Dog();
		a3.cry();
		
		Animal a4 = new Eagle();
		a4.cry();
		
		Animal a5 = new Lion();
		a5.cry();
	}

}
