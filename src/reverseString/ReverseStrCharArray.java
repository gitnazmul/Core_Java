package reverseString;
/*
 * Following another example shows how to reverse a String 
 * after taking it from command line argument
 */

public class ReverseStrCharArray {

	public static void main(String[] args) {
		
		  String input = "Force 10 ";
		  
	      char[] try1 = input.toCharArray();
	      
	      for (int i = try1.length-1;i >= 0; i--) System.out.print(try1[i]);
	}

}
