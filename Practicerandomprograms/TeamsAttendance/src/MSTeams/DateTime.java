package MSTeams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {

    public static LocalDateTime gettime(String inout) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm:ss");

        LocalDateTime time = LocalDateTime.parse(inout, dtf);

        return time;
    }
}
