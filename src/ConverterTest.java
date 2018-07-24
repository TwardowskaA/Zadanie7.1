public class ConverterTest {
    public static void main(String[] args) {

        CalandarConverter converter = new CalandarConverter();


        for (int i = 1; i <= 7; i++) {
            System.out.print(i + " " + "dzień tygodnia to" + " ");
            System.out.println(converter.convertDayToString(i));
        }

    }
}
