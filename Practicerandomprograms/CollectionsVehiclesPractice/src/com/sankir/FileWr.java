package com.sankir;

import javax.imageio.IIOException;
import java.io.*;

public class FileWr {

    public void writeFile(String filepath, String contents) {

        try {

            FileWriter fw = new FileWriter(filepath);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(contents);

            bw.close();
            fw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
