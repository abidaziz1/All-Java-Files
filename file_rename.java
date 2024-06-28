import java.io.File;
public class file_rename {
    public static void main(String[] args) {
        File f= new File("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file1.txt");
        File f1= new File("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file2.txt");
        f.renameTo(f1);
    }
}
