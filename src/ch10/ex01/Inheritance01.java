package ch10.ex01;

public class Inheritance01 {

	public static void main(String[] args) 
	{
		Student s = new Student();		
		s.name = "aaa";
		s.age = 10;
		s.ID = 1;
		s.eat(); s.sleep(); s.goToSchool(); s.stuInfo();
		
		Professor p = new Professor();
		p.name = "bbb";
		p.age = 40;
		p.proid=2;
		p.eat(); p.sleep();p.teach(); 
		
		Worker w = new Worker();
		w.name = "ccc";
		w.age = 30;
		w.wid = 3;
		w.eat(); w.sleep(); w.goToWork();
		
		System.out.println("=================================");
		
		Student s1 = new Student();
		Student s2 = new Student(5);
		System.out.println(s2.name);
		System.out.println(s2.age);
		System.out.println(s2.stName);
		
		System.out.println("=================================");
		
		//자식 객체 생성, 부모 타입으로 지정 - Human, Professor, Child객체가 차례대로 생성됨
		Human ch1 = new Child();
		ch1.name=";";
		ch1.eat();
		
		//다운 캐스팅
		Professor p1 = (Professor)ch1;
		p1.age = 100;
		p1.proid = 11;
		p1.teach();
		
		Child c1 = (Child) ch1;
		c1.chName = "^^";
		c1.name = "???";
		c1.proid = 111;
		c1.chMethod();
		
		//업캐스팅
		Human h = c1;
		
		Human h1 = new Human(); //Human class 존재
		h1.age = 40;
		
		//Error! - Professor p2 = (Professor) h1;
		
		Human h2 = new Professor(); //Human, Professor class 존재
		h2.name = "dddd";
		Professor p2 = (Professor) h2;
		p2.name = "ddddd";
		p2.proid = 1;
		//Error! - Child c2 = (Child) p2;
		
		Child c2 = (p2 instanceof Child) ? (Child)p2 : null;
		System.out.println(c2);
		
		Child c3 = new Child(); //Human, Professor, Child class 존재
		c3.name = "**";
		c3.proid = 111;
		c3.chName = "&&&";
		
		Professor p3 = c3; //업캐스팅
		Human h3 = p3;
		
		Child c4 = (Child) h3;
		c4.age = 11;
		System.out.println(c4.age);
		
		
		
		
		
		
	}

}
