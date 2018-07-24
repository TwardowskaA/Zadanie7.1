public class CalandarConverter {

    private int MONDAY = 1;
    private int TUESDAY = 2;
    private int WEDNESDAY = 3;
    private int THURSDAY = 4;
    private int FRIDAY = 5;
    private int SATURDAY = 6;
    private int SUNDAY = 7;



    String convertDayToString(int dayNumber){

        String day = "";
        switch (dayNumber){
            case 1:
                dayNumber = MONDAY;
                System.out.print("Poniedziałek");
                break;
            case 2:
                dayNumber = TUESDAY;
                System.out.print("Wtorek");
                break;
            case 3:
                dayNumber = WEDNESDAY;
                System.out.print("Sroda");
                break;
            case 4:
                dayNumber = THURSDAY;
                System.out.print("Czwartek");
                break;
            case 5:
                dayNumber = FRIDAY;
                System.out.print("Piątek");
                break;
            case 6:
                dayNumber = SATURDAY;
                System.out.print("Sobota");
                break;
            case 7:
                dayNumber = SUNDAY;
                System.out.print("Niedziela");
                break;


        }
        return day;
    }

}
