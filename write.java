import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class write {
    public static void main(String[] args) {
        //How to Write a file using java(4 popular option)
        
        //FileWriter = Good for small or medium-sized text files
        //BufferedWriter = Better Performance for large amounts of text
        // PrintWriter = Best for structured data, like reports or ogs
        // FileOutputStream = Best for binary files(e.g., images, audio files)

        String filePath = "C:\\Users\\sahil\\OneDrive\\Documents\\Desktop\\test.txt";
        String textContent = """
                 JACK OF ALL TRADES
                 MASTER OR NONE,
                 OFTEN BETTER THAN ONE
                """;
        String yourIntro = "Hello My name is Ishu Hada\nI am student at nims university\nI Hate myself";

        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(textContent);
            writer.write(yourIntro);
            System.out.println("File has been written");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }
        catch(IOException e){
            System.out.println("Could not write file");
        }
    }
}
