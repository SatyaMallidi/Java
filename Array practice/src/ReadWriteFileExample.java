import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
public class ReadWriteFileExample{
    public static void main(String[] args){
        String[] array = {"Satya","satya","satya"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file");
            writer.write("\nThis is the next line");
            for(String name:array){
                writer.write("\n" + name);
            }
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
