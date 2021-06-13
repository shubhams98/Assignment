import java.util.*;

public class PyramidTriangle {

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		while(i<n)
		{
			int j=0;
			while(j<(i+1))
			{
				System.out.print("*");
				System.out.print(" ");
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}