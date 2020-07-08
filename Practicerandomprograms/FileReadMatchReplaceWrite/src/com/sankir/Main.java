package com.sankir;

public class Main {

    public static void main(String[] args) {

        FileRead filerd = new FileRead();
        FileWrite filewr = new FileWrite();

        String inputfilepath = "F:\\Sankir\\Javaprograms\\Datasets\\inputfile.txt";

        String outputfilepath1 = "F:\\Sankir\\Javaprograms\\Datasets\\outfile1.txt";
        String outputfilepath2 = "F:\\Sankir\\Javaprograms\\Datasets\\outfile2.txt";
        String outputfilepath3 = "F:\\Sankir\\Javaprograms\\Datasets\\outfile3.txt";


        String contents = filerd.readFile(inputfilepath);

        filewr.writeFile(outputfilepath1, contents);

        String lines[] = contents.split("\n");

        String contentsThis = "";
        String csep = "";

        for (String s : lines) {
            if (s.contains("This"))
                contentsThis += s + "\n";

            csep += s.replace(" ", ",") + "\n";
        }

        filewr.writeFile(outputfilepath2, contentsThis);
        filewr.writeFile(outputfilepath3, csep);

    }
}
