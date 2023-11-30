package ch07.ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList01 
{

	public static void main(String[] args) 
	{
		String[] arr = new String[] {"가","나","다","라","마","바","사"};
		
		for(int  i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]+",");
		}
		
		arr[2] = null; arr[3]=null;
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		System.out.println("==============================================");
		
		List<String> aList = new ArrayList<String>();
		List<String> aList1 = new ArrayList();
		ArrayList<String> aList2 = new ArrayList();
		
		System.out.println(aList.size());
		aList.add("AA");
		System.out.println(aList.size());
		System.out.println(aList);
		aList.add("BB"); aList.add("CC"); aList.add("DD"); aList.add("EE"); aList.add("FF"); aList.add("GG");
		System.out.println(aList.size());
		System.out.println(aList);
		aList.add(3, "BYE");
		System.out.println(aList.size());
		System.out.println(aList);
		aList.remove(3);
		System.out.println(aList.size());
		System.out.println(aList);
		aList.remove("DD");
		System.out.println(aList.size());
		System.out.println(aList);
		
		for(int i = 0; i<aList.size();i++)
		{
			System.out.println(aList.get(i));
		}
		
		System.out.println("==============================================");
		
		List<Integer> aList4 = new ArrayList<>();
		
		for(int i = 0, j = 1; i<100; i++)
		{
			j+=10;
			aList4.add(j);
		}
		
		for(int i = 0; i<aList4.size();i++)
		{
			System.out.println(aList4.get(i));
		}
	}

}
