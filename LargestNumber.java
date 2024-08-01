package NDemo;

import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=scanner.nextInt();
        int largest=Integer.MIN_VALUE;
        System.out.println("Enter the no. :");
        for(int i=0;i<n;i++)
        {
        	int num=scanner.nextInt();
        	if(num>largest)
        	{
        		largest = num;
        	}
        }
        System.out.println("Largest no. is: "+ largest);
        scanner.close();
	}

}
