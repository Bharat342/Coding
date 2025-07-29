package exception.file_handling;

import javax.imageio.IIOException;
import java.io.File;

public class Practice {
    public static void main(String[] args) {
        String path = "/Users/bharatnaik/Desktop/Hello/";
        File file = new File(path);

//        System.out.println(file.exists());
//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());
//        System.out.println(file.getAbsoluteFile());
        /*
        try {
            file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
         */

//        file.mkdir();
//        file.delete();
//        System.out.println(file.getName());
//        System.out.println(file.getAbsolutePath());

        String[] arr = file.list();
        for(String a : arr) {
            System.out.println(a);
        }


    }
}
