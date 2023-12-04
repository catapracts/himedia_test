package Lab.ch10.car;

import java.util.ArrayList;
import java.util.List;

public class Car_Test {

	public static void main(String[] args) 
	{
		//자식 객체 생성하면서 부모타입으로 지정 후 오버라이팅된 애들 출력
		Car c = new Car();
		c.run();
		
		Hcar h = new Hcar();
		h.run();
		
		SScar ss = new SScar();
		ss.run();
		
		Kcar k = new Kcar();
		k.run();
		
		System.out.println("=======================");
		
		Car c1 = new Hcar();
		c1.run();
		
		Car c2 = new SScar();
		c2.run();
		
		Car c3 = new Kcar();
		c3.run();
		
		System.out.println("=======================");
		
		List<Car> aList = new ArrayList<>();
		aList.add(c1); aList.add(c2); aList.add(c3);
		for(int i = 0; i<aList.size();i++)
		{
			System.out.println(aList.get(i));
			aList.get(i).run();
		}
		
		

	}

}
