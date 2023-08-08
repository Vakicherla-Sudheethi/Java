import java.io.File;

class FileInfo {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\New folder\\Hello.txt");

        if (f.exists()) {
            System.out.println("File name: " + f.getName());
            System.out.println("Get file location: " + f.getAbsolutePath());
            System.out.println("File writable: " + f.canWrite());
            System.out.println("File readable: " + f.canRead());
            System.out.println("File size: " + f.length());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
