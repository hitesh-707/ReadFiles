import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingAllTypesOfFiles {
    public static void main(String[] args) throws IOException {
        Properties prod = new Properties();
        FileInputStream fip = new FileInputStream("//Users//shrunjalmehta//IdeaProjects//ReadFiles//src//object.Properties");
        prod.load(fip);
        System.out.println(prod.getProperty("Name"));
        System.out.println(prod.getProperty("user.dir"));
    }
}


