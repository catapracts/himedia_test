package Lab.ch04;

public class For_Statement2 {

	public static void main(String[] args) 
	{
		//1~19단 각 단 옆으로 출력, 2중 for문 사용, 6,7,12단 제외하고 출력
		
		for(int i = 1; i<=19; i++)
		{
			System.out.println(i+"단\n");
			
			if(i==6||i==7||i==12) continue;
			
			for(int j=1; j<=19; j++)
			{
				System.out.printf("%d*%d = %d\t",i,j,i*j);
			}
		}

	}

}
