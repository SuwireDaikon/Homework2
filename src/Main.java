import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        checkYear(2015);
        checkVersion(0, 2013);
        //checkVersion(1, 2026);
        calculateDelivery(95);
    }

    public static String checkYear(int year) {
        if ((year > 1584 && year % 400 == 0) || (year > 1584 && year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Год " + year + " — високосный");
        } else {
            System.out.println("Год " + year + " — невисокосный");
        }
        return ("Nope");
    }

    public static String checkVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else if (clientOS != 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS != 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        }
        return ("Не-а");
    }

    public static String calculateDelivery(int deliveryDistance) {
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Срок доставки: " + deliveryDays + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Срок доставки: " + deliveryDays + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = deliveryDays + 2;
            System.out.println("Срок доставки: " + deliveryDays + " дня");
        } else {
            System.out.println("Доставки нет");
        }
        return ("Не-а");
    }
}