public class MainApp {

    public static void main(String[] args) {

        int value = 1200;

        int count = 0;

        while (value % 10 == 0) {
            count++;

            value = value / 10;
        }

        System.out.println(value);

    }
}
