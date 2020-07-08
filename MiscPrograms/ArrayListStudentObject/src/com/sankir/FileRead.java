package com.sankir;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public String readFile(String filepath) {

        String lines = "";
        String contents = "";

        try {

            FileReader fr = new FileReader(filepath);
            BufferedReader br =new BufferedReader(fr);

            while((lines =br.readLine())!=null ){
                contents += lines + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

        return contents;
    }

}
