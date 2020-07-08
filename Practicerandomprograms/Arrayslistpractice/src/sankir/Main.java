package sankir;

public class Main {

    public static void main(String[] args) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\vehiclesin.txt";
        String filecontents = "";

        FileRd frd = new FileRd();
        filecontents = frd.filereader(filepath);

        System.out.println("The lines read from file are: ");
        System.out.println(filecontents);

        System.out.println("Writing to file: ");
        String filepathw = "F:\\Sankir\\Javaprograms\\Datasets\\vehiclesout.txt";

        FileWr fw = new FileWr();
        fw.FileWriter(filepathw, filecontents);

    }

}
