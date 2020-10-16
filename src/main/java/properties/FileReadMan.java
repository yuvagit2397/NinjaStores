package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class FileReadMan {
	public static Properties property;
	
	public FileReadMan() {
		
	}
	
	public static String getUrl() throws IOException {
		getProp();
		String url=property.getProperty("url");
		System.out.println(url);
		return url;
	}
	
	
	public static Properties getProp() throws IOException {
		String propLoc="D:\\yuvasri_revision\\TheNinjaStores\\src\\main\\java\\properties\\ninja.properties";
		FileInputStream fin=new FileInputStream(propLoc);
		property=new Properties();
		property.load(fin);
		return property;
		
	}
	
	public static void main(String[] args) throws IOException {
		getUrl();
	}

}
