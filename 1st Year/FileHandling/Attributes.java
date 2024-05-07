package FileHandling;
import java.io.*;
public class Attributes {
    public static void main(String[] args) {

        File file = new File("src/Attributes.java"); // it will import the file here in this .java
        System.out.println("exist: " + file.exists()); // it will check if the file is existing
        System.out.println("path: " + file.getPath()); // it will get the path of the file
        System.out.println("length: " + file.length()); // it will chech of the length of the file
        System.out.println("isDirectory: " + file.isDirectory()); // it will check the file is leads to directory or not
        System.out.println("isFile: " + file.isFile()); // it will check the file  if it is a file
        System.out.println("canRead: " + file.canRead()); // it will check the file if it can read
    }
}
