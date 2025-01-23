//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayStats
{
	private int[] array;
	
	public ArrayStats(String list)
	{
		setArray(list);
	}	
	
	public void setArray(String list)
	{
		if(list.length() % 2 == 0)
		{
			array = new int[list.length()/2];
		}
		else{
			array= new int[list.length()/2+1];
		}

		int index = 0;
		Scanner c = new Scanner(list);
		while(c.hasNextInt())
		{
			array[index] = c.nextInt();
			index++;
		}
	}
	
			
	public int getNumGroupsOfSize(int size)
	{
		int count = 0;
		int current = array[0];
		int num = 0;
		int i = 0;

		for(i = 0; i < array.length; i++)
		{
			if(current == array[i])
			{
				count++;
			}
			else if(array[i] != current && count < size)
			{
				num++;
				count = 1;
				current = array[i];
			}
			else if(count >= size)
			{
				num++;
			}
		}

		return num;
	}
	
	public String toString()
	{
		return "return the array as a string";
	}
}
