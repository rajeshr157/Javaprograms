package MSTeams;

import java.time.LocalDateTime;

public class Student extends  DateTime {

    private String name;
    private String action;
    private LocalDateTime timestamp;

    public Student() {
    }

    public Student(String name, String action, LocalDateTime timestamp) {
        this.name = name;
        this.action = action;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", action='" + action + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
