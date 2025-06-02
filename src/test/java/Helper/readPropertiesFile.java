package Helper;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class readPropertiesFile {
    private static final String PROPERTIES_FILE = "src/test/resources/data/endpoint.properties";
    public static String getProperties(String key) {
        Properties prop = new Properties();
        try(FileInputStream fis = new FileInputStream(PROPERTIES_FILE)) {
            prop.load(fis);
            return prop.getProperty(key);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
