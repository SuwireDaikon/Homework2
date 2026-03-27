//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.println("Hello and welcome!");

        //variables
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("perro = " + dog);
        System.out.println("neko = " + cat);
        System.out.println("feuille = " + paper);

        // inconvenient or useless for this task
        //var plus4 = 4; // 4.0 paper output = 763793.0
        //

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("perron = " + dog);
        System.out.println("daineko = " + cat);
        System.out.println("une grande feuille = " + paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("perrito = " + dog);
        System.out.println("neko no mimi = " + cat);
        System.out.println("petite feuille = " + paper);


        // it works just fine, but it won't memorize new data
        //System.out.println(dog + plus4);
        //System.out.println(cat + plus4);
        //System.out.println(paper + plus4);
        //

        // it works just fine, but it won't memorize new data
        //System.out.println(dog - 3.5);
        //System.out.println(cat - 1.6);
        //System.out.println(paper - 7639);
        //

        var friend = 19;
        System.out.println("Hay un amigo in mi : " + friend);
        friend = friend * 2;
        System.out.println("Hay un amigo in mi : " + friend);
        friend = friend / 7;
        System.out.println("Or italian amico... = " + friend);

        var frog = 3.5;
        System.out.println( "kwa = " + frog);
        frog = frog * 10;
        System.out.println("kwa = " + frog);
        frog = frog / 3.5;
        System.out.println("kwa = " + frog);
        frog = frog + 4;
        System.out.println("kwa = " + frog); // ? if System.out.println("kwa = " + frog + 4), then output will be 10.04

        var fighterWeight = 78.2;
        var fighterWeight1 = 82.7;
        var weightSum = fighterWeight1 + fighterWeight;
        System.out.println("Sum of boxer's weights = " + weightSum);
        var weightDif = fighterWeight1 - fighterWeight;
        System.out.println("Difference of weights = " + weightDif);

        var remainderWeight = fighterWeight1 % fighterWeight;
        System.out.println("remainder % = " + remainderWeight); // ?

        var workHours = 640;
        var powerWorkEmploy = 8; // in hours
        var amountOfEmployers = workHours / powerWorkEmploy;
        System.out.println("Всего работников в компании - " + amountOfEmployers +  " человек ");
        var newcomers = 94;
        amountOfEmployers = amountOfEmployers + newcomers;
        workHours = amountOfEmployers * powerWorkEmploy;
        System.out.println("Если в компании работает " + amountOfEmployers + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");





        //for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        //}
    }
}