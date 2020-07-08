package filerws;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRd {

    String lines="";

    public String readFromFile(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentline = "";

            currentline = br.readLine(); // read  first line


            while (currentline != null) { // read till end of file
                lines += currentline + "\n";
                currentline = br.readLine(); // read next line

            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return (lines); // entire file content in single String
    }

}


