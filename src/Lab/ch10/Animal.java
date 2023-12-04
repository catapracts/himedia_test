package Lab.ch10;

public class Animal 
{
	//최상위 객체
	String habit;
	String shout;
	
	void AnimalInfo(String habit, String shout)
	{
		this.habit = habit;
		this.shout = shout;
		System.out.println("주서식지 : "+habit+", 울음소리 : "+shout);
	}
}
