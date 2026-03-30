//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        byte nu = 127;
        short num = 32000;
        int number = 2123456789;
        long numberNumber = 999921323456789999L;
        float floatNumber = 12344321.1289346457f;
        double floatNumberFloat = 43211234.124235235623463f;
        //
        System.out.println("Значение переменной с типом byte равно " + nu);
        System.out.println("Значение переменной с типом short равно " + num);
        System.out.println("Значение переменной с типом int равно " + number);
        System.out.println("Значение переменной с типом long равно " + numberNumber);
        System.out.println("Значение переменной с типом float равно " + floatNumber);
        System.out.println("Значение переменной с типом double равно " + floatNumberFloat);

        float first = 27.12f;
        long second = 987678965549L;
        short third = 2786;
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;
        System.out.println("Init: " + first + ", " + second + ", " + third + ", " + fourth + ", " + fifth + ", " + sixth + ", " + seventh + ".");

        byte adepts1 = 23;
        byte adepts2 = 27;
        byte adepts3 = 30;
        short paperBought = 480;
        int paperForEach = paperBought / (adepts1 + adepts2 + adepts3);
        System.out.println("На каждого ученика рассчитано " + paperForEach + " листов бумаги");

        byte bottleMachineProduced2Min = 16;
        int bottleMachineProduced = bottleMachineProduced2Min / 2;
        System.out.println("За 20 минут машина произвела " + bottleMachineProduced * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottleMachineProduced * 24 + " штук бутылок");
        System.out.println("За три дня машина произвела " + bottleMachineProduced * 24 * 3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottleMachineProduced * 24 * 30 + " штук бутылок");

        byte cansBoth = 120;
        byte weUseWhite = 2;
        byte weUseBrown = 4;
        int studentRooms = cansBoth / (weUseWhite + weUseBrown);
        int cansWhite = studentRooms * weUseWhite;
        int cansBrown = studentRooms * weUseBrown;
        System.out.println("В школе, где " + studentRooms + " классов, нужно " + cansWhite + " банок белой краски и " + cansBrown + " банок коричневой краски");

        //grams
        byte banana = 80;
        float milk = 105f; // ml = 100
        byte iceCream = 100;
        byte rawEggs = 70;
        //recipe
        byte bananaQuantity = 5;
        float milkRQ = 200f; //ml
        byte iceCreamQuantity = 2;
        byte rawEggsQuantity = 4;
        //recipeGrams
        float recipeCocktailWeightG = (banana * bananaQuantity) + (milk * milkRQ) / 100 + (iceCream * iceCreamQuantity) + (rawEggs * rawEggsQuantity);
        float recipeCocktailWeightKg = recipeCocktailWeightG / 1000;
        System.out.println("Result in grams: " + recipeCocktailWeightG + ", result in kg: " + recipeCocktailWeightKg);

        byte needToSlim = 7; //kg
        short lose250 = 250; //g
        short lose500 = 500;
        int needToSlimG = needToSlim * 1000;
        int daysWithLose250 = needToSlimG / lose250;
        int daysWithLose500 = needToSlimG / lose500;
        int daysMed = (daysWithLose250 + daysWithLose500) / 2;
        System.out.println("Days if weight loss = 250: " + daysWithLose250 + ", days if weight loss = 500: " + daysWithLose500 + ", days on average: " + daysMed);

        float salaryMasha = 67760;
        float salaryDen = 83690;
        float salaryChristine = 76230;
        float salaryUpPercent = 0.1f;
        float salaryUpMasha = salaryMasha * salaryUpPercent;
        float salaryUpDen = salaryDen * salaryUpPercent;
        float salaryUpChristine = salaryChristine * salaryUpPercent;
        float salaryYearMashaBefore = salaryMasha * 12;
        float salaryYearDenBefore = salaryDen * 12;
        float salaryYearChristineBefore = salaryChristine * 12;
        salaryMasha = salaryMasha + salaryUpMasha;
        salaryDen = salaryDen + salaryUpDen;
        salaryChristine = salaryChristine + salaryUpChristine;
        float salaryYearMashaAfter = salaryMasha * 12;
        float salaryYearDenAfter = salaryDen * 12;
        float salaryYearChristineAfter = salaryChristine * 12;
        float salaryGrowthMasha = salaryYearMashaAfter - salaryYearMashaBefore;
        float salaryGrowthDen = salaryYearDenAfter - salaryYearDenBefore;
        float salaryGrowthChristine = salaryYearChristineAfter - salaryYearChristineBefore;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + salaryGrowthMasha + " рублей");
        System.out.println("Денис теперь получает " + salaryDen + " рублей. Годовой доход вырос на " + salaryGrowthDen + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristine + " рублей. Годовой доход вырос на " + salaryGrowthChristine + " рублей");

    }
}