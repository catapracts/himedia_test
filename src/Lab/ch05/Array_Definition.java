package Lab.ch05;

public class Array_Definition {

	public static void main(String[] args) 
	{
		/*
		 array name = arr / index = 1000 / 각 방에 3의 배수 저장, 각 방의 내용 출력 
		 */
		
		
		/*처음부터 3씩 넣기.... 어떻게 하지? 3의 배수 넣는건 성공
		int arr[] = new int[1000];
		
		for(int i = 0, j=0; i<arr.length; i++)
		{
			j++;
			if(j%3==0) {arr[i] = j;}
			else continue;
		}
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		*/
		int arr[] = new int[1000];
		System.out.println(arr.length);
		
		String arr1[] = new String[10];
		System.out.println(arr1.length);
		arr1[0] = "JAVA";
		arr1[1] = "HTML";
		
		for(int i = 0, j = 3; i<arr.length;i++)
		{
			arr[i] = j; j+=3;
		}
		
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
