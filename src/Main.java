
public class Main {
    public static void main(String[] args) {
        Product eggs = new Product(1, "Eggs", 20, "Dairy Products");
        Product e = eggs;
        Product kefir = new Product(2, "Kefir", 30, "Dairy Products");
        Product potato = new Product(9, "Potato", 9, "Vegetables");
        Product cucumber86 = new Product(3, "Cucumber", 12, null);
        Product fish86 = new Product(3, "Fish", 25, null);

        Product[] shopCart1 = {eggs, kefir, potato};
        Product[] shopCart2 = {potato, eggs, kefir};
        Product[] shopCart3 = {eggs, potato};
        Product[] shopCartNull1 = {cucumber86, fish86, potato};
        Product[] shopCartNull2 = {kefir, eggs, fish86};

        System.out.println(eggs.toString());
        System.out.println(kefir.toString());
        System.out.println(potato.toString());

        putOutliner();

        boolean result = eggs.equals(e);
        System.out.println("Copy of eggs = " + result); // true
        result = eggs.equals(kefir);
        System.out.println("eggs and kefir equality = " + result); // false
        result = potato.equals(eggs);
        System.out.println("eggs and potato equality = " + result);
        result = potato.equals(kefir);
        System.out.println("potato and kefir equality = " + result);

        putOutliner();

        Order test01 = new Order("Viktor", shopCart1);
        Order test02 = new Order("Doof", shopCart2);
        Order t2 = test02;
        Order test03 = new Order("Platypus", shopCart3);
        Order nullTest01 = new Order("86", shopCartNull1);
        Order nullTest02 = new Order("Wacker", shopCartNull2);

        System.out.println(test01.toString());
        System.out.println(test02.toString());
        System.out.println(test03.toString());

        putOutliner();

        boolean orderResult = test01.equals(test02);
        System.out.println("test01 and test02 equality = " + orderResult);
        orderResult = test02.equals(t2);
        System.out.println("Copy of test02 = " + orderResult);
        orderResult = test03.equals(test01);
        System.out.println("test03 and test01 equality = " + orderResult);
        orderResult = test03.equals(test02);
        System.out.println("test03 and test02 equality = " + orderResult);

        putOutliner();
        System.out.println("Checking NullPointerException");
        putOutliner();

        System.out.println(nullTest01);
        System.out.println(nullTest02);
        System.out.println("Equality check: " + nullTest01.equals(nullTest02));
    }

    public static int putOutliner() {
        String outline = "================================================================================";
        System.out.println(outline);
        return 1;
    }
}