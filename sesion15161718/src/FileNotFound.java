import java.io.*;

public class FileNotFound {

    public static void main(String[] args) throws FileNotFoundException {

        File fileIn = new File("origen.txt");

        getFile(fileIn);
    }

    public static void getFile(File fileIn) throws FileNotFoundException {

        try {
            InputStream in = new FileInputStream(fileIn);
            System.out.println("File found");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
