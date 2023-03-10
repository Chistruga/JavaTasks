package Utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
    public static String readPropertyFile(String fileNamePath, String propertyName) throws IOException {
        FileReader reader = new FileReader(fileNamePath);
        Properties properties = new Properties();
        properties.load(reader);
        return properties.getProperty(propertyName);
    }
}