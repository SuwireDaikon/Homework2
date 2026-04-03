//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte age = 19; // input there
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        byte temp = -16; // input there
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        short speed = 120; // input there
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        byte ageEdu = 15; // input there
        if (ageEdu >= 2 || ageEdu <= 6) {
            System.out.println("Если возраст человека равен " + ageEdu + ", то ему нужно ходить в детский сад");
        } else if (ageEdu > 7 || ageEdu <= 17) {
            System.out.println("Если возраст человека равен " + ageEdu + ", то ему нужно ходить в школу");
        } else if (ageEdu > 18 || ageEdu <= 24) {
            System.out.println("Если возраст человека равен " + ageEdu + ", то ему нужно ходить в универ");
        } else if (ageEdu > 25) {
            System.out.println("Если возраст человека равен " + ageEdu + ", то ему нужно ходить в офис");
        }

        byte ageAllowed = 13; // input there
        if (ageAllowed < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (ageAllowed >=5 || ageAllowed <= 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (ageAllowed > 15) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        byte seatCapacityAll = 102; // 102
        byte seatCapacitySit = 60; // 60
        int seatCapacityStand = seatCapacityAll - seatCapacitySit; //42
           if (seatCapacitySit == 60 && seatCapacityStand == 42) {
            System.out.println("Места нет...");
        } else if (seatCapacitySit <= 59 || seatCapacityStand <= 41) {
            System.out.print("Место есть! ");
            if (seatCapacitySit <= 59) {
                System.out.println("Сидячее. ");
            } else if (seatCapacityStand <= 41) {
                System.out.println("Стоячее. ");
            }
        }

        int one = 12; // input there
        int two = 124;
        int three = -134;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else if (three >= one && three >= one) {
            System.out.println(three);
        }
    }
}