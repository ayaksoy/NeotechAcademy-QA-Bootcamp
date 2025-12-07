package lesson32;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReading {
    public static void main(String[] args) throws IOException {
//        to read from a file:
//        1) Locate the file
        String filePath = "/Users/ahmet/development/Java/NeotechAcademy-QA-Bootcamp/Classes/JavaBasic10/configs/example.properties";
//        2) read the file using FileInputStream
        FileInputStream fis = new FileInputStream(filePath);
//        3) This step depends on the type of file we are reading
//            In our case it is a properties file
        Properties prop = new Properties();

//        load the data
        prop.load(fis);

        String name = prop.getProperty("name");
        System.out.println(name);

    }
}
