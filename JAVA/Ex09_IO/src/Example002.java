import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Arrays;

import kr.or.bit.UserInfo;

public class Example002 {

	public static void main(String[] args) {

	String filename = "UserData.txt";
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	ObjectInputStream in = null;
	
	try {
		fis = new FileInputStream(filename);
		bis = new BufferedInputStream(fis);
		in = new ObjectInputStream(bis);
		
		Object obj = null;
		while((obj = in.readObject()) != null) {
			System.out.println(obj.toString());
		}
		
		
//		
//		Object obj = null;
//		while((obj = in.readObject()) != null) {
//			System.out.println(obj.toString());
//		}
		
		
		
		
	} catch(Exception e) {
		
	} finally {
		try {
			
			in.close();
			bis.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
		
		
	}
}
