/* create String Builder with "iam Studying Java"
 * print first 3 character
 * print last 3 character
 * Extract Studying and print
 */
public class MyStringBuilder {// nama class takleh sama ngn nama method.

	public static void main(String[] args) {
	
		//(method 1)StringBuilder sb = new StringBuilder ("I am Studying Java");
		StringBuilder sb = new StringBuilder (args[0]);//do dynamically
		String constant = "Studying";
		
		//initializing the StringBuilder class with string passed via command link
		
		System.out.println("Given String:" + sb + " with length:" + sb.length());
		System.out.println("First Three character:" + sb.substring(0,3));
		System.out.println("Last Three character:" + sb.substring((sb.length()-3)));
		int startOfConstant = sb.indexOf(constant);
		int endOfConstant = startOfConstant + constant.length();
		System.out.println("Print Studying:" + sb.substring(startOfConstant,endOfConstant));
		
		
		//insert <_ space your name> after "am"
		sb.insert((sb.indexOf("am")+2)," Shuhada" );
		System.out.println("After insert:" + sb);
		
		sb.delete(sb.indexOf("am"),sb.indexOf("am")+2);
		System.out.println("After delete:" + sb);
		
		//reverse
		System.out.println("Reverse:" + sb.reverse());
		
		//equality
		StringBuilder sb2 = new StringBuilder (args[0]);
		System.out.println(sb == sb2);
		StringBuilder sb3 = (sb.insert((sb.indexOf("am")+2), "Shuhada"));
		System.out.println(sb == sb3);
		
		
		
		
		sb = null;//set null so that the javium will know that this is no longer used.
	//	sb2 = null;
	//	sb3 = null;
		
		System.out.println("sb:" + sb);
		System.out.println("sb3:" + sb3);
		
		
		// TODO Auto-generated method stub

	}

}
