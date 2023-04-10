package bddSdet36L1.genericUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {
	public static String readDataFromPropertyFile(String key) throws Throwable {
		FileInputStream file=new FileInputStream(".\\src\\test\\resources\\property.properties");
		Properties properties = new Properties();
		properties.load(file);
		String value = properties.getProperty(key);
		return value;
		//System.out.println(value);
	}

	//public static String readDataFromPropertyFile(String key) {
		// TODO Auto-generated method stub
		//return null;
//	}

}
