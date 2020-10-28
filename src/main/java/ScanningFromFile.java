import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ScanningFromFile {
    public String readFromFile (String fileName) throws IOException {

       String allText = new String();

        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);
        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            String word= scanner.next();
            allText+=word;
        }
        scanner.close();
        return  allText;
    }
}
