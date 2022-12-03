package week1.day1;

public class FibbinocciSeries {

	public static void main(String[] args) {
	    int n = 13, firstNum = 0, secNum = 1;


	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; i++) {
	    System.out.print(firstNum + ", ");

	      // compute the sum
	      
	    int sum = firstNum + secNum;
	    firstNum = secNum;
	    secNum = sum;
	    }

	}

}
