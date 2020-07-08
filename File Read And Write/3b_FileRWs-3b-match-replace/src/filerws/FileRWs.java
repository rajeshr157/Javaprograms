// Copyright @ SanKir Technologies, 2018 - Java Programming -File Read Write.
package filerws;

import java.io.*;


// Program reads all the lines of inputfile.txt and copies to outptfile.txt
// matchfile is created with only lines containing matchword

public class FileRWs {


    public static void main(String args[]) {

        System.out.println();
        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\inputfile.txt";

        String filecontents = "";
        String wordmatch = "";
        String findreplace="";

        System.out.println(filepath);

        try {
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            String currentline = br.readLine();

            while (currentline != null) {
                System.out.println(currentline); // print each line read

                filecontents = filecontents + currentline + "\n"; // 1st task - read all lines

                if (currentline.contains("This")) // 2nd task - read lines containing specific word
                    wordmatch = wordmatch + currentline + "\n";

                currentline=currentline.replace(" ", ","); // 3rd task - replace space with ,
                findreplace = findreplace + currentline + "\n";

                currentline = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Now writing to files ");
        String filepath1 = "F:\\Sankir\\Javaprograms\\Datasets\\outputfile2.txt";
        String filepath2 = "F:\\Sankir\\Javaprograms\\Datasets\\wordmatchfile.txt";
        String filepath3 = "F:\\Sankir\\Javaprograms\\Datasets\\findreplacefile.txt";

        try {
            FileWriter fw1 = new FileWriter(filepath1); // file to write all lines
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write(filecontents);
            bw1.close();
            fw1.close();
//            fw1.write(filecontents);
//            fw1.flush();

            FileWriter fw2 = new FileWriter(filepath2); // file to write lines containing specific word
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.write(wordmatch);
            bw2.close();
            fw2.close();

            FileWriter fw3 = new FileWriter(filepath3); // file to write lines containing replaced lines
            BufferedWriter bw3 = new BufferedWriter(fw3);
            bw3.write(findreplace);
            bw3.close();
            fw3.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

        /*System.out.println();
        String s = filecontents.replace(".\n", ";");
        System.out.println(s);*/

    }


}
