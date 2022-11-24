package string;

public class repetedSingleCharctorInString {

	public static void main(String[] args) {
		String str= "bhgabxbsjsssdbcjbvs";
        int count =0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)== 's') {
				count=count+1;
			}
			
		}System.out.println(count);
		
		
	}

}






