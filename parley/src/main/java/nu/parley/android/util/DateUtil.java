package nu.parley.android.util;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public final class DateUtil {

    public static boolean isSameDay(Date date1, Date date2) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.setTime(date1);
        calendar2.setTime(date2);

        return calendar1.get(Calendar.DAY_OF_YEAR) == calendar2.get(Calendar.DAY_OF_YEAR) &&
                calendar1.get(Calendar.YEAR) == calendar2.get(Calendar.YEAR);
    }

    public static String formatTime(Date date) {
        return DateFormat.getTimeInstance(DateFormat.SHORT).format(date);
    }

    public static String formatDate(Date date) {
        return DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
    }
}
