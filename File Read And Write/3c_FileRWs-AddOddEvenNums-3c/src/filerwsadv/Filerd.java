package filerwsadv;

import java.io.*;

/* read the file specified in filepath, first time it reads libname.csv and returns NIE,Mysore and
 * second time it reads libbooks.csv and returns  Java,Buyya,2014,McGraHill */
public class Filerd {

    String lines="";

    public String readFromFile(String filepath) {
        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentline = "";
            String firstline="";
            int count=0;
            currentline = br.readLine();
            firstline=currentline;

            while (currentline != null) {
                lines += currentline + "\n";
                currentline = br.readLine();
                count++;
            }
            if (count==1) lines=firstline;  // if only one line dont't add newline
            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (lines);
    }

}



