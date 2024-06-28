import java.io.*;
public class file_write {
    public static void main(String[] args) {
        try{
        FileWriter f= new FileWriter("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file1.txt");
          try{
            f.write("Hello World");
          }
          finally{
            f.close();
          } System.out.println("Successfully data wrote in file.");
        }
        catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}
