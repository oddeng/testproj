/**
 * 
 */
import java.util.Calendar;
import java.util.Date;
/**
 * @author User
 *
 */
public class UtilTestExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			      // create a calendar
			      Calendar cal = Calendar.getInstance();

			      // print current time
			      System.out.println("Current year is :" + cal.getTime());

			      // set the year,month and day to something else
			      cal.set(1993, 5, 29);

			      // print the result
			      System.out.println("Altered year is :" + cal.getTime()); 
		
		

	}

}
