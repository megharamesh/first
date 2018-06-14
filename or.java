package packagenew;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class or {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties 	prop = new Properties();
		FileInputStream ip = new FileInputStream("/Users/Megha/eclipse-workspace/project/src/packagenew/m properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		

		
		

	}

}
