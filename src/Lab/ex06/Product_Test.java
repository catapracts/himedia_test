package Lab.ex06;

public class Product_Test {

	public static void main(String[] args) 
	{
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		
		//set이용 값 넣기 / 배열 만들기 index = 10 product 변수 에 넣고 객체 출력
		p1.setIdx(1);
		p1.setProColor("red");
		p1.setProName("a");
		p1.setQty(1);
		p1.setYear(2000);
		
		p2.setIdx(2);
		p2.setProColor("blue");
		p2.setProName("b");
		p2.setQty(2);
		p2.setYear(2001);
		
		p3.setIdx(3);
		p3.setProColor("green");
		p3.setProName("c");
		p3.setQty(3);
		p3.setYear(2002);
		
		p4.setIdx(4);
		p4.setProColor("Yellow");
		p4.setProName("d");
		p4.setQty(4);
		p4.setYear(2003);
		
		Product arr[] = new Product[10];
		
		arr[0] = p1; arr[1] = p2; arr[2] = p3; arr[3] = p4;
		
		for(int i = 0; i<arr.length; i++)
		{
			if(arr[i] !=null)
			{
				Product pro = arr[i];
				System.out.println(pro);
			}
			
		}
	}

}
