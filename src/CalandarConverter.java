public class CalandarConverter {

    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;


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
