//for loop
//program to print a sentence 10 times
public class ForLoop {

	public static void main(String[] args) {
		//String myVar = "Nothing";
		StringBuilder sb = new StringBuilder (10);
		sb.append("Nothing");
		System.out.println("sb: "+ sb);
		
		//for(int i = 1; i<=10; ++i){
			//System.out.println("sb at Line " + i + " with Value:" + sb);
		//	sb.append("-:" + i);
			//myVar += "-" + i;
		}
		// TODO Auto-generated method stub
		
	}

}
/* OUTPUT
My var at Line 1 with Value:Nothing		// the memory will carry as the first memory can never be access again
My var at Line 2 with Value:Nothing-1
My var at Line 3 with Value:Nothing-1-2
My var at Line 4 with Value:Nothing-1-2-3
My var at Line 5 with Value:Nothing-1-2-3-4
My var at Line 6 with Value:Nothing-1-2-3-4-5
My var at Line 7 with Value:Nothing-1-2-3-4-5-6
My var at Line 8 with Value:Nothing-1-2-3-4-5-6-7
My var at Line 9 with Value:Nothing-1-2-3-4-5-6-7-8
My var at Line 10 with Value:Nothing-1-2-3-4-5-6-7-8-9
*/