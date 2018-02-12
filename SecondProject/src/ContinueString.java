/**
 * 
 */

/**
 * @author User
 *
 */
public class ContinueString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "    This is my text   ";
		//text = text.trim();//this will trim the white space in the text
		String oldtext = args [0];
		String replace = args[1];
		
		System.out.println("Original Text:" + text);
		//System.out.println("Replaced Text:" + text.replace(oldtext, replace));
		System.out.println("Replaced Text:" + text.trim().replace(oldtext, replace).toUpperCase());//this is method chaining(combining)
		
		

	}

}
