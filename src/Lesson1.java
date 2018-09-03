import java.time.LocalDate;

public class Lesson1 {
    public static void main(String[] args) {

        Lesson1 dayWeek = new Lesson1();
        dayWeek.determineDay("2018-12-23");

    }

    void determineDay(String date) {
        String result = null;
        String[] arrDate = new String[3];
        arrDate = date.split("-");
        LocalDate dayWeek = LocalDate.of(Integer.valueOf(arrDate[0]), Integer.valueOf(arrDate[1]),
                Integer.valueOf(arrDate[2]));
        result = dayWeek.getDayOfWeek().toString();

        switch (result) {
            case "MONDAY":
                System.out.println("Это понедельник****");
                break;
            case "TUESDAY":
                System.out.println("Это вторник");
                break;
            case "WEDNESDAY":
                System.out.println("Это среда");
                break;
            case "THURSDAY":
                System.out.println("Это четверг");
                break;
            case "FRIDAY":
                System.out.println("Это пятница");
                break;
            case "SATURDAY":
                System.out.println("Это суббота");
                break;
            case "SUNDAY":
                System.out.println("Это воскресенье");
                break;
        }

    }
}
