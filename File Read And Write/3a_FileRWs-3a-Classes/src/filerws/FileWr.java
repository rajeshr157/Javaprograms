package filerws;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWr {

    public void writeToFile(String filepath, String content) {

        try {
            FileWriter fw1 = new FileWriter(filepath); // file to write all lines
            BufferedWriter bw1 = new BufferedWriter(fw1);

            bw1.write(content); // writes to file

            bw1.close();
            fw1.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
