package string;

public class StringDuplicate {
	
	public static void main(String[] args) {
		
	 String S = "sdfghjshdgfhjsdhfg";
	 int count=0;
	 
	    char[] CA = S.toCharArray();
	    for(int i= 0; i<CA.length; i++ ) {
	    	count=0;
	    	for(int j=0;j<CA.length;j++) {
	    		if(CA[j]==CA[i] && j==i) {
	    			
					break;
	    		}
	    			
	    			if(CA[i]==CA[j]) {
	    				count++;
	    		
	    		} 
	    			if(j==CA.length-1) {
	    				System.out.println("the charctor "+CA[i]+" present "+count+" times");
	    			}
	    				
	    	}
	    	
	    	
	    }    
	 
	    
	}
}