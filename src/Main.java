//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte clientOS = 1; // 0 - iOS, 1 - android
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS != 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        short clientDeviceYear = 2015;
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите lite-версию приложения для Android по ссылке");
        } else if (clientOS != 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS != 1 && clientDeviceYear < 2015) { // or clientOS == 0
            System.out.println("Установите lite-версию приложения для iOS по ссылке");
        }

        short year = 2021; // Високосный год кратен 4 или 400, а значит делится нацело (% = 0). Кратные 100 (но не 400) - невисокосные.
        if (( year > 1584 && year % 400 == 0) || ( year > 1584 && year % 4 == 0 && year % 100 != 0)) { // (year > 1584 && ((year % 400 == 0) || ( year % 4 == 0 && year % 100 != 0)))
            System.out.println("Високосный");
        } else {
            System.out.println("Невисокосный");
        }

        byte deliveryDistance = 95; //95
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

        byte monthNumber = 1;
        switch (monthNumber) {
            case 1: //можно и так: case 12,1,2, -> sout();
            case 12:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Are you crazy?");
                break;
        }
    }
}