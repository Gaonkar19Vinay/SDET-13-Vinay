package Com.crm.vtiger.GenericUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String getPropertyData(String key) throws Throwable, IOException {
		Properties properties =new Properties();
		properties.load(new FileInputStream(Iconstant.PROPERTYFILEPATH));
		return properties.getProperty(key);
	}

}
