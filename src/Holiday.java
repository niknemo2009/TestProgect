
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Holiday {
    private static Set<LocalDate> holidays = new TreeSet();

//    static {
//
//    }

    public void addHoliday(LocalDate date) {
        holidays.add(date);
    }

    public void delHoliday(LocalDate date) {
        holidays.remove(date);
    }

    public boolean isHoliday(LocalDate date) {
       boolean result = false;
        for (LocalDate temp : holidays) {
            if (date.equals(temp)) {
               result = true;
            }
            break;
        }
        return result;
    }

    public void spisokHoliday() {
        System.out.println(holidays);
    }

    public void holidayPeriod(LocalDate start, LocalDate stop) {

    }

    public void replaseHoliday(LocalDate date) {
        for (LocalDate temp : holidays) {
            if (date.equals(temp)) {
               holidays.remove(date);
            }
            break;
        }
    }

    public static void main(String[] args) {
        Holiday hol1 = new Holiday();


        hol1.addHoliday(LocalDate.of(2018, 12, 23));
        hol1.addHoliday(LocalDate.of(2018, 8, 24));
        hol1.addHoliday(LocalDate.of(2018, 9, 1));
//        hol1.delHoliday(LocalDate.of(2018, 8, 24));
        System.out.println(hol1.isHoliday(LocalDate.of(2018, 8, 25)));

        System.out.println(holidays);
    }
}


