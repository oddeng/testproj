import java.util.Scanner;
/**
 * 
 */

/**
 * @author User
 *
 */
public class AddNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x,y,z;
		
		System.out.println("Enter two integers to calculate their sum");
		Scanner Num = new Scanner(System.in);
		x = Num.nextInt();
		y = Num.nextInt();
		z = x+y;
		
		
		System.out.println("Sum of integers = " + z);
		
	}

	
}
