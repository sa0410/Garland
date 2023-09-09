package externalFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import excel.Cal;


public class Read {

	public static void main(String[] args) {
		
	//	writeFile("data/xyz"+Cal.getDate()+ ".txt");
	//	writeFile("data/etc"+Cal.getDate()+ ".html");
		writeFile("data/GT"+Cal.getDate()+ ".csv");
	}
		
	public static void writeFile(String path) {
		
		//============================c s v================================
		try {
			File f = new File(path);
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Student,subject,great");
			bw.newLine();
			bw.write("Sabbir,Java,99");
			bw.newLine();
			bw.write("Bushra,RN,99");
			bw.newLine();
			bw.write("Shawn,Construction,75");
		

			bw.close();
			System.out.println("Done!");
		
			}
		catch(Exception e) {
			e.printStackTrace();
			}
		
	//========================== h t m l =================
		
		
//		try {
//			File f = new File(path);
//			FileWriter fw = new FileWriter(f);
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			bw.write("<html>");
//			bw.newLine();
//			bw.write("<head> <tittle>SB</tittle></head>");
//			bw.newLine();
//			bw.write("<body bgcolor=\"red\"><h1>Sabbir Corporation ltd<h1></body>");
//			bw.newLine();
//			bw.write("</html>");
//		
//
//			bw.close();
//			System.out.println("Done!");
//		
//			}
//		catch(Exception e) {
//			e.printStackTrace();
//			}
	
		//===============================write==========================
//		try {
//			File f = new File(path);
//			FileWriter fw = new FileWriter(f);
//			BufferedWriter bw = new BufferedWriter(fw);
//			
//			bw.write("how are you");
//			bw.newLine();
//			bw.write("How old are you?");
//			bw.newLine();
//			bw.write("Where you coming from");
//			bw.newLine();
//			bw.write("what is your first language?");
//			bw.newLine();
//			bw.write("How far do you live");
//			bw.newLine();
//			bw.write("Nice to meet you");
//			
//			
//			bw.close();
//			System.out.println("Done!");
//			
//			
//			}
//		catch(Exception e) {
//			e.printStackTrace();
//			}
//	}
	
}
}
