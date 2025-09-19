package Unit3;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\Asus\\Desktop\\KIETOOPS\\kietoops\\src\\Unit3\\db.properties");
            Properties prop = new Properties();
            prop.load(fr);
            System.out.println(prop.getProperty("user"));
            System.out.println(prop.getProperty("coupon"));
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
