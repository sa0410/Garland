package excel;

public class Count {

	public static void main(String[] args) {
		
		countDup("sabbir",'a');
		
	}
	
	public static void countDup(String str, char c) {
		
		              char[]x = str.toCharArray();
		             
		              int count=0;
		              for( char item:x ) {
		            	  if(item==c) {
		            		  count++;
		            	  }
		              }
		System.out.println(count);
	}

}
