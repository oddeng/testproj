/**
 * 
 */

/**
 * @author User
 *
 */
public class TestString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		/*
		int first = 1;
			int second =2;
			int third = 3;
			String fourth ="C";
			String fifth ="C";
			String sixth = new String ("C");
			
			
			
			if(fourth ==fifth)
				System.out.println("fourth and fifth is same:" + fourth);//OUTPUT: fourth and fifth is same:C
																		//fourth and sixth are not the same:
			
			if(fourth ==sixth)
				System.out.println("fourth and sixth is same:" + fourth);
			
			else
				System.out.println("fourth and sixth are not the same:" );
			/*
			System.out.println("Now fourth is: " + fourth);
			
			fourth = third + fourth;
			System.out.println("Now fourth is: " + fourth);//bcoz 3c is never change  
			
			fourth =second + fourth;
			System.out.println("Now fourth is: " + fourth);
			
			fourth =(String.valueOf(first)).concat(fourth);
			System.out.println("Now fourth is: " + fourth);
			//System.out.println(1+(2+(3+"c")));
			 
			 */
		
			/*
			  String sms = "Selamat Datang ke Malaysia !!";
			  
			System.out.println("SMS Size is :" + sms.length());// is a method inside the class
			System.out.println("Text at 10th position / 9 index :" + sms.charAt(9));// this method to identify character at certain position
			
			System.out.println("Index of the text:" + sms.indexOf("!"));//this method is to identify the character at which index
			System.out.println("Substring of 0-10:" + sms.substring(0,21));//this method to show the character up to the Xth index
			
			
			System.out.println("lower :"  + sms.toLowerCase());
			System.out.println("UPPER :"  + sms.toUpperCase());
			
			*/
			
			String country = "malaysia";
			String userCountry = args[0].toLowerCase();
			//if (country.equals(args[0])) 
			{
			if(country.equalsIgnoreCase(args[0]));{
				System.out.println("Country is Malaysia :");
			}
			{
			else
				System.out.println("Country is not Malaysia but :" + args[0]);
			
		}
	}
	
			
			
			
			
			
			
			
	

