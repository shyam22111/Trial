package string;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
          String s = "abcxyzpqrabcmnqabc";
          String s1 ="";
          boolean b = false;
          
          for(int i=0;i<s.length();i++) {
        	  for(int j=0;j<s1.length();j++) {
        		  if(s.charAt(i)==s1.charAt(j)) {
        			  b=true;
        			  break;
        		  }
        	  }
        		  if(b==false) {
        			 s1=s1+s.charAt(i);
        		  }  
        	  }
          System.out.println(s1);
          }   
          
	}
