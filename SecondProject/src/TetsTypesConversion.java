/**
 * 
 */

/**
 * @author User
 *
 */
public class TetsTypesConversion {

	/**
	 * @param args
	 */
	//wrapper classes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Accept a double from command line
			Double salaryDbl = new Double(args[0]);
			if(salaryDbl.isNan(args[0]) {
				System.out.println("Salary is not valid:" + salaryDbl);
			}else {
	
			double salary = salaryDbl.doubleValue();//(this command akn convert String value to double
		
			String salaryStr = String.valueOf(salary);// (this command akn assign String to salary 
		
			System.out.println(salaryStr);
		}

	}
}


