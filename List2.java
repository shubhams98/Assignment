import java.util.*;
public class List2 {

	static List<String> getArrayList(String[] str)
	{
		List l1 = Arrays.asList(str);
		Collections.sort(l1);
		return l1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[] {"Shubham", "Sharma", "Rahul","Sneha","Himanshu","Cap"};
		System.out.println(getArrayList(str));

	}

}