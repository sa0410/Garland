package excel;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
public class R {

	public static void main(String[] args) {

		Set<Integer>myData=new TreeSet<Integer>();

		while(myData.size()<300) {
			myData.add(printRandomNumbers());	
		}
		
		System.out.println("Total Random number: "+myData.size());
		System.out.println();
		System.out.println(myData);
		}
	
	
	public static int printRandomNumbers(){
		
		Random random=new Random();
			int randomnumber=random.nextInt(500)+100;
			return randomnumber;
			
		}

	}


