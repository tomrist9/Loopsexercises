package lesson9;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.WeekFields;
public class CalendarMaximumDate {



        public static void main(String[] args) {
            // Get the current date
            LocalDate currentDate = LocalDate.now();

            // Get the maximum values of year, month, week, and date
            int maxYear = currentDate.lengthOfYear();
            int maxMonth = Month.values().length;
            WeekFields weekFields = WeekFields.ISO;
            int maxWeek = currentDate.get(weekFields.weekOfWeekBasedYear());

            int maxDate = currentDate.lengthOfMonth();

            // Print the maximum values
            System.out.println("Maximum Year: " + maxYear);
            System.out.println("Maximum Month: " + maxMonth);
            System.out.println("Maximum Week: " + maxWeek);
            System.out.println("Maximum Date: " + maxDate);
        }
    }
