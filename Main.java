import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Do you wish to order food=> \n if yes then enter 1 \n if no then enter -1");
	    int y=sc.nextInt();
		if(y==1){
		    System.out.println("Do your order");
		    System.out.println("Menu \t"+"Display");
	        System.out.println("1 \t"+"Snack");
	        System.out.println("2 \t"+"Lunch");
	        System.out.println("3 \t"+"Dinner");
	        System.out.println("4 \t"+"Soft drink/Tea coffee");
	        System.out.println();
	        System.out.println("\t.........................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............................");
	        System.out.println();
	        System.out.println("To order Snack, Enter 1");
		    System.out.println("To order Lunch, Enter 2");
		    System.out.println("To order Dinner, Enter 3");
		    System.out.println("To order Soft Drink/Tea coffee, Enter 4");
		    System.out.println();
		    System.out.println("\t.........................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............................");
		    System.out.println();
	        System.out.println("\t\t\t\tClick on the number for order");
	        System.out.println("\t\t\t\t.............................");
	        int choice=sc.nextInt();
	        System.out.println();
		    menu(choice);
		}
		else{
		    System.out.println("Thank You for Visiting.");
		}
	}
	public static void menu(int choice){
	    
	    
	    switch(choice){
	        case 1:
	            System.out.println("You get:");
	            snackmenu();
	            break;
	        case 2:
	            System.out.println("You get:");
	            lunchmenu();
	            break;
	        case 3:
	            System.out.println("You get:");
	            dinnermenu();
	            break;
	        case 4:
	            System.out.println("You get:");
	            drinkmenu();
	            break;
	            
	    }
	    
	    
	}
	public static void snackmenu(){
	    System.out.println("\t.........................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............................");
	    System.out.println("Snacks Id"+"\tItems"+"\tQty"+"\tPrice");
	    System.out.println("1"+"\tIdli"+"\t1"+"\t40");
	    System.out.println("2"+"\tDosa"+"\t1"+"\t50");
	    System.out.println("3"+"\tUttapam"+"\t1"+"\t30");
	    System.out.println("4"+"\tPoha/Upma"+"\t1"+"\t20");
	    snackbill();
	}
	public static void lunchmenu(){
	    System.out.println("\t.........................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............................");
	    System.out.println("Food id"+"\tItems"+"\tQty"+"\tPrice");
	    System.out.println("1"+"\tIdli"+"\t1"+"\t40");
	    System.out.println("2"+"\tDosa"+"\t1"+"\t50");
	    System.out.println("3"+"\tUttapam"+"\t1"+"\t30");
	    System.out.println("4"+"\tPoha/Upma"+"\t1"+"\t20");
	    System.out.println("Closed");
	    
	}
	public static void dinnermenu(){
	    System.out.println("\t.........................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............................");
	    System.out.println("Food Id"+"\tItems"+"\tQty"+"\tPrice");
	    System.out.println("1"+"\tIdli"+"\t1"+"\t40");
	    System.out.println("2"+"\tDosa"+"\t1"+"\t50");
	    System.out.println("3"+"\tUttapam"+"\t1"+"\t30");
	    System.out.println("4"+"\tPoha/Upma"+"\t1"+"\t20");
	    System.out.println("Closed");
	    
	}
	public static void drinkmenu(){
	    System.out.println("\t.........................>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............................");
	    System.out.println("Food Id"+"\tItems"+"\tQty"+"\tPrice");
	    System.out.println("1"+"\tIdli"+"\t1"+"\t40");
	    System.out.println("2"+"\tDosa"+"\t1"+"\t50");
	    System.out.println("3"+"\tUttapam"+"\t1"+"\t30");
	    System.out.println("4"+"\tPoha/Upma"+"\t1"+"\t20");
	    System.out.println("Closed");
	}
	public static void snackbill(){
	    Scanner p=new Scanner(System.in);
	    List<Integer> id=new ArrayList<Integer>();
	    List<Integer> qty=new ArrayList<Integer>();
	    //List<Integer> price=new ArrayList<Integer>();
	    int[] price={40,50,30,20};
	    int bill=0;
	    boolean y=true;
	        while(y==true){
	                System.out.print("enter the Snacks id you want to order=> ");
	                int idd=p.nextInt();
	                id.add(idd);
	                System.out.println();
	                System.out.print("enter the Quantity=> ");
	                int qtyy=p.nextInt();
	                qty.add(qtyy);
	                System.out.println();
	                System.out.println("to order others items press 1 else 0");
	                int a=p.nextInt();
	                if(a==1){
	                    y=true;
	                }
	                else{y=false;}
	            }
	             System.out.println("id ="+id);
	         System.out.println("qty"+qty);
	         int i=0;
	            while(i<id.size()){
	                bill=bill+qty.get(i)*price[id.get(i)-1];
	                i++;
	            }
	        
	        
	        
	        System.out.println("........................|||||||||||||||||||||||||||||||||||...................................");
	       
	         System.out.println("Your total bill ="+bill);
	         
	    }
}