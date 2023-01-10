package readconfigs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
	
	public final String filePath = "/Users/pallavisadhu/Desktop/ebay/ebayAssignment/src/test/java/configfiles/Config.properties";
	Properties prop;
	
	public ConfigFileReader() throws IOException {
		File f = new File(filePath);
		FileInputStream fin = new FileInputStream(f);
		prop = new Properties();
		prop.load(fin);
		
	}
	
	public String getUrl() {
		return prop.getProperty("url");
	}
	

}
