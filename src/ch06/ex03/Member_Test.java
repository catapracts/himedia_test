package ch06.ex03;

public class Member_Test {

	public static void main(String[] args) 
	{
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member();
		
		m1.setIdx(1);
		m1.setId("ID001");
		m1.setPw("1111");
		m1.setPhone("010-111-1111");
		m1.setName("aaa");
		m1.setYear(2000);
		m1.setMonth(1);
		m1.setDay(1);
		m1.setAddr("Seoul");
		
		m2.setIdx(2);
		m2.setId("ID002");
		m2.setPw("1112");
		m2.setPhone("010-222-2222");
		m2.setName("bbb");
		m2.setYear(2001);
		m2.setMonth(2);
		m2.setDay(2);
		m2.setAddr("Busan");
		
		m3.setIdx(3);
		m3.setId("ID003");
		m3.setPw("1113");
		m3.setPhone("010-333-3333");
		m3.setName("ccc");
		m3.setYear(2002);
		m3.setMonth(3);
		m3.setDay(3);
		m3.setAddr("Chungju");
		
		m4.setIdx(4);
		m4.setId("ID004");
		m4.setPw("1114");
		m4.setPhone("010-444-4444");
		m4.setName("ddd");
		m4.setYear(2003);
		m4.setMonth(4);
		m4.setDay(4);
		m4.setAddr("Daejeon");
		
		System.out.println(m1.getIdx());
		System.out.println(m1.getId());
		System.out.println(m1.getPw());
		System.out.println(m1.getPhone());
		System.out.println(m1.getName());
		System.out.println(m1.getYear());
		System.out.println(m1.getMonth());
		System.out.println(m1.getDay());
		System.out.println(m1.getAddr());
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		Member[] arr = new Member[10];
		
		arr[0] = m1; arr[1] = m2; arr[2]=m3; arr[3]=m4;
		
		for(int i = 0; i<arr.length; i++)
		{
			Member mm1 = arr[i];
			System.out.println(mm1);
		}
	}   

}
