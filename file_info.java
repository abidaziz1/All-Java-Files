import java.io.*;
public class file_info {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\USER\\OneDrive\\Desktop\\Games\\file1.txt");
        if(f.exists() && !f.isDirectory()){   //checking whether the specified pathname is an existing directory
            System.out.println("File name: " + f.getName());    //getting file name
            System.out.println("Absolute path: " + f.getAbsolutePath());    //getting the absolute path of the file
            System.out.println("Writeable: " + f.canWrite());    //checking whether the file is writeable or not
            System.out.println("Readable: " + f.canRead());    //checking whether the file is readable or not
            System.out.println("File size in bytes: " + f.length());
            System.out.println("Last modified: " + f.lastModified());    //getting the last modified date of the file
        }
        else{
            System.out.println("File does not exist.. I'm sorry..!");
            return;
        }
    }
}
