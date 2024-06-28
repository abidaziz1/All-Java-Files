import java.io.*;
public class file_create {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file1.txt");
        try{
            if(f.createNewFile()){
                System.out.println("File is created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
