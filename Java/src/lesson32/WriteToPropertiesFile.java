package lesson32;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToPropertiesFile {
    public static void main(String[] args) throws IOException {
//        1) Locate the file
        String filePath = "/Users/ahmet/development/Java/NeotechAcademy-QA-Bootcamp/Classes/JavaBasic10/configs/example.properties";
//        2) Create a channel to the file using FileInputStream
        FileInputStream fis = new FileInputStream(filePath);
//        3) Create a properties object
        Properties prop = new Properties();
//        4) Load the data in the prop object
        prop.load(fis);
        System.out.println(prop);

        prop.setProperty("city", "Chicago");
        prop.setProperty("state", "IL");
        prop.setProperty("city", "Chicago");
//        what will happen if the property name doesnt exist
//        i think it will create it
        prop.setProperty("phone", "555 555 5555");
        System.out.println(prop);
        FileOutputStream fos = new FileOutputStream(filePath);
        prop.store(fos, "we updated");
    }
}
