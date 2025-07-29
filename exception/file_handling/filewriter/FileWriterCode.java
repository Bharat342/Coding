package exception.file_handling.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterCode {
    public static void main(String[] args) throws Exception {
        String path = "/Users/bharatnaik/Desktop/Hello/Demo.txt";

        Scanner scan = new Scanner(System.in);
//        File file = new File(path);
        FileWriter writer = null;

//        System.out.println(file.exists());

        try {
            writer = new FileWriter(path, true);

            System.out.println("Enter the word you want to give as a input : ");
            String word1 = scan.nextLine();
            String word2 = scan.nextLine();
            String word3 = scan.nextLine();

            writer.write(word1);
            writer.write(word2);
            writer.write(word3);
            writer.flush();


        } catch(Exception e) {

        }
        finally {
            scan.close();
            writer.close();
        }

    }

}
