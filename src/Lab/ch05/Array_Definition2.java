package Lab.ch05;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Definition2 {

	public static void main(String[] args) 
	{
		/*
		 String type Array / Index = 6 / arr[0] = "java", arr[1] = "HTML", arr[2] = "CSS" arr[3] = "JavaScript", arr[4] = "Oracle", arr[5] = "Spring"
		 Output Method 4
		 */
		
		Scanner sc = new Scanner(System.in);
		int selectNum;
		
		String [] arr = new String[6];
		arr[0] = "Java"; arr[1] = "HTML"; arr[2] = "CSS"; arr[3] = "JavaScript"; arr[4] = "Oracle"; arr[5] = "Spring";
		
		do {
			System.out.println("=======================================");
			System.out.println("1. output1 : directly 2. output2 : use for 3. output3 : use enhanced for 4. output4 : use Arrays.toString(arr) 5. quit");
			System.out.println("=======================================\n");
			
			selectNum = sc.nextInt();
			if(selectNum==1) 
			{
				System.out.println("output1 : directly");
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);
				System.out.println(arr[5]);	
			}
			
			else if(selectNum==2) 
			{
				System.out.println("output2 : use for");
				for(int i = 0; i< arr.length; i++)
				{
					System.out.println(arr[i]);
				}
			}
			
			else if(selectNum==3) 
			{
				System.out.println("output3 : use enhanced for");
				for(String i : arr)
				{
					System.out.println(i);
				}
			}
			
			else if(selectNum==4) 
			{
				System.out.println("output4 : use Arrays.toString(arr)");
				System.out.println(Arrays.toString(arr));
			}
			
			else 
			{System.out.println("quit"); 
			break;
			}
			
		}while(true);
		
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[5]);		
		
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("");
		
		for(int i = 0; i< arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("");
		
		for(String i : arr)
		{
			System.out.println(i);
		}
		
		System.out.println("");
		System.out.println("=======================================");
		System.out.println("");
		
		System.out.println(Arrays.toString(arr));
		*/
	}

}
