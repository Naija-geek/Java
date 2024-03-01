public class Meeting {
    private String time;
    private String location;
    private String subject;

    // Constructor
    public Meeting(String time, String location, String subject) {
        this.time = time;
        this.location = location;
        this.subject = subject;
    }

    // Setters
    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter
    public String getSubject() {
        return subject;
    }

    // Method to print meeting details
    public void printDetails() {
        System.out.println("Meeting in " + location + " at " + time + "; Subject: " + subject + ".");
    }

    public static void main(String[] args) {
        // Example usage
        Meeting myMeeting = new Meeting("12:30", "room 205", "Examiner's meeting");
        myMeeting.printDetails();

        // Update meeting details
        myMeeting.setTime("14:00");
        myMeeting.setLocation("conference room");
        myMeeting.setSubject("Project Review");
        myMeeting.printDetails();
    }
}
