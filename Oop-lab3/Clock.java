
import java.util.Calendar;

public class Clock {
    public static void main(String[] args) {
        // Get the current time
        Calendar cal = Calendar.getInstance();
        Time currentTime = new Time(cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE));

        System.out.println("Initial Time: " + currentTime.toString());

        long startTime = System.currentTimeMillis();  // Start time
        int currentMinute = currentTime.getMinute();  // Store the current minute

        while (currentTime.getMinute() == currentMinute) {  // Loop until the minute changes
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - startTime >= 1000) {  // Check if 1 second has passed
                currentTime.tick();  // Call the tick method to increment the time
                System.out.println(currentTime.toString());  // Print the updated time
                startTime = currentTimeMillis;  // Reset the timer
            }
        }

        System.out.println("Program terminated. Time advanced to the next minute.");
    }
}
