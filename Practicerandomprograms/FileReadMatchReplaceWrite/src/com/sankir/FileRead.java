package com.sankir;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public String readFile(String filepath) {
        String lines = "";

        try {

            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            String currentline = br.readLine();
            while (currentline != null) {
                lines += currentline + "\n";
                currentline = br.readLine();
            }

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;

    }

}
