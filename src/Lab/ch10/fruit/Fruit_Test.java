package Lab.ch10.fruit;

import java.util.ArrayList;
import java.util.List;

public class Fruit_Test {

	public static void main(String[] args) 
	{
		//자식 객체 생성 후 값 입력(이름, 개수, 가격),  Fruit type으로 진행
		//자식 객체 생성하면서 부모타입으로 지정시, 배열이나 클래스에 동일한 타입으로 저장
		Fruit a = new Apple("사과", 30, 5000);
		Fruit b = new Banana("바나나", 44, 6000);
		Fruit s = new Strawberry("딸기", 55, 7000);
		
		List<Fruit> list = new ArrayList<>();
		list.add(a); list.add(b); list.add(s);
		
		for(int i =0; i<list.size();i++)
		{
			list.get(i).totalPrice();;
		}
		
	}

}
