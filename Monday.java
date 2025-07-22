import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Monday {

    public static void main(String[] args) {
        Scanner za = new Scanner(System.in);
        MondayAlarm mondayAlarm = new MondayAlarm();

        System.out.print("Enter time for Alarm in this format (h:mm AM/PM): ");
        String inp = za.nextLine();

        mondayAlarm.setAlarm(inp);
        mondayAlarm.showAlarm();
    }
}

interface Alarm {
    void setAlarm(String time);
    void showAlarm();
}

abstract class Weekday implements Alarm {
    protected String alarmTime;

    public void setAlarm(String time) {
        this.alarmTime = time;
    }

    public void showAlarm() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h:mm a");
        LocalTime alarm = LocalTime.parse(alarmTime.toUpperCase(), formatter);
        LocalTime now = LocalTime.now();

        String mensahe = alarm.isAfter(now) ? "I'll wake you up later!" : "Alarm is set for tomorrow.";
        System.out.println(mensahe);
    }
}

class MondayAlarm extends Weekday {
    //EMPTY
}