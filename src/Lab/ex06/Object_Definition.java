package Lab.ex06;

class Animal
{
	//생성자 - 필드 기본값 입력 / 메서드1 - 필드 모든 값 출력 메서드2 - aLeg + aSpeed 리턴
	String aName, aColor, aCrying; int aleg, aspeed;
	
	Animal(String aName, String aColor, String aCrying, int aleg, int aspeed)
	{
		this.aName = aName;
		this.aColor = aColor;
		this.aCrying = aCrying;
		this.aleg = aleg;
		this.aspeed = aspeed;
	}
	
	void out()
	{
		System.out.println(aName);
		System.out.println(aColor);
		System.out.println(aCrying);
		System.out.println(aleg);
		System.out.println(aspeed);
	}
	
	int abc()
	{
		return aleg+aspeed;
	}
}

public class Object_Definition 
{

	public static void main(String[] args) 
	{
		//객체생성,테스트 - 호랑이, 독수리 사자, 개
		Animal tiger = new Animal("호랑이", "검정무늬 주황색", "어흥", 4, 60);
		Animal eagle = new Animal("흰머리 독수리", "검정색 몸통 흰색 머리 ", "짹짹", 2, 100);
		Animal lion = new Animal("사자", "맑은베이지색", "어흥", 4, 50);
		Animal dog = new Animal("개", "여러가지 색", "멍멍", 4, 50);
		
		System.out.println(tiger.abc());
		System.out.println(eagle.abc());
		System.out.println(lion.abc());
		System.out.println(dog.abc());
		
		tiger.out(); eagle.out(); lion.out(); dog.out();

	}

}
