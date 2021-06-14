package world;
import java.util.*;
import java.util.Scanner;

public class array2 {
	public static void main(String args[])
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("enter the details  of students ");
		String arrn[]=new String[4];
		int arr1[]=new int[4];
		int arr2[]=new int[4];
		int arr3[]=new int[4];
		int arr4[]=new int[4];
		int arrtot[]=new int[4];
		int sum=0;
		System.out.println("Enter the name of students");
		for(int i=0;i<4;i++)
		{
			
			arrn[i]= kb.next();
			
		}
		System.out.println("enter the marks of student 1");
		for(int j=0;j<4;j++)
		{
			arr1[j]=kb.nextInt();
			sum=sum+arr1[j];
			arrtot[0]=sum;
		}
		System.out.println("enter the marks of student 2");
		for(int j=0;j<4;j++)
		{
					
			arr2[j]=kb.nextInt();
			sum=sum+arr2[j];
			arrtot[1]=sum;
			
		}
		System.out.println("enter the marks of student 3");
		for(int j=0;j<4;j++)
		{
			arr3[j]=kb.nextInt();
			sum=sum+arr3[j];
			arrtot[2]=sum;
		}
		System.out.println("enter the marks of student 4");
		for(int j=0;j<4;j++)
		{
			
			
			arr4[j]=kb.nextInt();
			sum= sum+arr4[j];
			arrtot[3]=sum;
		}
		for(int i=0;i<4;i++)
		{
			System.out.println("the total marks of"+" "+arrn[i]+" "+"is"+" "+arrtot[i]);
		}
	}
	}