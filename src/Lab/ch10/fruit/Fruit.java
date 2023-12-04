package Lab.ch10.fruit;

public class Fruit 
{
	String name; //과일 이름
	int cnt; //과일 개수
	int price; //과일 가격
	
	void totalPrice()
	{
		System.out.println("과일 전체 가격은 : "+(cnt*price));
	}
	
	
	
	
}
