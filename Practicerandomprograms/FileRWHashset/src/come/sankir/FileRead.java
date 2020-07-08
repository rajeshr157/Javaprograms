package come.sankir;

import java.io.*;

public class FileRead {

    public String readFile (String filepath){

        String contents = "";
        try{

            FileReader fr = new FileReader(filepath);
            BufferedReader br =  new BufferedReader(fr);

            String currentline;

            while ((currentline = br.readLine())!=null){
                contents += currentline + "\n";
            }

            br.close();
            fr.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return contents;
    }
}
