package string;

public class repetedTrial {

	public static void main(String[] args) {
	
		
		String str1 = "qwertyttrewqqeyu";
		char[] chr = str1.toCharArray();
		int counter =0;
		
		for(int i=0;i<chr.length;i++) {
			counter=0;
			for(int j=0;j<chr.length;j++) {
				if(i>j && chr[i]==chr[j]) {
					break;
				}
				if(chr[i]==chr[j]) {
					counter++;
				}
				
				if(j==chr.length-1) {
					System.out.println("The Charctor "+chr[i]+" is present "+ counter);
				}
			}
			
		}
		
		
	}
	
	
}
