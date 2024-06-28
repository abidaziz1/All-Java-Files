import java.io.*;
public class read_file {
    public static void main(String[] args) {
        try{
            FileReader f= new FileReader("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file1.txt");
            try{
                int i;
                while ((i=f.read())!=-1) {
                System.out.println((char)i);
                }}
            finally{
                System.out.println("File Closed.");
            }
        }
        catch(IOException e){
            System.out.println("File not found.");
        }
    }
}
