package Lab.ch10;

public class InheritanceTest {

	public static void main(String[] args) 
	{
		//상속 설정 후 필드 메소드 생성 / casting test(up, down)
		Dog d = new Dog();
		Lion l = new Lion();
		TigerChild tl = new TigerChild();
		Tiger t = new Tiger();
		
		d.AnimalInfo(d.habit, d.shout);
		d.dInfo();
		
		l.AnimalInfo(l.habit, l.shout);
		l.lInfo();
		
		tl.AnimalInfo(tl.habit, tl.shout);
		tl.tcInfo();
		
		t.AnimalInfo(t.habit, t.shout);
		t.tInfo();
		
		System.out.println("===========================================");
		
		Tiger tl1 = (Tiger) tl;
		tl.tInfo();
		Animal tl2 = (Animal) tl1;
		tl2.AnimalInfo(tl.habit, tl.shout);

	}

}
