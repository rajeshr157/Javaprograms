package sankir;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWr {

    public void FileWriter(String filepath, String contents) {
        try {

            FileWriter fw = new FileWriter(filepath);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(contents);

            bw.close();
            fw.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
