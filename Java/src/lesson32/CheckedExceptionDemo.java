package lesson32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath + "/extra/demo.properties";
        System.out.println(filePath);
        try {
            FileInputStream fis = new FileInputStream(filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
