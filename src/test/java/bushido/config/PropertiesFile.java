package bushido.config;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile {
	
	public static Properties prop = new Properties();
	
	public static void readproperties() {
		
		try {
			FileInputStream input = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/bushido/config/PropertiesFile.java");
			prop.load(input);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static String devurl() {
		String developmenturl="";
		try {
		//	String filePath=System.getProperty("user.dir")+"/src/test/java/bushido/config/dev.properties");
			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+"/src/test/java/bushido/config/dev.properties");
			//FileInputStream file = new FileInputStream(filePath);
			prop.load(input );
			prop.getProperty("dev");
			developmenturl=prop.getProperty("dev");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		return developmenturl;
	}
	
	public static String liveurl() {
	    String liveurl = "";
	    try {
	        String filePath = System.getProperty("user.dir") + "/src/test/java/bushido/config/live.properties";

	        FileInputStream file = new FileInputStream(filePath);
	        prop.load(file);
	        liveurl = prop.getProperty("live");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return liveurl;
	}
}