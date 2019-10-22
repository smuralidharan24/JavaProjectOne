package Config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import Learn1.OpenChromeWithFunctionsAndConfig;

public class PropertiesFile {
	static Properties properties = new Properties();

	public static void main(String[] args) {

		readPropertiesFile();
	}

	public static void readPropertiesFile() {

		InputStream input;

		try {
			input = new FileInputStream("C:/Users/Murali/eclipse-workspace/Test/src/Config/Config.properties");
			properties.load(input);
			OpenChromeWithFunctionsAndConfig.browser = properties.getProperty("browser");
			OpenChromeWithFunctionsAndConfig.SYSTEM_PROPERTY_CHROME_DRIVER = properties
					.getProperty("SYSTEM_PROPERTY_CHROME_DRIVER");
			OpenChromeWithFunctionsAndConfig.SYSTEM_PROPERTY_CHROME_PATH = properties
					.getProperty("SYSTEM_PROPERTY_CHROME_PATH");
			System.out.println(OpenChromeWithFunctionsAndConfig.browser);
			// System.out.println("Chrome Driver Key - " +
			// properties.getProperty("SYSTEM_PROPERTY_CHROME_DRIVER"));
			// System.out.println("Chrome Driver path - " +
			// properties.getProperty("SYSTEM_PROPERTY_CHROME_PATH"));
		} catch (Exception e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}

	}
}
