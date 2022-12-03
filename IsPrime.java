package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		
		int num = 127;
	 
	    for (int i = 2; i <= num / 2;){
	      // condition for non-prime number
	      if (num % i == 0) 
	      	  {
	    	  System.out.println(num + " is not a prime number");
	    	  break;
	          }
	      else
	      {
	    	  System.out.println(num + " is a prime number."); 
	    	  break;
	      }
	    }

	         

	}

}
