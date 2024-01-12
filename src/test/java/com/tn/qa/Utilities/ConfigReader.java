package com.tn.qa.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	public static Properties prop;
	public static FileInputStream ip;

	public static Properties initializePropertiesFile() throws Exception {
		prop = new Properties();
		ip = new FileInputStream("C:\\Users\\sajid\\advance_eclipse-workspace\\BDD_CUCUMBER_PROJECT\\src\\test\\resources\\config\\config.properties");

		return prop;
	}

}
