import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamEg {
    public static void main(String args[]) throws IOException {
        byte text[] = "hello i'm bannu babu".getBytes();
        
        ByteArrayInputStream in = new ByteArrayInputStream(text);
        byte[] buffer = new byte[1024];
        int bytesRead;
        
        File newFile = new File("C:/Users/fluff/OneDrive/Desktop/Java/output.txt");  // Correct file path
        FileOutputStream out = new FileOutputStream(newFile);
        
        while ((bytesRead = in.read(buffer)) != -1) {
            out.write(buffer, 0, bytesRead);
        }

        in.close();
        out.close();
        
        System.out.println("Data copied from ByteArrayInputStream to FileOutputStream.");
    }
}
