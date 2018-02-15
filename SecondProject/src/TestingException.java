/**
 * 
 */

/**
 * @author User
 *
 */
public class TestingException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String name = args[0];
			System.out.println("Your name is:" + name);

			if (!(name.startsWith("M"))) {
				throw new Exception("Exception: Name should start with M");

			}
			System.out.println("Name printed..");

		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(
					"Please provide your name as Command Line parameter. eg: java TestingExceptions <Your Name>");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

		System.out.println("I am done...");
	}

}
