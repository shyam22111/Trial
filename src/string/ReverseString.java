package string;
public class ReverseString {

	public static void main(String[] args) {
		String s = "Shyam";
		String Rev= "";
		for(int i=s.length()-1;i>=0;i--) {
			Rev=Rev+s.charAt(i);
		}  System.out.println(Rev);
          
		Reverse("Ramchandra");
	    name();
	}


	
	public static void Reverse(String str) {
		String rev1 ="";
		for(int j=str.length()-1;j>=0;j--) {
			rev1=rev1+str.charAt(j);
		}
		System.out.println(rev1);
		
	}
	// by using inbuilt method String Buffer class 
	public static void name() {
		
	  StringBuffer bf= new StringBuffer("Narwade"); 
	  StringBuffer RS = bf.reverse();
	  System.out.println(RS);
	  
	}
}
