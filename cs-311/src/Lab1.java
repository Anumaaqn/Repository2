
import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cmd, a;
		Integer[] jagsaalt = new Integer[10];
		LinearList<Integer> array = new LinearList<Integer>();
		/*array.add(jagsaalt, 1);
		array.add(jagsaalt, 5);
		array.add(jagsaalt, 6);
		array.add(jagsaalt, 4);
		array.add(jagsaalt, 10);*/
		try {
			  System.out.println("1.is empty?");
			  System.out.println("2.Jagsaaltiin urt?");
			  System.out.println("3.Jagsaaltand utga nemeh");
			  System.out.println("4.Jagsaaltiin utguudiig harah");
			  System.out.println("5.Jagsaaltaas element ustgah");
			  System.out.println("6.Jagsaaltaas elementeer utga haih");
			  System.out.println("6.Jagsaaltaas elementeer utga haih");

			  System.out.println("Ta commandaa oruulna");
		      cmd=scan.nextInt();
		      while(cmd!=0) {
		    	  switch(cmd) {
		    	  case 1:
		    		  if(array.isEmpty()) {
		    			  System.out.println("Jagsaalt hooson baina.");
		    		  }
		    		  else {
		    			  System.out.println("Jagsaalt hooson bish baina.");
		    		  }
		    		  break;
		    	  case 2:
		    		  int size;
		    		  size = array.size();
		    		  System.out.println("urt:" + size);
		    		  break;
		    	   case 3:	  
		    		   System.out.print("Utga nemeh :");
			    	   a=scan.nextInt();
			    	   array.add(jagsaalt, a);
			    	   
			    	   System.out.println("nemegdlee.");
			    	   break;
		    	   case 4:
		    		   array.toString(jagsaalt);
		    		   break;
		    	   case 5:
		    		   if(array.isEmpty()) {
		    		   int i;
		    		   System.out.println("Hasah utgiin dugaaraa oruulna uu? :");
		    		   i = scan.nextInt();
		    		   array.remove(jagsaalt, i);
		    		   }
		    		   else 
		    			   System.out.println("Jagsaalt hoosn uciraas utga ustgah bolomjgvi baina");
		    		   break;
		    	   
		    	   case 6:
		    		   int k;
		    		   System.out.println("Elementiin utgaa oruulna uu : ");
		    		   k = scan.nextInt();
		    		   System.out.println("Oruulsan elementiin index ni : " + array.getIndex(jagsaalt, k));
		    		   break;
		    	   
		    		default:
		    		   System.out.println("1-7 r commanduudaas songono uu!");
		    		
		    	  }
		    	  System.out.print("\nDahin comand oruulna uu? :");
		    	   cmd=scan.nextInt();
		      }
		      }
		      catch(Exception e) {
		    	  System.out.println("Aldaa!");
		      }

	}
}