import java.io.*;
public class file_copy {
    public static void main(String[] args) {
        try{FileInputStream r= new FileInputStream("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file1.txt");
        FileOutputStream w= new FileOutputStream("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file2.txt");
        try{
            int i;
            while((i=r.read())!=-1){
                w.write((char)i);
            }
            r.close();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
    catch(FileNotFoundException e){
        System.out.println(e);
    }
    //System.out.println("File copied successfully");
}
}
