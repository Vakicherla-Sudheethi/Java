import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class MFileWriter {
    public static void main(String args[]) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\New folder\\Hello.txt");
            try {
                f.write("Hello, I'm Sudhi from RJY");
            } finally {
                f.close();
            }
            System.out.println("Write operation successful.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
