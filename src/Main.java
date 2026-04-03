//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte age = 18; // input there
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он несовершеннолетний");
        } else if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }

        byte temp = -16; // input there
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else if (temp > 5) {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        short speed = 60; // input there
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        byte ageEducation = 7; // input there
        if (ageEducation >= 2 && ageEducation <= 6) {
            System.out.println("Если возраст человека равен " + ageEducation + ", то ему нужно ходить в детский сад");
        } else if (ageEducation >= 7 && ageEducation <= 17) {
            System.out.println("Если возраст человека равен " + ageEducation + ", то ему нужно ходить в школу");
        } else if (ageEducation >= 18 && ageEducation <= 24) {
            System.out.println("Если возраст человека равен " + ageEducation + ", то ему нужно ходить в универ");
        } else if (ageEducation >= 25) {
            System.out.println("Если возраст человека равен " + ageEducation + ", то ему нужно ходить в офис");
        }

        byte agePermission = 5; // input there
        if (agePermission <= 5) {
            System.out.println("Если возраст ребенка равен " + agePermission + ", то ему нельзя кататься на аттракционе");
        } else if (agePermission >= 6 && agePermission <= 14) {
            System.out.println("Если возраст ребенка равен " + agePermission + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (agePermission >= 15) {
            System.out.println("Если возраст ребенка равен " + agePermission + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        byte seatCapacityAll = 102;
        byte seatCapacitySit = 60;
        byte testPassengers = 40; // input there
        if (testPassengers < seatCapacitySit) {
            System.out.println("Место есть! Сидячие: " + (seatCapacitySit - testPassengers));
        } else if (testPassengers < seatCapacityAll) {
            System.out.println("Место есть! Стоячие: " + (seatCapacityAll - testPassengers));
        } else {
            System.out.println("Места нет...");
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