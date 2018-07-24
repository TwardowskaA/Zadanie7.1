public class CalandarConverter {

    private final int MONDAY = 1;
    private final int TUESDAY = 2;
    private final int WEDNESDAY = 3;
    private final int THURSDAY = 4;
    private final int FRIDAY = 5;
    private final int SATURDAY = 6;
    private final int SUNDAY = 7;


    String convertDayToString(int dayNumber) {

        String day = "";
        switch (dayNumber) {

            case MONDAY:
                return "Poniedziałek";

            case TUESDAY:
                return "Wtorek";

            case WEDNESDAY:
                return "Sroda";

            case THURSDAY:
                return "Czwartek";

            case FRIDAY:
                return "Piątek";

            case SATURDAY:
                return "Sobota";

            case SUNDAY:
                return "Niedziela";

        }

        return day;
    }

}
