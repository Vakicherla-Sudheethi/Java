import java.io.File;

class RenameFile {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\New folder\\Hello.txt");
        File r = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\New folder\\bellowwww.txt");

        if (f.exists()) {
            System.out.println(f.renameTo(r));
        } else {
            System.out.println("File not found");
        }
    }
}
