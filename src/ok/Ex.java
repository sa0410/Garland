package ok;

public class Ex {

	public static void main(String[] args) {
		//print a b c d all the way to j how you do that?
		//use ASCII number we can do that
		

		for(int i=97;i<97+10;i++) {
			
			
			if(i==106) {       //97+10= 107-1= 106 here this calculation very important other wise , depareted isse will be mix up.
				System.out.print((char)i);
			}
			else {
				System.out.print((char)i+", ");
			}
		}

	}

}
