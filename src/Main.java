//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int firstFriday = 3;
        for (int i = 1; i <= 31; i++) {
            if (i >= firstFriday && (i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i +  "-е число. Необходимо подготовить отчет");
            }
        }

        int distance = 0;
        int marathonDistance = 42195;
        do {
            System.out.println("Держитесь! Осталось " + (marathonDistance - distance) + " метров!");
            distance += 500;
        } while ( distance <= marathonDistance);
        //
        int marathonTrackLength = 42195;
        for (int trackLength = 0; trackLength <= marathonTrackLength; trackLength += 500) {
            System.out.println("Держитесь! Осталось " + (marathonTrackLength - trackLength) + " метров!");
        }

        int budget = 1000;
        int day = 0;
        while (budget >= 100) {
            day++;
            if (day % 5 == 0) {
                continue;
            }
            budget -= 100;
            if (budget < 100) {
                System.out.println("You can stay for " + day + " days");
            }
        }
        //
        int budget2 = 1000;
        for (int days = 0; budget2 >= 100; days++) {
            if (days % 5 == 0) {
                continue;
            }
            budget2 -= 100;
            if (budget2 < 100) {
                System.out.println("You can stay for " + days + " days");
            }
        }

        short month = 0;
        float total = 0;
        while (true) {
            month++;
            if (month % 6 == 0) {
                total = total + (total * 0.07f); // 7% to total
            }
            total += 15000;
            System.out.println("month: " + month + ", sum: " + total);
            if (total >= 12000000) {
                break;
            }
        }

        byte charge = 20;
        short minute = 0;
        byte overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                minute++;
                System.out.println("Overheated!");
                continue;
            }
            charge += 2;
            if (overheats > 3) {
                break;
            }
            //System.out.println("min: " + minute + ", charge = " + charge + "%");
            System.out.println("Время зарядки составило " + minute + " минут");
        }
    }
}
