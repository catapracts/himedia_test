package Lab.ch10.fruit;

public class Apple extends Fruit
{
	Apple(){}
	Apple(String name, int cnt, int price)
	{
		super();
		super.name = name;
		super.cnt = cnt;
		super.price = price;
	}
	
	@Override
	void totalPrice() 
	{
		System.out.println(super.name+"의 전체 가격은 : "+(super.cnt*super.price)+"입니다.");
	}
}
