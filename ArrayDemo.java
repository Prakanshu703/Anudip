package NDemo;

import java.util.Scanner;
public class ArrayDemo 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the no. of elements:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("enter the no. :");
        for(int i=0;i<n;i++)
        {
        	numbers[i] = scanner.nextInt();
        }
        	int sum=0;
        	System.out.println("Even no.");
        	for(int num : numbers)
        	{
        		if(num%2==0)
        		{
        			System.out.println(num+ "");
        			sum+=num;
        		}
        	}
        	System.out.println("sum of even numbers is : " + sum);
            scanner.close();       
        }

	}

