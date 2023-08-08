import java.io.File;

class Directory {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\Directory");

        if (!f.exists()) {
            if (f.mkdir()) {
                System.out.println("Directory created");
            } else {
                System.out.println("Not created");
            }
        }

        File f1 = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\Directory\\SubDir1");
        if (!f1.exists()) {
            if (f1.mkdir()) {
                System.out.println("Sub Directory created");
            } else {
                System.out.println("Not created");
            }
        }
    }
}


/*
C:\Users\fluff\OneDrive\Desktop\Java\6th Aug>javac Directory.java

C:\Users\fluff\OneDrive\Desktop\Java\6th Aug>java Directory
Directory created
Sub Directory created

*/