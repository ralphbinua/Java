package FileHandling;
import java.io.*;
import java.util.Scanner;

public class OutputFile {
     static Scanner input;
     static PrintWriter output;
    
    public static void openFile() throws FileNotFoundException
    {
        input = new Scanner(new FileReader("../Java/MyProjects/src/FileHandling/SampleText.txt"));
        output = new PrintWriter("../Java/MyProjects/src/FileHandling/SampleOutputText.txt");
    }

    public static void closeFile() throws FileNotFoundException
    {
        input.close();
        output.close();
    }
    public static void main(String[] args) throws FileNotFoundException {
        openFile(); 
        File file = new File("../Java/MyProjects/src/FileHandling/SampleText.txt");
    
        int wordCount = 0; 
        
        try{
            FileReader fileRead = new FileReader(file);
            BufferedReader read = new BufferedReader(fileRead);
    
            String line;
            while((line = read.readLine()) != null){
                String[] words = line.split("\\s+"); 
                wordCount += words.length; 
                output.println(line);
            }
            read.close();
        }
    
        catch(IOException i){
            i.printStackTrace();
        }
        
        output.println("Number of words: " + wordCount); 
        output.println("path: " + file.getPath()); 
        output.println("length: " + file.length()); 
        closeFile(); 
    }
}