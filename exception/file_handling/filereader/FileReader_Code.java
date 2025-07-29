package exception.file_handling.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Code {
    public static void main(String[] args) {
        String path = "/Users/bharatnaik/Desktop/Hello/Demo.txt";

        FileReader reader = null;
        char[] arr = new char[100];

        try {
            reader = new FileReader(path);

            System.out.println(reader.read(arr));
            System.out.println(arr);

            reader.close();
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException f) {
            f.printStackTrace();
        } catch (Exception g) {
            g.printStackTrace();
        }
    }
}
