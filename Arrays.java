import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        System.out.println("Enter the list:");
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array is:");
        for(int j = 0; j<n; j++)
        {
            System.out.println(arr[j]);
        }
    }
}
