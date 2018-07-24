public class CalandarConverter {

    private int MONDAY = 1;
    private int TUESDAY = 2;
    private int WEDNESDAY = 3;
    private int THURSDAY = 4;
    private int FRIDAY = 5;
    private int SATURDAY = 6;
    private int SUNDAY = 7;


    String convertDayToString(int dayNumber) {

        String day = "";
        switch (dayNumber) {

            case 1:
                dayNumber = 1;
                return "Poniedziałek";

            case 2:
                dayNumber = 2;
                return "Wtorek";

            case 3:
                dayNumber = 3;
                return "Sroda";

            case 4:
                dayNumber = 4;
                return "Czwartek";

            case 5:
                dayNumber = 5;
                return "Piątek";

            case 6:
                dayNumber = 6;
                return "Sobota";

            case 7:
                dayNumber = 7;
                return "Niedziela";

        }

        return day;
    }

}
