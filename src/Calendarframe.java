import java.util.Calendar;
import java.util.Locale;

public class Calendarframe {
    public void Calendar(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);

        int startDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("--------------------" + year + "년" + "  " + calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()) + "---------------------");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 1; i < startDayOfWeek; i++) {
            System.out.print("\t");
        }

        for (int day = 1; day <= maxDayOfMonth; day++) {
            System.out.printf("%d\t", day);

            if (startDayOfWeek == Calendar.SATURDAY) {
                System.out.println();
                startDayOfWeek = Calendar.SUNDAY;
            } else {
                startDayOfWeek++;
            }
        }

        System.out.println();
    }
}