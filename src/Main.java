import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("1");
        int[] inputArray1 = new int[5];
        inputArray1[0] = 1;
        inputArray1[1] = 2;
        inputArray1[2] = 3;
        inputArray1[3] = 4;
        inputArray1[4] = 5;
        float[] outputArray1 = {0, 0, 0, 0}; // sum, max, min, med
        float sum = 0;
        int maximumNumber = 2147483647;
        int minimumNumber = -2147483647; // add input to each case
        for (int number : inputArray1) {
            sum = sum + number;
            outputArray1[0] = sum;
        }
        for (int numMax : inputArray1) {
            if (numMax > minimumNumber) {
                outputArray1[1] = numMax;
            }
        }
        for (int numMin : inputArray1) {
            if (numMin < maximumNumber) {
                maximumNumber = numMin;
                outputArray1[2] = maximumNumber;
            }
        }
        for (float numMed : inputArray1) { //need check.
            numMed = sum / inputArray1.length;
            outputArray1[3] = numMed;
        }
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

        System.out.println("2");
        int[] inputArray2 = new int[5];
        inputArray2[0] = 1123;
        inputArray2[1] = 2235;
        inputArray2[2] = 3453;
        inputArray2[3] = 4646;
        inputArray2[4] = 5756;
        byte counter = 0;
        float[] outputArray2 = {0, 0, 0, 0, 0};
        for (float element : inputArray2) {
           //float percent = 0.13f;
            outputArray2[counter] = element * 0.13f; // element to percent?
            counter++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2)); //"percent = ",

        System.out.println("3");
        int[] inputArray3 = {4500, 2000, 10000, 1234, 5555};
        boolean[] outputArray3 = new boolean[5];
        byte counter1 = 0;
        for (int cash : inputArray3) {
            if (cash > 5000) { // can be simplified to outputArray3[counter1] = cash > 5000;
                outputArray3[counter1] = true;
            }  else {
                outputArray3[counter1] = false;
            }
            counter1++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

        System.out.println("4");
        int[] inputArray4 = {214134, -235, 2141, 324, -4231};
        boolean[] outputArray4 = new boolean[1];
        for (int cash : inputArray4) {
            if (cash < 0) {
                outputArray4[0] = false;
                break;
            } else {
                outputArray4[0] = true;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

        System.out.println("5");
        int[] inputArray5 = {1242, -352, 124, 24, -5};
        int[] outputArray5 = new int[1];
        for (int cash : inputArray5) {
            if (cash > 0) {
                outputArray5[0]++;
            }
        }
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}