import java.io.File;

class DeleteFile {
    public static void main(String args[]) {
        File f = new File("C:\\Users\\fluff\\OneDrive\\Desktop\\Java\\Directory");
        if(f.delete())
{
System.out.println("deleted");
}
else
{
System.out.println("not deleted");
}
}
}

//deleted
