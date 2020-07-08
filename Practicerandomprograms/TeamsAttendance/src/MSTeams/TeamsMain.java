package MSTeams;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TeamsMain {

    public static void main(String[] args) {

        String filepath = "F:\\Sankir\\Javaprograms\\Datasets\\FMAttendanceList.csv";

        FileRead fr = new FileRead();
        String filecontents = fr.readFile(filepath);


        String[] lines = filecontents.split("\n");


        ArrayList<String> lineslist = new ArrayList<>();
        lineslist.addAll(Arrays.asList(lines));

        ArrayList<Student> studentslog = new ArrayList<>();

        DateTime time = new DateTime();

        int count = 0;

        System.out.println(lineslist.size());

        for (String line : lineslist) {
            String[] values = line.split("\t");
            count++;

            System.out.println("Count: " + count);
            System.out.println(values[2]);
            Student sobj = new Student(values[0], values[1], Student.gettime(values[2]));
            studentslog.add(sobj);
        }


        System.out.println("Count: " + count);

        studentslog.forEach(record -> {
            System.out.println(record);
        });

        System.out.println("Size: " + studentslog.size());
        System.out.println();
    }
}
