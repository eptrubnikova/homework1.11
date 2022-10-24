import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }


    private static void task1() {
        int year = 2019;
        yearLeap(year);
    }

    private static void task2() {
        String osName = "Android";
        int clientOS = getClientOS(osName);
        int yearIssueDevace = 2020;
        int clientYear = clientDeviceYear(yearIssueDevace);
        System.out.println();
    }

    private static void task3() {
        int deliveryDistance = 109;
        int totalTimeDelivery = timeDelivery(deliveryDistance);
    }

    public static void yearLeap(int yearNumber) {
        if ((yearNumber % 4 == 0) && (yearNumber % 100 != 0) || (yearNumber % 400 == 0)) {
            System.out.println(yearNumber + " - високосный год");
            return;
        } else {
            System.out.println(yearNumber + " - не високосный год");
        }
    }

    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            System.out.print("Установите для " + name + " по ссылке0");
            return 0;
        } else {
            System.out.print("Установите для " + name + " по ссылке1");
            return 1;
        }
    }

    public static int clientDeviceYear(int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            System.out.print(" облегченную версию приложения");
            return currentYear;
        } else {
            System.out.print(" новую версию приложения");
            return currentYear;
        }
    }

    public static int timeDelivery(int totalKilometers) {
        int timeTravelCard = 0;
        for (int i = 20; ; i = i + 40) {
            timeTravelCard++;
            if (totalKilometers < i) {
                System.out.println("На доставку карты понадобится: " + timeTravelCard + " дней");
                return timeTravelCard;
            }
        }
    }
}
