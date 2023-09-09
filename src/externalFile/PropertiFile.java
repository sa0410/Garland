package externalFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class PropertiFile {

	public static void main(String[] args) {
		//System.out.println(getPropertiesFile("C:\\Users\\subby\\OneDrive\\Desktop\\QA FS\\Session9\\data\\test.properties","password" ));
		//readFile("C:\\Users\\subby\\OneDrive\\Desktop\\QA FS\\Session9\\data\\abc.txt");
		
		//System.out.println(readFile("data\\abc.txt"));
		System.out.println(readFile("data\\abc.txt").size()); //ques: give me 3rd line?<<<<<<<<<<<<<<<
		System.out.println(readFile("data\\abc.txt").get(2));
		
	}
	//==================================write write write=============================================//
	
//	public static void writeTextFile(String path) {
//		try {
//			File f = new File(path);
//			FileWriter fw = new FileWriter(f);
//			BufferedWriter bw = new BufferedWriter(fw);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	
	//==================================read read read=============================================//
		public static List<String> readFile(String path) {          //3rd modify list<String>
			List<String>myList=new ArrayList<String>();   //1st add
			try {
				File f =new File(path);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				String line = null;
				
				 while((line = br.readLine())!=null) {
					myList.add(line);                      //2nd add 
					 //System.out.println(line);
				}
				 return myList;                            //4th add return
			}
			
			catch(Exception e) {
				e.printStackTrace();
				return null;                              //5th add
				//System.out.println("somthing is missing");
			}
		}
	
	
		//==================================properties properties properties=============================================//
	
		public static String getPropertiesFile(String path, String key) {
		try {
			File f =new File(path);
			FileInputStream fi = new FileInputStream(f);
			
			Properties prop = new Properties();
			prop.load(fi);
			
			return (String)prop.getProperty(key);
			}
		catch(IOException e){
			e.printStackTrace();
			return "somthing wrong into the path";
		}
		
	}
}
