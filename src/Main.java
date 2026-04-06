//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println("i = " + i);
        }

        for (int i = 2; i <= 17; i += 2) {
            System.out.println("Чётные числа до 17: " + i);
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println("i от большего к меньшему = " + i);
        }

        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i);
        }

        for (int i = 7; i <= 84; i += 7) {
            System.out.println(i);
        }

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        short monthSalary = 29000;
        float totalSum = 0;
        for (int i = 1; i <= 12; i++) {
            System.out.println("Месяц " + i + ", Сумма накоплений = " + (totalSum += monthSalary)); // skip the first
        }

        float totalSumPercent = 0; // I won't use vars (totalSum) from other task (8), as they are messing the results
        float monthPercent = 0.01f;
        for (int i = 1; i <= 12; i++) {
            float percent = totalSumPercent * monthPercent;
            totalSumPercent += percent;
            System.out.println("Месяц " + i + ", Сумма накоплений = " + (totalSumPercent += monthSalary));
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}